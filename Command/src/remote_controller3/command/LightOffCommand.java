package remote_controller3.command;

import remote_controller3.Command;
import remote_controller3.Light;

public class LightOffCommand implements Command {
    Light light;
    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }

    public LightOffCommand(Light light) {
        this.light= light;
    }
}
