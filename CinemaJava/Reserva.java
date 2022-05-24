package CinemaJava;
public class Reserva {
    private Sessio sessio;
    private Butaca butaca;
    public Reserva(Sessio sessio, Butaca butaca) {
        this.sessio = sessio;
        this.butaca = butaca;
    }
    public Sessio getSessio() {
        return sessio;
    }
    public void setSessio(Sessio sessio) {
        this.sessio = sessio;
    }
    public Butaca getButaca() {
        return butaca;
    }
    public void setButaca(Butaca butaca) {
        this.butaca = butaca;
    }
    @Override
    public String toString() {
        return "Reserva [butaca=" + butaca + ", sessio=" + sessio + "]";
    }
}
