package com.yukar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yukar.model.DireccionEnvio;
import com.yukar.repository.DireccionEnvioRepository;

@Service
public class DireccionEnvioService {

	@Autowired
	private DireccionEnvioRepository direccionEnvioRepository;

	public List<DireccionEnvio> listarDireccionesEnvio() {
		return direccionEnvioRepository.findAll();
	}

	public DireccionEnvio obtenerDireccionEnvio(Long id) {
		return direccionEnvioRepository.findById(id).orElse(null);
	}

	public void guardarDireccionEnvio(DireccionEnvio direccionEnvio) {
		direccionEnvioRepository.save(direccionEnvio);
	}

	public void eliminarDireccionEnvio(Long id) {
		direccionEnvioRepository.deleteById(id);
	}
}