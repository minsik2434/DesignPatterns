package remote_controller4.command;

import remote_controller4.Command;

public class MacroCommand implements Command {
    Command[] commands;

    //여러개의 Command 를 배열로 받아 생성
    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    //execute() 를 호출하면 commands 의 명령들 모두 execute()함
    @Override
    public void execute() {
        for(int i=0; i<commands.length; i++){
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for(int i=0; i<commands.length; i++){
            commands[i].undo();
        }
    }
}
