package boletin10_2;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Clase10_2 {

    private int num;

    public Clase10_2(int num) {
        this.num = num;
    }

    public void juego() {
        Component frame = null;
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(frame,
                "Introduce un numero",
                "JUGADOR 2",
                JOptionPane.QUESTION_MESSAGE));
        
        while (num2!=num) {
            num2 = Integer.parseInt(JOptionPane.showInputDialog(frame,
                    "Introduce un numero",
                    "JUGADOR 2",
                    JOptionPane.QUESTION_MESSAGE));
            if (num-num2>20 || num-num2<-20) {
                System.out.println("INCORRECTO: Moy lonxe");
            } else if (num-num2<=20 && num-num2>=10 || num-num2>=-20 && num-num2<=-10) {
                System.out.println("INCORRECTO: Lonxe");
            } else if (num-num2<10 && num-num2>5 || num-num2>-10 && num-num2<-5){
                System.out.println("INCORRECTO: Preto");
            }else if(num-num2<=5 || num-num2>=-5){
                System.out.println("INCORRECTO: Moi preto");
            }
        }
        System.out.println("CORRECTO! Has hacertado el numero");
    }
}
