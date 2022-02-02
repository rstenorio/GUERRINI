/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionescuola;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Tools {

    String checkTel(String telefono, String prefix) {
        String ris;
        try {
        //tolgo spazio
        telefono = telefono.replace(" ", "");
        //tolgo carattere speciale
        telefono = telefono.replace(".", "");
        telefono = telefono.replace("(", "");
        telefono = telefono.replace(")", "");
        telefono = telefono.replace("-", "");

            long ltel = Long.parseLong(telefono);
            String tre = telefono.substring(0, 3);

            ris = tre.equals(prefix) ? telefono : prefix + telefono;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Telefono con errore " + telefono);
            ris = "";
        }
        return ris;
    }


    String checkTel(String telefono) {
        String ris;
        //tolgo spazio
        telefono = telefono.replace(" ", "");
        //tolgo carattere speciale
        telefono = telefono.replace(".", "");
        telefono = telefono.replace("(", "");
        telefono = telefono.replace(")", "");
        telefono = telefono.replace("-", "");

        try {
            long ltel = Long.parseLong(telefono);
            String tre = telefono.substring(0, 3);

            ris = tre.equals("+39") ? telefono : "+39" + telefono;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Telefono con errore " + telefono);
            ris = "";
        }
        return ris;
    }

}
