package CinemaJava;
public class Pellicula {
    private String titol;
    private String director;
    private String restriccio;
    public Pellicula(String titol, String director, String restriccio) {
        this.titol = titol;
        this.director = director;
        this.restriccio = restriccio;
    }
    public String getTitol() {
        return titol;
    }
    public void setTitol(String titol) {
        this.titol = titol;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getRestriccio() {
        return restriccio;
    }
    public void setRestriccio(String restriccio) {
        this.restriccio = restriccio;
    }
    @Override
    public String toString() {
        return "Pellicula [director=" + director + ", restriccio=" + restriccio + ", titol=" + titol + "]";
    } 
}
