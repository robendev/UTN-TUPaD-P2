/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadestock;

import java.util.ArrayList;

/**
 *
 * @author iRb18
 */
public class Principal {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // 1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario
        Producto p1 = new Producto("001", "Arroz", 1200, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("002", "Celular", 2500, 20, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("003", "Remera", 1500, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("004", "Silla", 3000, 80, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("005", "Notebook", 2800, 20, CategoriaProducto.ELECTRONICA);
        
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        inventario.listarProductos();

        // 3. Buscar un producto por ID y mostrar su información
        System.out.println("\nBuscar producto por ID '003':");
        Producto buscado = inventario.buscarProductoPorId("003");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }

        // 4. Filtrar y mostrar productos que pertenezcan a una categoría específica
        System.out.println("\nProductos de categoría ELECTRONICA:");
        ArrayList<Producto> filtrados = inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        if (filtrados.isEmpty()) {
            System.out.println("La categoria " + CategoriaProducto.ELECTRONICA + " esta vacia.");
        } else {
            for (Producto filtrado : filtrados) {
                filtrado.mostrarInfo();
            }
        }

        // 5. Eliminar un producto por su ID y listar los productos restantes.  
        System.out.println("\nEliminando producto con ID '002'...");
        if (inventario.eliminarProducto("002")) {
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }

        System.out.println("\nListado actualizado de productos:");
        inventario.listarProductos();

        // 6. Actualizar el stock de un producto existente
        System.out.println("\nActualizando stock del producto '001' a 80 unidades...");
        if (inventario.actualizarStock("001", 80)) {
            Producto productoActualizado = inventario.buscarProductoPorId("001");
            System.out.println("Stock actualizado correctamente.");
            productoActualizado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }
        
        // 7. Mostrar el total de stock disponible
        System.out.println("\nTotal de stock disponible: " + inventario.obtenerTotalStock());

        // 8. Obtener y mostrar el producto con mayor stock
        System.out.println("\nProducto(s) con mayor stock:");
        ArrayList<Producto> productosConMayorStock = inventario.obtenerProductoConMayorStock();
        if (productosConMayorStock.isEmpty()) {
            System.out.println("Inventario vacio.");
        } else {
            for (Producto producto : productosConMayorStock) {
                producto.mostrarInfo();
            }
        }

        // 9. Filtrar productos con precios entre $1250 y $3000
        System.out.println("\nProductos con precio entre $1250 y $3000:");
        ArrayList<Producto> filtradosPorPrecio = inventario.filtrarProductosPorPrecio(1250, 3000);
        if (filtradosPorPrecio.isEmpty()) {
            System.out.println("No se han encontrado coincidencias.");
        } else {
            for (Producto producto : filtradosPorPrecio) {
                producto.mostrarInfo();
            }
        }

        // 10. Mostrar las categorías disponibles con sus descripciones
        inventario.mostrarCategoriasDisponibles();
    }  
}