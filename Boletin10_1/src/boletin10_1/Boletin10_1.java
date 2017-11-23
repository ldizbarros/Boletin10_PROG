package boletin10_1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Boletin10_1 {

    /**
     * Codifica un programa que permita o seguinte xogo para adiviñar un número.
     * O primeiro xogador  teclea ( utilizando a clase JoptionPane ), 
     * un número a adiviñar ( entre 1 e 50 ) e o número máximo de intentos 
     * que ten o segundo xogador para dar con el . 
     * O programa irá sacando por pantaia mensaxes que orienten o segundo
     * xogador sobre se o número tecleado e maior ou menor que o número 
     * a adiviñar . Fai o programa repetitivo.
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("InputDialog1");
        
        int num = Integer.parseInt(JOptionPane.showInputDialog(frame, 
            "Introduce el numero a adivinar (entre 1 y 50)", 
            "JUGADOR 1",
            JOptionPane.QUESTION_MESSAGE));
        int intentos = Integer.parseInt(JOptionPane.showInputDialog(frame, 
            "Introduce el numero de intentos :)", 
            "JUGADOR 1",
            JOptionPane.QUESTION_MESSAGE));
        
        Clase10_1 c1 = new Clase10_1(num,intentos);
       
        c1.juego();     
    }
    
}
