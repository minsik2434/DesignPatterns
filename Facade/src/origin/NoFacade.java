package origin;

public class NoFacade {
    public static void main(String[] args) {
        PopcornPopper popcornPopper = new PopcornPopper();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();

        popcornPopper.on();
        popcornPopper.pop();

        lights.dim();
        screen.down();


    }
}