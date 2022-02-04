/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionescuola;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author tss
 */
public class Esame {

    private String docente;
    private LocalDate data;
    private int voto;
    private String materia;
    private String note;

    public Esame() {
    }

    public Esame(String docente, int voto, String materia) {
        this.docente = docente;
        this.voto = voto;
        this.materia = materia;
        this.data = LocalDate.now();
    }

    public String getDocente() {
        return docente;
    }

    public LocalDate getData() {
        return data;
    }

    public int getVoto() {
        return voto;
    }

    public String getMateria() {
        return materia;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        note = note.trim();

        this.note = note.length() < 2 ? this.note : note;

    }

    public void stampaInfoEsame() {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = data.format(myFormatObj);
        String stampa = "";

        stampa += " -------- ESAME -------";
        stampa += "\nDocente: " + docente;
        stampa += "\nData: " + formattedDate;
        stampa += "\nVoto: " + voto;
        stampa += "\nMateria: " + materia;
        stampa += "\nNote: " + note;

        System.out.println(stampa);

    }

}
