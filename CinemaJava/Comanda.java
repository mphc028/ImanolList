package CinemaJava;

public class Comanda {

    List<Producte> productes = new List<Producte>(Producte[].class, 0);
    float preu_comanda;
    
    public Comanda() {
    }

    public Comanda(List<Producte> productes, float preu_comanda) {
        this.productes = productes;
        this.preu_comanda = preu_comanda;
    }

    public List<Producte> getProductes() {
        return productes;
    }

    public void setProductes(List<Producte> productes) {
        this.productes = productes;
    }

    public float getPreu_comanda() {
        return preu_comanda;
    }

    public void setPreu_comanda(float preu_comanda) {
        this.preu_comanda = preu_comanda;
    }

    @Override
    public String toString() {
        return "Comanda [Preu_comanda=" + preu_comanda + "\n" + "Productes=" + ArraysUtils.toString(productes.getList()) + "]";
    }
}