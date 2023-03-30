package com.yukar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.yukar.model.Usuario;
import com.yukar.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("")
	public ResponseEntity<List<Usuario>> obtenerUsuarios() {
		List<Usuario> usuarios = usuarioService.obtenerUsuarios();
		return new ResponseEntity<>(usuarios, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Usuario> obtenerUsuarioPorId(@PathVariable Long id) {
		Usuario usuario = usuarioService.obtenerUsuarioPorId(id);
		return new ResponseEntity<>(usuario, HttpStatus.OK);
	}

	@PostMapping("")
	public ResponseEntity<Usuario> agregarUsuario(@RequestBody Usuario usuario) {
		Usuario nuevoUsuario = usuarioService.agregarUsuario(usuario);
		return new ResponseEntity<>(nuevoUsuario, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Usuario> actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
		Usuario usuarioActualizado = usuarioService.actualizarUsuario(id, usuario);
		return new ResponseEntity<>(usuarioActualizado, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminarUsuario(@PathVariable Long id) {
		usuarioService.eliminarUsuario(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}