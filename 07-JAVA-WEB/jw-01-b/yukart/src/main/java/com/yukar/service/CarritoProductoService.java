package com.yukar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yukar.model.CarritoProducto;
import com.yukar.repository.CarritoProductoRepository;

@Service
public class CarritoProductoService {
	
	@Autowired
	private CarritoProductoRepository carritoProductoRepository;

	public CarritoProducto getCarritoProducto(Long id) {
		return carritoProductoRepository.findById(id).orElse(null);
	}

	public CarritoProducto saveCarritoProducto(CarritoProducto carritoProducto) {
		return carritoProductoRepository.save(carritoProducto);
	}
	
}