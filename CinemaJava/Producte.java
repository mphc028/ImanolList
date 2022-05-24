package CinemaJava;

public class Producte {
    private String nom_prod;
    private float preu;
    public Producte(String nom_prod, float preu) {
        this.nom_prod = nom_prod;
        this.preu = preu;
    }
    public String getNom_prod() {
        return nom_prod;
    }
    public void setNom_prod(String nom_prod) {
        this.nom_prod = nom_prod;
    }
    public float getPreu() {
        return preu;
    }
    public void setPreu(float preu) {
        this.preu = preu;
    }
    @Override
    public String toString() {
        return "Producte [nom_prod=" + nom_prod + ", preu=" + preu + "]";
    }
}
