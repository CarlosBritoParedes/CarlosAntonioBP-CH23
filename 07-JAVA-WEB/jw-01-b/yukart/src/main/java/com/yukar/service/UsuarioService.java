package com.yukar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yukar.model.Usuario;
import com.yukar.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<Usuario> obtenerUsuarios() {
		return usuarioRepository.findAll();
	}

	public Usuario obtenerUsuarioPorId(Long id) {
		return usuarioRepository.findById(id).orElse(null);
	}

	public Usuario agregarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public Usuario actualizarUsuario(Long id, Usuario usuario) {
		Usuario usuarioExistente = usuarioRepository.findById(id).orElse(null);
		if (usuarioExistente == null) {
			return null;
		}
		usuarioExistente.setNombre_usuario(usuario.getNombre_usuario());
		usuarioExistente.setEmail(usuario.getEmail());
		usuarioExistente.setContrasenia(usuario.getContrasenia());
		return usuarioRepository.save(usuarioExistente);
	}

	public void eliminarUsuario(Long id) {
		usuarioRepository.deleteById(id);
	}
}