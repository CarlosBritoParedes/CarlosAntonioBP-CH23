package com.yukar.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.yukar.model.CarritoProducto;

public interface CarritoProductoRepository extends JpaRepository<CarritoProducto, Long> {

}