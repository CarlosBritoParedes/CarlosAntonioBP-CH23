package com.yukar.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yukar.model.DireccionEnvio;
import com.yukar.service.DireccionEnvioService;

@RestController
@RequestMapping("/direccionEnvio")
public class DireccionEnvioController {

	@Autowired
	private DireccionEnvioService direccionEnvioService;

	@GetMapping("/listar")
	public List<DireccionEnvio> listarDireccionesEnvio() {
		return direccionEnvioService.listarDireccionesEnvio();
	}

	@GetMapping("/{id}")
	public ResponseEntity<DireccionEnvio> obtenerDireccionEnvio(@PathVariable("id") Long id) {
		DireccionEnvio direccionEnvio = direccionEnvioService.obtenerDireccionEnvio(id);
		if (direccionEnvio != null) {
			return new ResponseEntity<>(direccionEnvio, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/guardar")
	public ResponseEntity<DireccionEnvio> guardarDireccionEnvio(@RequestBody DireccionEnvio direccionEnvio) {
		direccionEnvioService.guardarDireccionEnvio(direccionEnvio);
		return new ResponseEntity<>(direccionEnvio, HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> eliminarDireccionEnvio(@PathVariable("id") Long id) {
		try {
			direccionEnvioService.eliminarDireccionEnvio(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}