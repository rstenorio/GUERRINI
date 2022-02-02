package Main;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Tool tool = new Tool();

        /*
        float a, b, c;
        
        a = tool.insNumero();
        System.out.println("a: " + a);
        b = tool.insNumero("Dimmi b: ");
        System.out.println("b: " + b);
        c = tool.insNumero("Dimmi a: ", 2);
        System.out.println("c: " + c);
        
        c = tool.insNumero("ins Soldi?? ");
        System.out.println("c: " + c);
         */
        
        //String giornoSettimana = JOptionPane.showInputDialog("Favore inserisci un numero per giorno dalla settimana tra 1 e 7");
        //int valore = Integer.parseInt(giornoSettimana);

        /*
        int valore;
        
        do {
            String giornoSettimana = JOptionPane.showInputDialog("Favore inserisci un numero per giorno\ndella settimana tra 1 e 7");
            valore = Integer.parseInt(giornoSettimana);
            String giorno = tool.cercaGiorno(valore);
            if(valore !=0){
                JOptionPane.showMessageDialog(null, giorno);
            }
        }while (valore != 0);
        */
        
        float x,y,z;
        
        x = tool.insNumero("Dimmi X");
        y = tool.insNumero("Dimmi Y");
        z = tool.insNumero("Dimmi Z");
        
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Z: " + z);

        System.out.println("Distanza: " + tool.dist3D(x, y, z));
        
        
        
        
        //int[] a = new int[10];

    }

}
