package CinemaJava;

public class Persona {
    private String nom = null;
    private Adressa adressa = null;
    private String telefon = null;
    private String correo = null;
    private int edat = 0;

    public Persona() {
    }

    public Persona(String nom, Adressa adressa, String telefon, String correo, int edat) {
        this.nom = nom;
        this.adressa = adressa;
        this.telefon = telefon;
        this.correo = correo;
        this.edat = edat;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Adressa getAdressa() {
        return adressa;
    }
    public void setAdressa(Adressa adressa) {
        this.adressa = adressa;
    }
    public String getTelefon() {
        return telefon;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public int getEdat() {
        return edat;
    }
    public void setEdat(int edat) {
        this.edat = edat;
    }
    @Override
    public String toString() {
        return "Persona [adressa=" + adressa + ", correo=" + correo + ", edat=" + edat + ", nom=" + nom + ", telefon="
                + telefon + "]";
    }
}
