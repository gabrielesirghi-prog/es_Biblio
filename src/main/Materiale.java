package main;
public abstract class Materiale {
    private String codice;
    private String titolo;
    private int annoPubblicazione;
    private boolean disponibile;

    public Materiale(String codice, String titolo, int annoPubblicazione){
        this.codice = codice;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.disponibile = true;
    }
    public String getCodice() {
        return codice;
    }
    public String getTitolo() {
        return titolo;
    }
    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }
    public boolean isDisponibile() {
        return disponibile;
    }
    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }
    public abstract int getGiorniPrestito();
    public abstract double calcolaMulta(int giorniRitardo);
    @Override
    public String toString() {
        return "Materiale{" + "codice=" + codice + ", titolo=" + titolo + ", annoPubblicazione=" + annoPubblicazione + ", disponibile=" + disponibile + '}';
    }

}
