/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadestock;

import java.util.ArrayList;

/**
 *
 * @author iRb18
 */
public class Inventario {
    private ArrayList<Producto> productos;
    
    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p) {
        productos.add(p);
    }
    
    public void listarProductos() {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("\nLISTADO DE PRODUCTOS\n");
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
    }
    
    public Producto buscarProductoPorId(String id) {
        Producto productoEncontrado = null;
        int i = 0;
        while (i < productos.size() && productoEncontrado == null) {
            
            if (productos.get(i).getId().equalsIgnoreCase(id)) {
                productoEncontrado = productos.get(i);
            } 
            i++;
        }
        return productoEncontrado;
    }
    
    public boolean eliminarProducto(String id) {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            productos.remove(producto);
            return true;
        }
        return false;
    }
    
    public boolean actualizarStock(String id, int nuevaCantidad)  {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            producto.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        
        for (Producto producto : productos) {
            if (producto.getCategoria() == categoria) {
                filtrados.add(producto);
            }
        }
        
        return filtrados;
    }
    
    public int obtenerTotalStock() {
        int stockTotal = 0;
        
        for (Producto producto : productos) {
            stockTotal +=  producto.getCantidad();
        }

        return stockTotal;
    }
    
    public ArrayList<Producto> obtenerProductoConMayorStock() {
        ArrayList<Producto> productosConMayorStock = new ArrayList<>();
        int mayorStock = -1;
  
        for (Producto producto : productos) {
            if (producto.getCantidad() > mayorStock) {
                mayorStock = producto.getCantidad();
                productosConMayorStock.clear();
                productosConMayorStock.add(producto);
            } else if (producto.getCantidad() == mayorStock) {
                productosConMayorStock.add(producto);
            }
        }
        return  productosConMayorStock;
    }
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        
        for (Producto producto : productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                filtrados.add(producto);
            }
        }
        return filtrados;
    }
    
    public void mostrarCategoriasDisponibles() {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("\nCATEGORIAS DISPONIBLES\n");
        
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println((categoria.ordinal() + 1) + " - " + categoria + "\n");
        }
        
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
    }
}