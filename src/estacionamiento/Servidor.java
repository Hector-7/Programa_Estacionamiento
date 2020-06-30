

package estacionamiento;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;


public class Servidor extends Observable implements Runnable{

    private int puerto;
    
    public Servidor(int puerto){
        this.puerto = puerto;
    }
    
    
    
    @Override
    public void run() {
        
        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;
        
        try{
            //Creamos el socket del servidor
            servidor = new ServerSocket (puerto);
            System.out.println("Servidor iniciado");
            
            //Siempre estara escuchando peticiones
            while(true){
                
                //Espero a que un cliente se conecte
                sc = servidor.accept();
                
                System.out.println("Cliente conectado");
                in = new DataInputStream(sc.getInputStream());
                
                //Leo el mensaje que me envia
                String mensaje = in.readUTF();
                
                System.out.println(mensaje);
                
                //Notifica el mensaje a los subsricptores
                this.setChanged();
                this.notifyObservers(mensaje);
                this.clearChanged();
                
                //Cierro el socket
                sc.close();
                System.out.println("Cliente desconectado");
                
                
            }
        }catch(Exception e){
            
        }
        
        
        
        
    }
    
}
