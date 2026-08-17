package main;
public class Libro extends Materiale implements Ricercabile{
    private String isbn;
    private String autore;
    private int nPagine;
    private String genere;   
    
    public Libro(String codice, String titolo, int annoPubblicazione, String isbn, String autore, int nPagine, String genere){
        super(codice, titolo, annoPubblicazione);
        this.isbn = isbn;
        this.autore = autore;
        this.nPagine = nPagine;
        this.genere = genere;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getAutore() {
        return autore;
    }
    public int getnPagine() {
        return nPagine;
    }
    public String getGenere() {
        return genere;
    }
    @Override
    public int getGiorniPrestito(){
        return 30;
    }
    @Override
    public double calcolaMulta(int giorniRitardo){
        double multa = 0;
        if(giorniRitardo > 0){
            multa = giorniRitardo * 0.5 + 1;
        }
        return multa;
    }
    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", autore=" + autore + ", nPagine=" + nPagine + ", genere=" + genere + '}';
    }
}
