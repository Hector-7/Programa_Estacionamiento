
package estacionamiento;
//Se genera la importacion de las librerias para el uso de los threds o hilos
import javax.swing.JOptionPane;


public class Proceso extends Thread{
    //Se crea el proceso basico para la implementacion de hilos.
    public Proceso (String msg){
        super(msg);
    }
    //El metodo run nos permitira correr de forma paralela el proceso especificado en diferentes momentos del programa para la demostracion del uso de hilos.
    public void run(){
        JOptionPane.showMessageDialog(null, this.getName());
    }
    
}