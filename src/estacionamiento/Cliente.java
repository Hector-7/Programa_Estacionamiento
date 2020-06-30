

package estacionamiento;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class Cliente implements Runnable{

    private int puerto;
    private String mensaje;
    
    public Cliente(int puerto, String mensaje){
        this.puerto = puerto;
        this.mensaje = mensaje;
    }
    
    
    @Override
    public void run() {
        //Host del servidor
        final String HOST = "127.0.0.1";
        //Puesto del servidor
        DataOutputStream out;
        
        try{
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, puerto);
            
            //Notifica el mensaje a los subsricptores
            out = new DataOutputStream(sc.getOutputStream());
            
            //Envio un mensaje al cliente
            out.writeUTF(mensaje);
            
            sc.close();
            
        }catch(IOException ex){
            
        }
        
    }
    
}
