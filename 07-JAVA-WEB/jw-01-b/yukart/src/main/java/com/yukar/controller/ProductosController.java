package com.yukar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.ModelAndView;

import com.yukar.model.Categoria;
import com.yukar.model.Productos;
import com.yukar.service.CategoriaService;
import com.yukar.service.ProductosService;

@Controller
public class ProductosController {
	
	@Autowired
	private ProductosService productosService;
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/productos")
	public ModelAndView listarProductos() {
		List<Productos> listaProductos = productosService.listarProductos();
		ModelAndView mav = new ModelAndView("productos");
		mav.addObject("listaProductos", listaProductos);
		return mav;
	}
	
	@GetMapping("/productos/nuevo")
	public String nuevoProducto(Model model) {
		List<Categoria> listaCategorias = categoriaService.listarCategorias();
		model.addAttribute("listaCategorias", listaCategorias);
		return "producto-form";
	}
	
	@PostMapping("/productos/guardar")
	public String guardarProducto(Productos producto) {
		productosService.guardarProducto(producto);
		return "redirect:/productos";
	}
	
	@GetMapping("/productos/editar/{id}")
	public String editarProducto(@PathVariable Long id, Model model) {
		Productos producto = productosService.obtenerProducto(id);
		model.addAttribute("producto", producto);
		List<Categoria> listaCategorias = categoriaService.listarCategorias();
		model.addAttribute("listaCategorias", listaCategorias);
		return "producto-form";
	}
	
	@GetMapping("/productos/eliminar/{id}")
	public String eliminarProducto(@PathVariable Long id) {
		productosService.eliminarProducto(id);
		return "redirect:/productos";
	}

}
