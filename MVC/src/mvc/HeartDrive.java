package mvc;

public class HeartDrive {
    public static void main(String[] args) {
        HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
