package com.yukar.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.yukar.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}