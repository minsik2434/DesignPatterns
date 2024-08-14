package remote_controller2.command;

import remote_controller2.Command;
import remote_controller2.Stereo;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;
    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }
}
