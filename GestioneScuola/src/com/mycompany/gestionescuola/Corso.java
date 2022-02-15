/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionescuola;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Corso {

    //area atributi
    private String titoloCorso;
    private String descrizione;
    private int durataOre;
    private LocalDate dataInizio;
    private String link;

    //una strutura per caricare i possibili 30 aluni
    private Alunno[] registro = new Alunno[30];

    //elenco Alunni
    //Construtore
    public Corso() {
        this.titoloCorso = "NN";
        this.descrizione = "NN";
        this.durataOre = 0;
        this.dataInizio = LocalDate.now();
    }

    public Corso(String titoloCorso, int durataOre) {
        this.titoloCorso = titoloCorso;
        this.durataOre = durataOre;
    }

    public Corso(String titoloCorso, int durataOre, int anno, int mese, int giorno) {
        this.titoloCorso = titoloCorso;
        this.descrizione = "---";
        this.durataOre = durataOre;
        setDataInizio(anno, mese, giorno);
    }

    public String getTitoloCorso() {
        return titoloCorso;
    }

    public void setTitoloCorso(String titoloCorso) {
        int len = titoloCorso.length();
        this.titoloCorso = len > 0 && len < 50 ? titoloCorso : titoloCorso.substring(0, 50) + "...";

    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {

        this.descrizione = descrizione;
    }

    public int getDurataOre() {
        return durataOre;
    }

    public void setDurataOre(int durataOre) {
        while (durataOre > 0 && durataOre < 5000) {
            this.durataOre = Integer.parseInt(JOptionPane.showInputDialog("durataOre deve essere tra 0 e 5000"));
        }

        this.durataOre = durataOre > 0 && durataOre < 5000 ? durataOre : -9999;

    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    /**
     * imposta la data tra formato da data testo
     *
     * @param dataInizio formato YYYY-MM-DD es. 2022-02-02
     * @return
     */
    public boolean setDataInizio(String dataInizio) {
        int yyyy, mm, d;
        try {
            String parts[] = dataInizio.split("-");

            yyyy = Integer.parseInt(parts[0]);
            mm = Integer.parseInt(parts[1]);
            d = Integer.parseInt(parts[2]);

            this.dataInizio = LocalDate.of(yyyy, mm, d);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void setDataInizio(int y, int m, int d) {
        this.dataInizio = LocalDate.of(y, m, d);
    }

    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Alunno[] getRegistro() {
        return registro;
    }

    public void setRegistro(Alunno[] registro) {
        this.registro = registro;
    }

    //area metodi
    void stampaInfo() {
        String stampa = "Titolo Corso: " + this.titoloCorso;
        stampa += "Titolo Descrizione: " + this.descrizione;
        stampa += "Titolo Ore Durata: " + this.durataOre;
        stampa += "Data Inizio: " + this.dataInizio;
        stampa += "Link Corso: www.ciacformazioni.it ";

        System.out.println(stampa);

    }

    String getInfo() {
        String stampa = "\n---- SCHEDA CORSO ----";
        stampa += "\nTitolo: " + this.titoloCorso;
        stampa += "\nOre Durata: " + this.durataOre;
        stampa += "\nDescrizione: " + this.descrizione;
        stampa += "\nData Inizio: " + this.dataInizio;
        stampa += "\nLink: " + link + "\n";

        return stampa;
    }

    String getCSV() {
        String stampa = "";
        //stampa += "titolocorso;durataore;descrizione;datainizio;link\n";
        stampa += this.titoloCorso + ";";
        stampa += this.durataOre + ";";
        stampa += this.descrizione + ";";
        stampa += this.dataInizio.toString() + ";";
        stampa += link + "\n";

        return stampa;
    }

    //ci mettere il numero di array
    void insertAlunno(Alunno alunno, int pos) {
        registro[pos] = alunno;
    }

    //NON ci mette il numero l'array
    void insertAlunno(Alunno alunno) {
        int pos = 0;

        for (int i = 0; i < registro.length; i++) {
            if (registro[i] == null) {
                pos = i;
                break;
            }
        }

        registro[pos] = alunno;
    }

    void stampaRegistro() {

        for (int i = 0; i < registro.length; i++) {
            if (registro[i] == null) {
                break;
            } else {
                registro[i].stampaAlunno();
            }
        }
    }

    @Override
    public String toString() {
        return "Corso\n\nTitolo Corso=" + titoloCorso
                + "\nDescrizione=" + descrizione
                + "\nDurata Ore=" + durataOre
                + "\nData Inizio=" + dataInizio;
    }

}
