package com.yukar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yukar.model.Categoria;
import com.yukar.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public List<Categoria> listarCategorias() {
		return categoriaRepository.findAll();
	}

	public Categoria obtenerCategoria(Long id) {
		return categoriaRepository.findById(id).orElse(null);
	}

	public void guardarCategoria(Categoria categoria) {
		categoriaRepository.save(categoria);
	}

	public void eliminarCategoria(Long id) {
		categoriaRepository.deleteById(id);
	}

}