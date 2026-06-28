package main;
public class DVD {
    private String regista;
    private int durata;
    private String genere;
    private boolean prestito;
    
    public DVD(String regista, int durata, String genere){
        this.regista = regista;
        this.durata = durata;
        this.genere = genere;
        this.prestito = false;
    }
}
