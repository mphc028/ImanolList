package CinemaJava;

import java.util.Arrays;

public class Sala {
    private Butaca[] butaques;

    public Sala(Butaca[] butaques) {
        this.butaques = butaques;
    }

    public Butaca[] getButaques() {
        return butaques;
    }

    public void setButaques(Butaca[] butaques) {
        this.butaques = butaques;
    }

    @Override
    public String toString() {
        return "Sala [butaques=" + Arrays.toString(butaques) + "]";
    }
}
