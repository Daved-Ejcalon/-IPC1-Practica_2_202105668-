
package Metodos;

import Clases.Pedidos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Metodos {
    Vector vPrincipal= new Vector();
    public void guardar (Pedidos unPedidos){
vPrincipal.addElement(unPedidos);    
}
public void guardarArchivo (Pedidos pedidos){
    try{
        FileWriter fw= new FileWriter("Pedidos.txt",true);
     BufferedWriter bw = new BufferedWriter(fw);
     PrintWriter pw = new PrintWriter (bw);
     pw.print("|"+pedidos.getPedidos());
     pw.println("|"+pedidos.getPrecio());
       pw.close();
   }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
   }
    }
public DefaultTableModel ListaPedidos(){
      Vector Cabeceras = new Vector();
      Cabeceras.addElement("Pedidos");
       Cabeceras.addElement("Precio");
      
       
         DefaultTableModel mdltabla = new DefaultTableModel(Cabeceras,0);
         try{
             FileReader fr= new FileReader("Pedidos.txt");
             BufferedReader br= new BufferedReader(fr);
             String d;
             while((d=br.readLine())!=null){
                 StringTokenizer dato = new StringTokenizer(d,"|"); 
                 Vector x = new Vector();
                 while(dato.hasMoreTokens()){
                     x.addElement(dato.nextToken());
                 }
         mdltabla.addRow(x);
             }
         }catch(Exception e) {
         JOptionPane.showMessageDialog(null, e);
  }      
         return mdltabla;
         }
  }