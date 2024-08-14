package remote_controller2.command;


import remote_controller2.Command;
import remote_controller2.Light;

public class LightOnCommand implements Command {
    Light light;
    @Override
    public void execute() {
        light.on();
    }

    public LightOnCommand(Light light){
        this.light = light;
    }

}
