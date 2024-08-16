package remote_controller4.command;


import remote_controller4.Command;
import remote_controller4.Light;

public class LightOnCommand implements Command {
    Light light;
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }

    public LightOnCommand(Light light){
        this.light = light;
    }

}
