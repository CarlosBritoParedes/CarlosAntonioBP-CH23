package com.yukar.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Productos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	
	private Long id;
	private String nombre_producto;
	private float precio_producto;
	private Integer stock_producto;
	
	@ManyToOne
	private Categoria categoria;
	
	@OneToOne(mappedBy = "producto")
    private CarritoProducto carrito_productos;
	
	
	public Productos() {
		super();
	}

	public Productos(Long id, String nombre_producto, float precio_producto, Integer stock_producto) {
		super();
		this.id = id;
		this.nombre_producto = nombre_producto;
		this.precio_producto = precio_producto;
		this.stock_producto = stock_producto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public float getPrecio_producto() {
		return precio_producto;
	}

	public void setPrecio_producto(float precio_producto) {
		this.precio_producto = precio_producto;
	}

	public Integer getStock_producto() {
		return stock_producto;
	}

	public void setStock_producto(Integer stock_producto) {
		this.stock_producto = stock_producto;
	}
	
	
}
