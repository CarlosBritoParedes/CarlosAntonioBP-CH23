package com.yukar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yukar.model.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Long> {

}