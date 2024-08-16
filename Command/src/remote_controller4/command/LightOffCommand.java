package remote_controller4.command;

import remote_controller4.Command;
import remote_controller4.Light;

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
