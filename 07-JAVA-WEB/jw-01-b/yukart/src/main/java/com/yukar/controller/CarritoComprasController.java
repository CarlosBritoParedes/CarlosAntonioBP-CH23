package com.yukar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.yukar.model.CarritoCompras;
import com.yukar.service.CarritoComprasService;

@RestController
@RequestMapping("/api/carrito")
public class CarritoComprasController {

	@Autowired
	private CarritoComprasService carritoService;

	@GetMapping("/")
	public List<CarritoCompras> listarCarritos() {
		return carritoService.listarCarritos();
	}

	@GetMapping("/{id}")
	public CarritoCompras obtenerCarrito(@PathVariable Long id) {
		return carritoService.obtenerCarrito(id);
	}

	@PostMapping("/")
	public void guardarCarrito(@RequestBody CarritoCompras carrito) {
		carritoService.guardarCarrito(carrito);
	}

	@DeleteMapping("/{id}")
	public void eliminarCarrito(@PathVariable Long id) {
		carritoService.eliminarCarrito(id);
	}

}