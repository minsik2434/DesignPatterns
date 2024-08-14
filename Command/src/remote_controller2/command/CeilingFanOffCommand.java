package remote_controller2.command;

import remote_controller2.CeilingFan;
import remote_controller2.Command;

public class CeilingFanOffCommand implements Command {

    CeilingFan ceilingFan;
    @Override
    public void execute() {
        ceilingFan.off();
    }

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
}
