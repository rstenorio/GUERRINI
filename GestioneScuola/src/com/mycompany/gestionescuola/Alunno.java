/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionescuola;

import java.time.LocalDate;

/**
 *
 * @author tss
 */
public class Alunno {

    private String nome;
    private String cognome;
    private String mail;
    private String telefono;
    private LocalDate dataInserimento = LocalDate.now();
    private Esame[] libretto = new Esame[30];

    public Alunno() {
    }

    public Alunno(String nome, String cognome) {
        this.nome = nome != null ? nome : "NN";
        this.cognome = cognome != null ? cognome : "NN";
    }

    public Alunno(String nome, String cognome, String mail, String telefono) {

        this.nome = nome != null ? nome : "NN";
        this.cognome = cognome != null ? cognome : "NN";
        this.mail = mail != null ? mail : "NN";

        Tools tools = new Tools();
        telefono = tools.checkTel(telefono, "+33");
        this.telefono = telefono != null ? telefono : "NN";

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }
    
    public boolean setCognome(String cognome) {
        cognome = cognome.trim();
        if (cognome.length() > 2) {
            this.cognome = cognome;
            return true;
        } else {
            return false;
        }

    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getDataInserimento() {
        return dataInserimento;
    }

    public void setLibretto(Esame esame) {
        for (int i = 0; i < libretto.length; i++) {
            if(libretto[i]==null){
                libretto[i]=esame;
                break;
            }
        }
    }
    
    
    

    public void stampaAlunno() {
        System.out.println("Nome=" + nome + "\nCognome=" + cognome + "\nMail=" + mail + "\nTelefone=" + telefono);
    }

}
