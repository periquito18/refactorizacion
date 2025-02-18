package com.endes.servicio;

public interface ProductManager {
	public void addProduct(String nombre, double precio);
	public void listProducts();
	public void findProduct(String searchName);
	
}
