
package Metodos;

import Clases.Pedidos;
import Clases.Registro;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Metodos15 {
    Vector vPrincipal= new Vector();
    public void guardar (Registro unRegistro){
vPrincipal.addElement(unRegistro);    
}
public void guardarArchivo (Registro registro){
    try{
        FileWriter fw= new FileWriter("Historial.txt",true);
     BufferedWriter bw = new BufferedWriter(fw);
     PrintWriter pw = new PrintWriter (bw);
     pw.print("|"+registro.getVehiculo());
     pw.print("|"+registro.getDistancia());
       pw.print("|"+registro.getMonto());
     pw.print("|"+registro.getFecha_creacion());
       pw.println("|"+registro.getFecha_entrega());
       pw.close();
   }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
   }
    }
public DefaultTableModel ListaRegistro(){
      Vector Cabeceras = new Vector();
      Cabeceras.addElement("Vehiculo");
       Cabeceras.addElement("Distancia");
       Cabeceras.addElement("Monto");
       Cabeceras.addElement("Fecha de Creacion");
       Cabeceras.addElement("Fecha de Entrega");
      
       
         DefaultTableModel mdltabla2 = new DefaultTableModel(Cabeceras,0);
         try{
             FileReader fr= new FileReader("Historial.txt");
             BufferedReader br= new BufferedReader(fr);
             String d;
             while((d=br.readLine())!=null){
                 StringTokenizer dato = new StringTokenizer(d,"|"); 
                 Vector x = new Vector();
                 while(dato.hasMoreTokens()){
                     x.addElement(dato.nextToken());
                 }
         mdltabla2.addRow(x);
             }
         }catch(Exception e) {
         JOptionPane.showMessageDialog(null, e);
  }      
         return mdltabla2;
         }
  }