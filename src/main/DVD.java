package main;

import static java.lang.Math.ceil;

public class DVD extends Materiale implements Ricercabile{
    private String regista;
    private int durata;
    private String genere;
    
    public DVD(String codice, String titolo, int annoPubblicazione, String regista, int durata, String genere){
        super(codice, titolo, annoPubblicazione);
        this.regista = regista;
        this.durata = durata;
        this.genere = genere;
    }
    public String getRegista() {
        return regista;
    }
    public int getDurata() {
        return durata;
    }
    public String getGenere() {
        return genere;
    }
    @Override
    public int getGiorniPrestito(){
        return 3;
    }
    @Override
    public double calcolaMulta(int giorniRitardo){
        double multa = 0;
        if(giorniRitardo >= 3){
            double settimane = ceil(giorniRitardo / 7);
            multa = settimane * 10;
        }
        return multa;
    }
}
