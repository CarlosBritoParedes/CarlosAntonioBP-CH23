package com.yukar.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yukar.model.Pago;
import com.yukar.service.PagoService;

@RestController
public class PagoController {

	@Autowired
	private PagoService pagoService;
	
	@PostMapping("/pago")
	public Pago addPago(@RequestBody Pago pago) {
		return pagoService.addPago(pago);
	}
	
	@GetMapping("/pago/{id}")
	public Pago getPagoById(@PathVariable Long id) {
		return pagoService.getPagoById(id);
	}
}
