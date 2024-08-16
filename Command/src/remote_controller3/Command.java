package remote_controller3;

public interface Command {
    public void execute();
    public void undo();
}
