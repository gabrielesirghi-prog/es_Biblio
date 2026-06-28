package main;
public class Audiolibro extends Libro{
    private String narratore;
    private int durata;
    private boolean prestito;
    
    public Audiolibro(int isbn, String autore, int nPagine, String genere, String narratore, int durata) {
        super(isbn, autore, nPagine, genere);
        this.narratore = narratore;
        this.durata = durata;
        this.prestito = prestito;
    }
    
}
