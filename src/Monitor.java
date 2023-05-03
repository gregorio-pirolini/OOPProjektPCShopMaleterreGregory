public class Monitor extends Produkt {

    private int zoll;

    public Monitor(String marke, String modell, double preis, int zoll) {
        super(marke, modell, preis);
        this.zoll = zoll;
    }

    public int getZoll() {
        return zoll;
    }

    public void setZoll(int zoll) {
        this.zoll = zoll;
    }
}
