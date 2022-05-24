package CinemaJava;

public class Client extends Persona {

    List<Comanda> comandes = new List<Comanda>(Comanda[].class, 0);
    List<Reserva> reserves = new List<Reserva>(Reserva[].class, 0);
    float saldo_client = 0;
    
    public Client(String nom, Adressa adressa, String telefon, String correo, int edat, List<Comanda> productes,
            List<Reserva> reserves, float saldo_client) {
        super(nom, adressa, telefon, correo, edat);
        this.comandes = productes;
        this.reserves = reserves;
        this.saldo_client = saldo_client;
    }
    public List<Comanda> getProductes() {
        return comandes;
    }
    public void setProductes(List<Comanda> productes) {
        this.comandes = productes;
    }
    public List<Reserva> getReserves() {
        return reserves;
    }
    public void setReserves(List<Reserva> reserves) {
        this.reserves = reserves;
    }
    public float getSaldo_client() {
        return saldo_client;
    }
    public void setSaldo_client(float saldo_client) {
        this.saldo_client = saldo_client;
    }

    @Override
    public String toString() {
        return super.toString() + ArraysUtils.toString(comandes.getList()) + ArraysUtils.toString(reserves.getList())  + ", saldo_client=" + saldo_client;
    }
    
}