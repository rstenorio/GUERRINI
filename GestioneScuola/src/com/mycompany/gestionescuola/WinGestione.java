package com.mycompany.gestionescuola;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.text.DateFormatter;

public class WinGestione extends javax.swing.JFrame {

    ArrayList<Corso> listCorsi = new ArrayList<Corso>();

    public WinGestione() {
        initComponents();
        caricaDati();
        showCorsi();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txNomeCorso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txDescrizione = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        spDurataOre = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        txDataInizio = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txLinkCorso = new javax.swing.JTextField();
        btnCreaCorso = new javax.swing.JButton();
        lbMessage = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpDisplay = new javax.swing.JTextPane();
        btnUpdateCorso = new javax.swing.JButton();
        btnSelectCorso = new javax.swing.JButton();
        txId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestione scuola");
        jLabel1.setName("lblTitolo"); // NOI18N

        jLabel2.setText("Nome Corso:");

        txDescrizione.setColumns(20);
        txDescrizione.setRows(5);
        jScrollPane1.setViewportView(txDescrizione);

        jLabel3.setText("Descrizione:");

        jLabel4.setText("Durata Ore:");

        txDataInizio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel5.setText("Data Inizio:");

        jLabel6.setText("Link Corso:");

        btnCreaCorso.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        btnCreaCorso.setText("Crea Corso");
        btnCreaCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaCorsoActionPerformed(evt);
            }
        });

        lbMessage.setForeground(new java.awt.Color(193, 10, 1));

        jScrollPane2.setViewportView(tpDisplay);

        btnUpdateCorso.setText("update");
        btnUpdateCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCorsoActionPerformed(evt);
            }
        });

        btnSelectCorso.setText("select corso");
        btnSelectCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectCorsoActionPerformed(evt);
            }
        });

        txId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txLinkCorso)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                                    .addComponent(txNomeCorso)
                                    .addComponent(spDurataOre, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txDataInizio, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnCreaCorso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 367, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(209, 209, 209)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdateCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(389, Short.MAX_VALUE)
                    .addComponent(btnSelectCorso)
                    .addGap(323, 323, 323)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 108, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txNomeCorso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spDurataOre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txDataInizio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txLinkCorso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreaCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnUpdateCorso)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(528, Short.MAX_VALUE)
                    .addComponent(btnSelectCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(60, 60, 60)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showCorsi() {
        //recupero un corso per volta
        //estaggo info tipo string
        //aggiungo info a un testo generico che poi setto  in display
        String testoDisplay = "";
        for (int i = 0; i < listCorsi.size(); i++) {
            //recupero un corsoo per volta
            Corso c = listCorsi.get(i);
            String info = c.getInfo();
            testoDisplay = info + testoDisplay;

        }
        tpDisplay.setText(testoDisplay);
    }

    void caricaDati() {

        try {
            File filecsv = new File("/home/tss/scuola/corsi.csv");
            Scanner lettore = new Scanner(filecsv);
            int n = 1;
            while (lettore.hasNextLine()) {
                String riga = lettore.nextLine();
                n++;
                if (n > 1) {

                    //showCorsi();
                    String[] dati = riga.split(";");
                    String nc = dati[0];
                    int durata = Integer.parseInt(dati[1]);
                    String desc = dati[2];
                    String d[] = dati[3].split("-");
                    int y = Integer.parseInt(d[0]);
                    int m = Integer.parseInt(d[1]);
                    int g = Integer.parseInt(d[2]);

                    String link = dati[4];

                    Corso c = new Corso(nc, durata, y, m, g);

                    c.setDescrizione(desc);
                    c.setLink(link);

                    listCorsi.add(c);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void salvaCorsi() {

        String testoDisplay = "";
        for (int i = 0; i < listCorsi.size(); i++) {
            //recupero un corsoo per volta
            Corso c = listCorsi.get(i);
            String info = c.getInfo();
            testoDisplay += info;
        }

        try {
            //creo corsi .txt
            FileWriter myWriter = new FileWriter("/home/tss/scuola/corsi.txt");
            //ci scrivo dentro testoDisplay
            myWriter.write(testoDisplay);
            //lo chiudo
            myWriter.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred." + e.getMessage());
        }

    }

    void salvaCorsiCSV() {

        String testoDisplay = "titolocorso;durataore;descrizione;datainizio;link\n";
        for (int i = 0; i < listCorsi.size(); i++) {
            //recupero un corsoo per volta
            Corso c = listCorsi.get(i);
            String info = c.getCSV();
            testoDisplay = testoDisplay + info;
        }

        try {
            //creo corsi .txt
            FileWriter myWriter = new FileWriter("/home/tss/scuola/corsi.csv");
            //ci scrivo dentro testoDisplay
            myWriter.write(testoDisplay);
            //lo chiudo
            myWriter.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred." + e.getMessage());
        }

    }


    private void btnCreaCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaCorsoActionPerformed

        String nc = txNomeCorso.getText();
        String desc = txDescrizione.getText();
        String data = txDataInizio.getText();
        String ardata[] = data.split("/");
        int d = Integer.parseInt(ardata[0]);
        int m = Integer.parseInt(ardata[1]);
        int y = Integer.parseInt(ardata[2]) + 2000;

        String link = txLinkCorso.getText();
        int durata = (int) spDurataOre.getValue();

        Corso corso = new Corso(nc, durata, y, m, d);
        corso.setDescrizione(txDescrizione.getText());
        corso.setLink(link);

        tpDisplay.setText(nc);
        lbMessage.setText("Corso Creato Corretamente!");
        txNomeCorso.setText("");
        txDescrizione.setText("");
        txDataInizio.setText("");
        txLinkCorso.setText("");
        spDurataOre.setValue(0);

        listCorsi.add(corso);
        showCorsi();
        salvaCorsi();
        salvaCorsiCSV();
    }//GEN-LAST:event_btnCreaCorsoActionPerformed

    private void txIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txIdActionPerformed

    private void btnSelectCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectCorsoActionPerformed
        int id = Integer.parseInt(txId.getText()) - 1;
        if (!(id < listCorsi.size() && id >= 0)) {
            return;
        }

        Corso c = listCorsi.get(id);

        lbMessage.setText("Corso selezionato corretamente!");
        txNomeCorso.setText(c.getTitoloCorso());
        txDescrizione.setText(c.getDescrizione());

        DateTimeFormatter ddmmaa = DateTimeFormatter.ofPattern("dd/MM/yy");
        String dataOk = c.getDataInizio().format(ddmmaa);
        txDataInizio.setText(dataOk);

        txLinkCorso.setText(c.getLink());
        spDurataOre.setValue(c.getDurataOre());

    }//GEN-LAST:event_btnSelectCorsoActionPerformed

    private void btnUpdateCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCorsoActionPerformed
        int id = Integer.parseInt(txId.getText()) - 1;
        if (!(id < listCorsi.size() && id >= 0)) {
            return;
        }

        String nc = txNomeCorso.getText();
        String desc = txDescrizione.getText();
        String data = txDataInizio.getText();
        String ardata[] = data.split("/");
        int d = Integer.parseInt(ardata[0]);
        int m = Integer.parseInt(ardata[1]);
        int y = Integer.parseInt(ardata[2]) + 2000;

        String link = txLinkCorso.getText();
        int durata = (int) spDurataOre.getValue();

        Corso corso = new Corso(nc, durata, y, m, d);
        corso.setDescrizione(txDescrizione.getText());
        corso.setLink(link);

        listCorsi.set(id, corso);
        showCorsi();
        salvaCorsiCSV();
    }//GEN-LAST:event_btnUpdateCorsoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WinGestione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinGestione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinGestione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinGestione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinGestione().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreaCorso;
    private javax.swing.JButton btnSelectCorso;
    private javax.swing.JButton btnUpdateCorso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbMessage;
    private javax.swing.JSpinner spDurataOre;
    private javax.swing.JTextPane tpDisplay;
    private javax.swing.JFormattedTextField txDataInizio;
    private javax.swing.JTextArea txDescrizione;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txLinkCorso;
    private javax.swing.JTextField txNomeCorso;
    // End of variables declaration//GEN-END:variables
}
