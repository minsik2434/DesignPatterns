package facade;

import facade.equipment.*;

public class HomeTheaterDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        StreamingPlayer streamingPlayer = new StreamingPlayer();
        Projector projector = new Projector();
        TheaterLights theaterLights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popcornPopper = new PopcornPopper();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(
                amplifier,tuner,streamingPlayer,projector,theaterLights,screen,popcornPopper);

        homeTheaterFacade.watchMovie("영화 이름");
        homeTheaterFacade.endMovie();
    }
}
