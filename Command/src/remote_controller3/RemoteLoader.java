package remote_controller3;

import remote_controller2.command.*;
import remote_controller3.command.CeilingFanHighCommand;
import remote_controller3.command.CeilingFanMediumCommand;
import remote_controller3.command.CeilingFanOffCommand;
import remote_controller3.command.LightOffCommand;
import remote_controller3.command.LightOnCommand;

public class RemoteLoader {
    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(2,ceilingFanMedium,ceilingFanOff);

        // 이때 undoCommand 는 LightOnCommand 임
        remoteControl.onButtonWasPushed(0);
        // 이때 undoCommand 는 LightOffCommand 임
        remoteControl.offButtonWasPushed(0);
        // undoCommand 가 LightOffCommand 이고 LightOffCommand 의 undo()를 호출
        // -> LightOffCommand 의 undo는 light.on();
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();


    }
}
