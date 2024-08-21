package mvc;

public class DJDrive {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controllerInterface = new BeatController(model);
    }
}
