package com.yukar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yukar.model.Pago;
import com.yukar.repository.PagoRepository;

@Service
public class PagoService {

	@Autowired
	private PagoRepository pagoRepository;
	
	public Pago addPago(Pago pago) {
		return pagoRepository.save(pago);
	}
	
	public Pago getPagoById(Long id) {
		return pagoRepository.findById(id).orElse(null);
	}
}