package main;
public class Libro {
    private int isbn;
    private String autore;
    private int nPagine;
    private String genere;
    private boolean prestito;
    
    
    public Libro(int isbn, String autore, int nPagine, String genere){
        this.isbn = isbn;
        this.autore = autore;
        this.nPagine = nPagine;
        this.genere = genere;
        this.prestito = false;
    }
}
