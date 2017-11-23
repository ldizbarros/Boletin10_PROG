package boletin10_1;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Clase10_1 {
    private int num;
    private int intentos;
    
    public Clase10_1(int num,int intentos){
        this.num=num;
        this.intentos=intentos;
    }
       
    public void juego(){ 
        int i=0;
        while (i!=intentos){
            Component frame = null;
            int num2 = Integer.parseInt(JOptionPane.showInputDialog(frame, 
                "Introduce un numero", 
                "JUGADOR 2",
                JOptionPane.QUESTION_MESSAGE));
            
            if (num==num2){
                System.out.println("CORRECTO! Has hacertado el numero");
                i=intentos;
            }else if (num2>num){
                System.out.println("INCORRECTO: el numero introducido es mayor");
                i++;
                System.out.println("Te quedan "+(intentos-i)+" intentos");
            }else{
                System.out.println("INCORRECTO! El numero introducido es menor");
                i++;
                System.out.println("Te quedan "+(intentos-i)+" intentos");
            }
        }
    }
}
