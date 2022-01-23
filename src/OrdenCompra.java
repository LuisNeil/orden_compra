
import java.util.Date;

public class OrdenCompra {

    private int idOrden;
    private String descripcion;
    private Cliente cliente;
    private Producto[] productos;
    private Date date;

    private static int contadorOrdenes;
    private int contadorProductos;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.idOrden = ++contadorOrdenes;
        this.productos = new Producto[4];
    }

    public int getIdOrden() {
        return idOrden;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void addProducto(Producto producto) {
        if (contadorProductos < this.productos.length)  {
            this.productos[contadorProductos++] = producto;
        }
    }

    public double getTotal(){
        double total = 0;
        for (Producto producto:productos) {
            total += producto.getPrecio();
        }
        return total;
    }

}
