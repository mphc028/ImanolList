package CinemaJava;
public class Sessio {
    private String data_session;
    private Pellicula pellicula;
    private Sala sala;
    public Sessio(String data_session, Pellicula pellicula, Sala sala) {
        this.data_session = data_session;
        this.pellicula = pellicula;
        this.sala = sala;
    }
    public String getData_session() {
        return data_session;
    }
    public void setData_session(String data_session) {
        this.data_session = data_session;
    }
    public Pellicula getPellicula() {
        return pellicula;
    }
    public void setPellicula(Pellicula pellicula) {
        this.pellicula = pellicula;
    }
    public Sala getSala() {
        return sala;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
    }
    @Override
    public String toString() {
        return "Sessio [data_session=" + data_session + ", pellicula=" + pellicula + ", sala=" + sala + "]";
    }
    

}
