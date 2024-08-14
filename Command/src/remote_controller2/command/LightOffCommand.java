package remote_controller2.command;

import remote_controller2.Command;
import remote_controller2.Light;

public class LightOffCommand implements Command {
    Light light;
    @Override
    public void execute() {
        light.off();
    }

    public LightOffCommand(Light light) {
        this.light= light;
    }
}
