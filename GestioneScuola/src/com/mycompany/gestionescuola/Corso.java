/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionescuola;

import java.util.Date;

/**
 *
 * @author tss
 */
public class Corso {

    //area atributi
    String titoloCorso;
    String descrizione;
    int durataOre;
    Date dataInizio;
    String link;

    //una strutura per caricare i possibili 30 aluni
    Alunno[] registro = new Alunno[30];

    //elenco Alunni
    //Construtore
    public Corso() {
    }

    public Corso(String titoloCorso, int durataOre) {
        this.titoloCorso = titoloCorso;
        this.durataOre = durataOre;
    }

    public Corso(String titoloCorso, String descrizione, int durataOre) {
        this.titoloCorso = titoloCorso;
        this.descrizione = descrizione;
        this.durataOre = durataOre;
        this.dataInizio = new Date();
    }

    //area metodi
    void stampaInfo() {
        String stampa = "Titolo Corso: " + this.titoloCorso;
        stampa += "Titolo Descrizione: " + this.descrizione;
        stampa += "Titolo Ore Durata: "  + this.durataOre;
        stampa += "Data Inizio: "        + this.dataInizio;
        stampa += "Link Corso: www.ciacformazioni.it ";

        System.out.println(stampa);

    }


    void insertAlunno(Alunno alunno, int pos) {
        registro[pos] = alunno;
    }

    void insertAlunno(Alunno alunno) {
        int pos = 0;
        
        for (int i = 0; i < registro.length; i++) {
            if (registro[i] == null){
                pos = i;
                break;
            }
        }
        
        registro[pos] = alunno;
    }

    
    void stampaRegistro(Alunno alunno) {
        
        for (int i = 0; i < registro.length; i++) {
            if(registro[i]==null) 
                break; 
            else 
                registro[i].stampaAlunno();
        }
    }
    
    @Override
    public String toString() {
        return "Corso\n\nTitolo Corso=" + titoloCorso + "\nDescrizione=" + descrizione + "\nDurata Ore=" + durataOre + "\nData Inizio=" + dataInizio;
    }
    
}
