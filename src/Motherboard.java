public class Motherboard extends Produkt{

    private String formFaktor;

    public Motherboard(String marke, String modell, double preis, String formFaktor) {
        super(marke, modell, preis);
        this.formFaktor = formFaktor;
    }

    public String getFormFaktor() {
        return formFaktor;
    }

    public void setFormFaktor(String formFaktor) {
        this.formFaktor = formFaktor;
    }
}
