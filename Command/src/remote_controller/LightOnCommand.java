package remote_controller;

public class LightOnCommand implements Command{
    Light light;
    //execute()메서드는 remote_controller.Light 객체의 on 메서드를 호출
    @Override
    public void execute() {
        light.on();
    }

    //생성자에 이 커맨드 객체로 제어할 조명(주방장에게 시킬 메뉴)정보가 전달된다
    public LightOnCommand(Light light){
        this.light = light;
    }
}
