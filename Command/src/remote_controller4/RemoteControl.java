package remote_controller4;

import remote_controller4.command.NoCommand;

public class RemoteControl {
    // 이 인보커는 7개의 on 명령과 7개의 off 명령을 수행 가능
    Command[] onCommands;
    Command[] offCommands;
    //방금 누른 command 를 저장
    Command undoCommand;

    //생성자는 각각 on off 배열의 인스턴스를 만들고 초기화 하는 역할만 함
    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i=0; i<7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    // 몇번째 슬롯에 on 커맨드와 off 커맨드를 지정하기 위한 setter 메서드
    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    //함수 호출시 onCommand[slot].execute()가 호출되고 undoCommand 에 방금 누른 버튼 명령이 저장됨
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    //함수 호출시 offCommand[slot].execute()가 호출되고 undoCommand 에 방금 누른 버튼 명령이 저장됨
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    //방금 누른 버튼 Command 의 undo()호출
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    public String toString(){
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n-------- 리모컨 -------\n");
        for(int i=0; i<onCommands.length; i++){
            stringBuff.append("[slot " + i + "]" +
                    onCommands[i].getClass().getName() + "   "
                    + offCommands[i].getClass().getName() +"\n");
        }

        return stringBuff.toString();
    }
}
