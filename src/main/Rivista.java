package main;
public class Rivista {
    private int nEdizione;
    private int mese;
    private String editore;
    private boolean prestito;
    
    public Rivista(int nEdizione, int mese, String editore){
        this.nEdizione = nEdizione;
        this.mese = mese;
        this.editore = editore;
        this.prestito = false;
    }
}
