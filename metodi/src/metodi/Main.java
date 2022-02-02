package metodi;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String msg;
        /*
        float numeri = chiediNumeri("Favore inserisce numero di righe!!");
        stampaNumeri((int)numeri);

        float prezzo = chiediNumeri("Favore inserisce il prezzo");
        float sconto = chiediNumeri("Favore inserisce lo sconto");
        msg = "Totale sconto: " + scontaPrezzo(prezzo, sconto);
        pTx(msg);

        float val1 = chiediNumeri("Favore inserisce il valore 1 della somma");
        float val2 = chiediNumeri("Favore inserisce il valore 2 della somma");
        msg = "Totale somma: " + sommaNumeri(val1, val2);
        pTx(msg);
        
        float dividendo = chiediNumeri("Favore inserisce il dividendo");
        float divisore = chiediNumeri("Favore inserisce il divisore");
        float div = divisioneNumeri(dividendo, divisore);
        stampaDivisione(div);
        */
        float prezzo = chiediNumeri("Favore inserisce il prezzo");
        msg = "Prezzo: " + scorpoIva(prezzo, 22);
        pTx(msg);
    }

    static float scorpoIva(float prezzo, float iva){
        float ris=0;
        ris = (prezzo*100)/(100+iva);
        return ris;
    }
    
    static void pTx(String testo){
        System.out.println();
        System.out.println(testo);
    }
    
    private static float chiediNumeri(String msg) {
        return Float.parseFloat(JOptionPane.showInputDialog(msg));
    }
    
        static void stampaNumeri(int qt) {
        /*
        for(int i=1; i<=qt; i++){
            String msg = JOptionPane.showInputDialog("Nome");
            //Operatore ternario in Java
            msg = msg.equals("") ? "Ausente" : msg ;
            //condition ? expression1 : expression2 ;
            System.out.println(i + ")"  + msg);
        }
         */

        String inizio = "";
        for (int i = 1; i <= qt; i++) {
            //condition ? expression1 : expression2 ;
            inizio = i < 10 ? "  " : " ";

            System.out.println(inizio + i + ")__________________________");
        }
    }

    static float divisioneNumeri(float dividendo, float divisore) {
        return Math.round(divisore != 0 ? dividendo / divisore : -9999);
    }

    static void stampaDivisione(float div) {
        String msg = div == -9999 ? "Parametri non correto valore diviso per 0" : "Totale Divisione: ";
        pTx(msg);
    }

    static float sommaNumeri(float val1, float val2) {
        return val1 + val2;
    }

    static float scontaPrezzo(float prezzo, float sconto) {
        return prezzo - (prezzo * sconto / 100);
    }

}
