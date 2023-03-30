package com.yukar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yukar.model.CarritoCompras;
import com.yukar.repository.CarritoComprasRepository;

@Service
public class CarritoComprasService {
	
	@Autowired
	private CarritoComprasRepository carritoComprasRepository;

	public List<CarritoCompras> listarCarritos() {
		return carritoComprasRepository.findAll();
	}

	public CarritoCompras obtenerCarrito(Long id) {
		return carritoComprasRepository.findById(id).orElse(null);
	}

	public void guardarCarrito(CarritoCompras carrito) {
		carritoComprasRepository.save(carrito);
	}

	public void eliminarCarrito(Long id) {
		carritoComprasRepository.deleteById(id);
	}

}