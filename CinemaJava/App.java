package CinemaJava;
public class App {
    
    static List<Client> clients = new List<Client>(Client[].class, 0);
    static List<Sala> sales = new List<Sala>(Sala[].class, 0);
    static List<Sessio> sessions = new List<Sessio>(Sessio[].class, 0);
    static List<Pellicula> pellicules = new List<Pellicula>(Pellicula[].class, 0);
    static List<Butaca> butaques = new List<Butaca>(Butaca[].class, 0);
    static List<Producte> productesBotiga = new List<Producte>(Producte[].class, 0);
    
    public static void main(String[] args) 
    {
        butaques.add(new Butaca(1, 1, 1));
        productesBotiga.add(new Beguda("Pepsi", 1.5f, .5f));
        productesBotiga.add(new Menjar("Popcorn", 5f, .5f));
        pellicules.add(new Pellicula("Shrek", "Martin Scorcesse", "A"));
        sales.add(new Sala(butaques.getList()));
        sessions.add(new Sessio("19-08-2020",pellicules.get(0), sales.get(0)));

        clients.add(new Client("Pablo", new Adressa("a", "a", "08458"), "99999999", "correo@gmol.com", 19, new List<Comanda>(Comanda[].class, 0) , new List<Reserva>(Reserva[].class, 0), 0));
        
        clients.get(0).reserves.add(new Reserva(sessions.get(0), sessions.get(0).getSala().getButaques()[0]));

        System.out.println(clients.toString());    


        // clients.get(0).comandes.get(0).productes.add(productesBotiga.get(0));
        // clients.get(0).comandes.get(0).productes.add(productesBotiga.get(1));
 
    }
}
