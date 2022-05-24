package CinemaJava;
public class Beguda extends Producte 
{
    private float volum;

    public Beguda(String nom_prod, float preu, float volum) {
        super(nom_prod, preu);
        this.volum = volum;
    }

    public float getVolum() {
        return volum;
    }

    public void setVolum(float volum) {
        this.volum = volum;
    }

    @Override
    public String toString() {
        return super.toString()+"Beguda [volum=" + volum + "]";
    }
}
