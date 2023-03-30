package com.yukar.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yukar.model.CarritoProducto;
import com.yukar.service.CarritoProductoService;

@RestController
@RequestMapping("/api/carrito-productos")
public class CarritoProductoController {
	
	@Autowired
	private CarritoProductoService carritoProductoService;

	@GetMapping("/{id}")
	public CarritoProducto getCarritoProducto(@PathVariable Long id) {
		return carritoProductoService.getCarritoProducto(id);
	}
	
	@PostMapping("/")
	public CarritoProducto saveCarritoProducto(@RequestBody CarritoProducto carritoProducto) {
		return carritoProductoService.saveCarritoProducto(carritoProducto);
	}
	
}