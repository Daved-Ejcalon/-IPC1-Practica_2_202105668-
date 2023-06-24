
package Clases;

public class Pedidos {
    String Pedidos;
    String Precio;
     
public Pedidos(String Pedidos, String Precio) {
this.Pedidos = Pedidos;
this.Precio = Precio;
}

    public String getPedidos() {
        return Pedidos;
    }

    public void setPedidos(String Pedidos) {
        this.Pedidos = Pedidos;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

}