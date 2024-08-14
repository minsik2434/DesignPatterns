package remote_controller;

public class SimpleRemoteControl {
    // 기기를 제어할 슬롯, 이 슬롯1개로 하나의 기기를 제어한다
    Command slot;
    public SimpleRemoteControl() {}

    //슬롯을 가지고 제어할 명령을 설정하는 메서드 -> LightOnCommand 의 기능은 light 객체의 on 메서드를 호출하는 객체
    //이 메서드를 사용해서 얼마든지 리모컨 버튼의 기능을 바꿀 수 있다 -> LightOffCommand(불 끄기) 객체를 넣으면 불 끄는 명령을 수행한다
    public void setCommand(Command command){
        slot = command;
    }

    //이 메서드를 호출 시 slot 의 execute() 명령이 수행된다
    // buttonWasPressed()가 호출되기 전까지 SimpleRemoteControl 이 해당 명령을 들고있음
    public void buttonWasPressed(){
        slot.execute();
    }
}
