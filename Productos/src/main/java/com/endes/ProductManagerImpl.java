package com.endes;

import java.util.ArrayList;
import java.util.List;

import com.endes.servicio.ProductManager;

public class ProductManagerImpl implements ProductManager {

	List<Products> productos = new ArrayList<Products>();
	
	/**
	 * 
	 */
	@Override
	public void addProduct(String nombre, double precio) {
		Products nuevo = new Products(nombre, precio);
		productos.add(nuevo);
	}
	
	/**
	 * 
	 */
	@Override
	public void listProducts() {
		 try {
	         if (productos.isEmpty()) {
	             throw new Exception("No hay productos para listar.");
	         }
	         for (int i = 0; i < productos.size(); i++) {
	             System.out.println("Producto " + (i + 1) + ": " + productos.get(i).getNombre() + " - Precio: " + productos.get(i).getPrecio());
	         }
	     } catch (Exception e) {
	         System.out.println("Error en listProducts: " + e.getMessage());
	     }
	}

	/**
	 * 
	 */
	@Override
	public void findProduct(String searchName) {
		boolean found = false;
	     for (int i = 0; i < productos.size(); i++) {
	         if (productos.get(i).getNombre().equalsIgnoreCase(searchName)) {
	             System.out.println("Producto encontrado: " + productos.get(i).getNombre() + " - Precio: " + productos.get(i).getPrecio());
	             found = true;
	             break;
	         }
	     }
	     if (!found) {
	         try {
	             throw new Exception("Producto no encontrado: " + searchName);
	         } catch (Exception e) {
	             System.out.println("Error en findProduct: " + e.getMessage());
	         }
	     }
	}
}
