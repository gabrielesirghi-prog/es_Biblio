package main;
public class Audiolibro extends Libro implements Ricercabile{
    private String narratore;
    private int durata;
    
    public Audiolibro(String codice, String titolo, int annoPubblicazione, String isbn, String autore, int nPagine, String genere, String narratore, int durata) {
        super(codice, titolo, annoPubblicazione, isbn, autore, nPagine, genere);
        this.narratore = narratore;
        this.durata = durata;
    }
    public String getNarratore() {
        return narratore;
    }
    public int getDurata() {
        return durata;
    }
    @Override
    public int getGiorniPrestito(){
        return 14;
    }
    @Override
    public double calcolaMulta(int giorniRitardo){
        double multa = 0;
        if(giorniRitardo >= 14){
            multa = (giorniRitardo - 14) *1;
        }
        return multa;
    }
}
