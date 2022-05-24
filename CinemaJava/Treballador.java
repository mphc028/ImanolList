package CinemaJava;
public class Treballador extends Persona
{
    private String carrec_treb;
    private float salari_treb;

    
    public Treballador(String carrec_treb, float salari_treb) {
        this.carrec_treb = carrec_treb;
        this.salari_treb = salari_treb;
    }
    public Treballador(String nom, Adressa adressa, String telefon, String correo, int edat, String carrec_treb,
            float salari_treb) {
        super(nom, adressa, telefon, correo, edat);
        this.carrec_treb = carrec_treb;
        this.salari_treb = salari_treb;
    }
    public String getCarrec_treb() {
        return carrec_treb;
    }
    public void setCarrec_treb(String carrec_treb) {
        this.carrec_treb = carrec_treb;
    }
    public float getSalari_treb() {
        return salari_treb;
    }
    public void setSalari_treb(float salari_treb) {
        this.salari_treb = salari_treb;
    }
    @Override
    public String toString() {
        return super.toString()+"Treballador [carrec_treb=" + carrec_treb + ", salari_treb=" + salari_treb + "]";
    }

    
}
