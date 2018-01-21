public class Buch {

    private String titel;
    private double preis;
    private long barcode;
    private int seiten;
    private String autor;
    private int auflage;

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public long getBarcode() {
        return barcode;
    }

    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }

    public int getSeiten() {
        return seiten;
    }

    public void setSeiten(int seiten) {
        this.seiten = seiten;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAuflage() {
        return auflage;
    }

    public void setAuflage(int auflage) {
        this.auflage = auflage;
    }

    public String getBeschreibung() {
        return "Buch " + titel + " von " + autor + ", " + auflage + ". Auflage, " + seiten + " Seiten";
    }

    public Buch(String titel, double preis, long barcode, int seiten, String autor, int auflage) {
        this.titel = titel;
        this.preis = preis;
        this.barcode = barcode;
        this.seiten = seiten;
        this.autor = autor;
        this.auflage = auflage;
    }
}
