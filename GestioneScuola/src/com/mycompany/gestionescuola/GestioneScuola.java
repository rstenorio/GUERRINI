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
public class GestioneScuola {

    public static void main(String[] args) {
        Corso c1 = new Corso("tss java",1000);
        Corso c2 = new Corso("CyberSecurity", null, 600);
        //c1.stampaInfo();

        Alunno al1 = new Alunno("Rodrigo", "da Silva Tenorio", "rodrio@gmail.com", " 0125 - 68456");
        Alunno al2 = new Alunno("Liam", "Biazioli Tenorio", "liam@gmail.com", " 0125 - 123456");
        //JOptionPane.showMessageDialog(null, "Dati Aluno\n" + al2);
        
        c1.insertAlunno(al1, 0);
        c1.insertAlunno(al2);
        
        c2.insertAlunno(al1, 0);
        
        c1.stampaRegistro(al2);
        
    }

}
