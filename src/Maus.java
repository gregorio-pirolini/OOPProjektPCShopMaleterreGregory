public class Maus extends Produkt{

    private String Farbe;

    public Maus(String marke, String modell, double preis, String farbe) {
        super(marke, modell, preis);
        Farbe = farbe;
    }

    public String getFarbe() {
        return Farbe;
    }

    public void setFarbe(String farbe) {
        Farbe = farbe;
    }
}
