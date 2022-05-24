package CinemaJava;
public class Adressa {
    private String carrer;
    private String poblacio;
    private String codi_postal;
    public Adressa(String carrer, String poblacio, String codi_postal) {
        this.carrer = carrer;
        this.poblacio = poblacio;
        this.codi_postal = codi_postal;
    }
    public String getCarrer() {
        return carrer;
    }
    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }
    public String getPoblacio() {
        return poblacio;
    }
    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }
    public String getCodi_postal() {
        return codi_postal;
    }
    public void setCodi_postal(String codi_postal) {
        this.codi_postal = codi_postal;
    }
    @Override
    public String toString() {
        return "Adressa [carrer=" + carrer + ", codi_postal=" + codi_postal + ", poblacio=" + poblacio + "]";
    }

    
}
