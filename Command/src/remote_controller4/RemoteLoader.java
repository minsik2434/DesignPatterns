package remote_controller4;

import remote_controller4.command.CeilingFanOffCommand;
import remote_controller4.command.*;
import remote_controller4.command.LightOnCommand;


public class RemoteLoader {
    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);

        LightOffCommand lightOff = new LightOffCommand(livingRoomLight);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        MacroCommand macroOn = new MacroCommand(new Command[]{lightOn, ceilingFanHigh, stereoOn});
        MacroCommand macroOff = new MacroCommand(new Command[]{lightOff, ceilingFanOff, stereoOff});

        remoteControl.setCommand(0, macroOn, macroOff);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

    }
}
