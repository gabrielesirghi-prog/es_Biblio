package main;
public class Rivista extends Materiale{
    private int nEdizione;
    private String mese;
    private String editore;
    private double prezzoCopertina;
    
    public Rivista(String codice, String titolo, int annoPubblicazione, int nEdizione, String mese, String editore, double prezzoCopertina){
        super(codice, titolo, annoPubblicazione);
        this.nEdizione = nEdizione;
        this.mese = mese;
        this.editore = editore;
        this.prezzoCopertina = prezzoCopertina;
    }
    public int getnEdizione() {
        return nEdizione;
    }
    public String getMese() {
        return mese;
    }
    public String getEditore() {
        return editore;
    }
    @Override
    public int getGiorniPrestito(){
        return 7;
    }
    @Override
    public double calcolaMulta(int giorniRitardo){
        double multa = 0;
        if(giorniRitardo > 0 && giorniRitardo <= 15){
            multa = giorniRitardo * 0.25;
        }else{
            multa = prezzoCopertina + (giorniRitardo *0.25);
        }
        return multa;
    }
    
}
