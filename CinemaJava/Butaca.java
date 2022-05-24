package CinemaJava;
public class Butaca 
{
    private int Butaca;
    private int num_fila;
    private int num_seient;
    public Butaca(int butaca, int num_fila, int num_seient) {
        Butaca = butaca;
        this.num_fila = num_fila;
        this.num_seient = num_seient;
    }
    public int getButaca() {
        return Butaca;
    }
    public void setButaca(int butaca) {
        Butaca = butaca;
    }
    public int getNum_fila() {
        return num_fila;
    }
    public void setNum_fila(int num_fila) {
        this.num_fila = num_fila;
    }
    public int getNum_seient() {
        return num_seient;
    }
    public void setNum_seient(int num_seient) {
        this.num_seient = num_seient;
    }
    
    @Override
    public String toString() {
        return "Butaca [Butaca=" + Butaca + ", num_fila=" + num_fila + ", num_seient=" + num_seient + "]";
    }
    
}
