public class Tastatur extends Produkt{

    private boolean wireless;

    public Tastatur(String marke, String modell, double preis, boolean wireless) {
        super(marke, modell, preis);
        this.wireless = wireless;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
}
