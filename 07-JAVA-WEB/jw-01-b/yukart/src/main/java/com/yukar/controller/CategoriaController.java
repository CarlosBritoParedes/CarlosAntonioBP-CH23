package com.yukar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.yukar.model.Categoria;
import com.yukar.service.CategoriaService;

@Controller
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/categorias")
	public String listaCategorias(Model model) {
		model.addAttribute("categorias", categoriaService.listarCategorias());
		return "listaCategorias";
	}
	
	@GetMapping("/categoria/{id}")
	public String mostrarCategoria(@PathVariable("id") Long id, Model model) {
		model.addAttribute("categoria", categoriaService.obtenerCategoria(id));
		return "mostrarCategoria";
	}
	
	@GetMapping("/nuevaCategoria")
	public String nuevaCategoria(Model model) {
		model.addAttribute("categoria", new Categoria());
		return "formCategoria";
	}
	
	@PostMapping("/guardarCategoria")
	public String guardarCategoria(Categoria categoria) {
		categoriaService.guardarCategoria(categoria);
		return "redirect:/categorias";
	}
	
	@GetMapping("/editarCategoria/{id}")
	public String editarCategoria(@PathVariable("id") Long id, Model model) {
		model.addAttribute("categoria", categoriaService.obtenerCategoria(id));
		return "formCategoria";
	}
	
	@GetMapping("/eliminarCategoria/{id}")
	public String eliminarCategoria(@PathVariable("id") Long id) {
		categoriaService.eliminarCategoria(id);
		return "redirect:/categorias";
	}

}