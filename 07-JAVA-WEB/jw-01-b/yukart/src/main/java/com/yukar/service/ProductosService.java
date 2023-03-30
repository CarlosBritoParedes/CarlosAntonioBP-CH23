package com.yukar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yukar.model.Productos;
import com.yukar.repository.ProductosRepository;

@Service
public class ProductosService {
	
	@Autowired
	private ProductosRepository productosRepository;

	public List<Productos> listarProductos() {
		return productosRepository.findAll();
	}

	public Productos obtenerProducto(Long id) {
		return productosRepository.findById(id).orElse(null);
	}

	public void guardarProducto(Productos producto) {
		productosRepository.save(producto);
	}

	public void eliminarProducto(Long id) {
		productosRepository.deleteById(id);
	}

}