package remote_controller4;

public interface Command {
    public void execute();
    public void undo();
}
