
package Clases;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import Diseno.Trayectoria;

public class Recorrido extends Thread{
    JLabel vehiculo;
    int distancia;
    boolean regreso;
    
    //Trayectoria vr = new Trayectoria();
    final int posDestino= Trayectoria.DestinoLbl.getLocation().x;
    
   

    public Recorrido(JLabel vehiculo, int distancia) {
        this.vehiculo = vehiculo;
        this.distancia = distancia;
        this.regreso=false;
    }
    
    @Override
    public void run(){
        while(true){
            try {
                //delay
                sleep(10 * distancia);
                //posicion 
                int VehiculosposX=vehiculo.getLocation().x;
                 if(!regreso){
                     if(VehiculosposX < posDestino - 100){
                         vehiculo.setLocation( VehiculosposX + 10,vehiculo.getLocation().y );
                     }else{
                         regreso= true; 
                     }
                 }else{
                     if(VehiculosposX > + 100 ){
                         
                         vehiculo.setLocation( VehiculosposX - 10,vehiculo.getLocation().y );
                     }else{
                         break;
                 }
                 }
            } catch (Exception e) {
               System.out.println(e);
            }
        }
    }
}
