/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionescuola;

/**
 *
 * @author tss
 */
public class Alunno {
    String nome;
    String cognome;
    String mail;
    String telefono;

    public Alunno() {
    }

    public Alunno(String nome, String cognome, String mail, String telefono) {

        this.nome =       nome!=null ? nome : "NN";
        this.cognome = cognome!=null ? cognome : "NN";
        this.mail =       mail!=null ? mail : "NN";
        
        Tools tools = new Tools();
        telefono = tools.checkTel(telefono,"+33");
        this.telefono = telefono!=null ? telefono : "NN";
        
    }
    
    public void stampaAlunno() {
        System.out.println("Nome=" + nome + "\nCognome=" + cognome + "\nMail=" + mail + "\nTelefone=" + telefono);
    }
    
}
