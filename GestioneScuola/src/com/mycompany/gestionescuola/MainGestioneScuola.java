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
public class MainGestioneScuola {

    public static void main(String[] args) {
        Corso c1 = new Corso("tss java",1000);
        Corso c2 = new Corso("CyberSecurity", 600, 2022, 12, 15);
        //c1.stampaInfo();
        
        c2.stampaInfo();

        Alunno al1 = new Alunno("Rodrigo", "da Silva Tenorio", "rodrigo@gmail.com", " 0125 - 68456");
        Alunno al2 = new Alunno("Liam", "Biazioli Tenorio", "liam@gmail.com", " 0125 - 123456");
//        JOptionPane.showMessageDialog(null, "Dati Aluno\n" + al2);

        al1.setCognome("");
        c1.insertAlunno(al1, 0);
        c1.insertAlunno(al2);
//        c2.insertAlunno(al1, 0);

        c1.stampaRegistro();
        
        Esame es = new Esame("Guerrini", 85, "Java");
        Alunno esaminando = c1.getRegistro()[0];
        esaminando.setLibretto(es);
        
    }

}
