package Main;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Tool {

    public float insNumero() {
        float ris = 0;
        String txNumero = JOptionPane.showInputDialog("Inserisci Numero");
        try {
            ris = Float.parseFloat(txNumero);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRORE: " + e.getMessage());
        }
        return ris;
    }

    public float insNumero(String messaggio) {
        float ris = 0;
        boolean ok = false;

        while (!ok) {

            String txNumero = JOptionPane.showInputDialog(messaggio);
            txNumero = txNumero.replaceAll(",", ".");
            try {

                ris = Float.parseFloat(txNumero);
                ok = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERRORE: " + e.getMessage());
            }
        }
        return ris;
    }

    public float insNumero(String messaggio, Integer numDecimale) {
        float ris = 0;
        String txNumero = JOptionPane.showInputDialog("Inserisci Decimale");
        try {

            ris = Float.parseFloat(txNumero);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRORE: " + e.getMessage());
        }

        // 0 -> 1   1->10   2->100    3->1000
        float potenza = (float) Math.pow(10, numDecimale);
        ris = Math.round(ris * potenza) / potenza;
        return ris;
    }

    /**
     * metodo per chiedere tramite messaggio un numero
     *
     * @param messaggio - domanda da porre
     *
     * @return numero float arrotondato
     * @author tss
     *
     */
    public float insValuta(String messaggio) {
        return insNumero(messaggio, 2);
    }

    public String cercaGiorno(int giorno) {
        String ris;
        int day = giorno;
       
        switch (day) {
            case 1:
                ris = "Lunedì";
                break;
            case 2:
                ris = "Materdì";
                break;
            case 3:
                ris = "Mercoledì";
                break;
            case 4:
                ris = "Giovedì";
                break;
            case 5:
                ris = "Venerdì";
                break;
            case 6:
                ris = "Sabbato";
                break;
            case 7:
                ris = "Domenica";
                break;
            default:
                ris = "Il numero è fuori range.";
        }

        return ris;
    }
    
    public float dist3D(float x, float y, float z){
        float ris = 0;
        double calc = x*x+y*y+z*z;
        calc = Math.sqrt(calc);
        ris = (float) calc;
        return ris;
    }
    
}
