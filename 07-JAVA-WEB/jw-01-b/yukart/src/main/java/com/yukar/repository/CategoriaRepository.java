package com.yukar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yukar.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
