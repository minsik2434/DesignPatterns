package remote_controller4.command;

import remote_controller4.CeilingFan;
import remote_controller4.Command;

public class CeilingFanOffCommand implements Command {
    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    CeilingFan ceilingFan;
    int prevSpeed;
    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        if(prevSpeed == CeilingFan.HIGH){
            ceilingFan.high();
        } else if(prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW){
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}
