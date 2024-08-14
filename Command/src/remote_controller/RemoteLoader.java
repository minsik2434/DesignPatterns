package remote_controller;

public class RemoteLoader {
    public static void main(String[] args) {
        //remote 가 인보커 역할을 한다
        SimpleRemoteControl remote = new SimpleRemoteControl();
        //요청을 처리할 객체를 생성
        Light light = new Light();
        //커맨드 객체를 생성, 이때 리시버를 전달함 -> 요청을 처리할 객체를 전달
        LightOnCommand lightOn = new LightOnCommand(light);
        //커맨드 객체를 인보커에게 전달
        remote.setCommand(lightOn);
        //인보커가 execute() == buttonWasPressed()를 실행 하면 리시버(light)객체가 행동을 수행함
        // (커맨드 객체는 LightOnCommand -> light.on() 명령(행동)이 지정되어 있고 이를 리시버가 실행함)
        remote.buttonWasPressed();

    }
}