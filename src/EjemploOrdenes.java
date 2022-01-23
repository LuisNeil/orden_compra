import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra ordenCompra1 = new OrdenCompra("Compras componentes PC");
        ordenCompra1.setCliente(new Cliente("Luis", "Tejeda"));
        ordenCompra1.setDate(new Date());

        ordenCompra1.addProducto(new Producto("MSI","Monitor 27\"",1200.00));
        ordenCompra1.addProducto(new Producto("MSI", "Portatil", 6500.00));
        ordenCompra1.addProducto(new Producto("MSI","Auriculares",350));
        ordenCompra1.addProducto(new Producto("MSI","Teclado",180));

        OrdenCompra ordenCompra2 = new OrdenCompra("Compra accesorios");
        Cliente cliente2 = new Cliente("Rafael" , "Lopez");
        ordenCompra2.setCliente(cliente2);
        ordenCompra2.setDate(new Date());
        ordenCompra2.addProducto(new Producto("Homecenter","Silla", 400));
        ordenCompra2.addProducto(new Producto("Falabella","Escritorio", 450));
        ordenCompra2.addProducto(new Producto("Alkosto", "Soporte", 35));
        ordenCompra2.addProducto(new Producto("Exito", "Ventilador", 120));

        OrdenCompra ordenCompra3 = new OrdenCompra("Ropa deportiva");
        ordenCompra3.setCliente(new Cliente("Carlos", "Barrios"));
        ordenCompra3.setDate(new Date());
        ordenCompra3.addProducto(new Producto("Nike","Zapatos", 250));
        ordenCompra3.addProducto(new Producto("Adidas","Gorra",50));
        ordenCompra3.addProducto(new Producto("Asics","Pantaloneta",100));
        ordenCompra3.addProducto(new Producto("Reebok","Camiseta", 80));

        OrdenCompra[] ordenes = {ordenCompra1,ordenCompra2,ordenCompra3};
        for (OrdenCompra orden : ordenes) {
            System.out.println("Folio: " + orden.getIdOrden());
            System.out.println("Cliente: " + orden.getCliente());
            System.out.println("Descripcion: " + orden.getDescripcion());
            System.out.println("Fecha: " + orden.getDate());
            System.out.println("Total: " + orden.getTotal());

            int i = 1;
            for (Producto p : orden.getProductos()) {
                System.out.println("Producto " + i + ": " + p.getNombre() + " " + p.getFabricante() + " precio $" + p.getPrecio());
                i++;
            }
            System.out.println("---------------------------------- siguiente --------------------------------------");
        }
    }
}
