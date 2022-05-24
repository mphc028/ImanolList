package CinemaJava;
public class Menjar extends Producte {
    private float pes;

    public Menjar(String nom_prod, float preu, float pes) {
        super(nom_prod, preu);
        this.pes = pes;
    }

    public float getPes() {
        return pes;
    }

    public void setPes(float pes) {
        this.pes = pes;
    }

    @Override
    public String toString() {
        return super.toString()+"Menjar [pes=" + pes + "]";
    }
}