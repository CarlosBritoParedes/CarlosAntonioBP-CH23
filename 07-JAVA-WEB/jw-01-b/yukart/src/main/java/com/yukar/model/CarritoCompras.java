package com.yukar.model;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "carrito_compras")
public class CarritoCompras{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	
	private Long id;
	private String fecha;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToMany(mappedBy = "carrito_compras")
	private ArrayList<DireccionEnvio>direccion_envio;
	
	@OneToOne(mappedBy = "carrito_compras")
    private CarritoProducto carrito_productos;
	
	public CarritoCompras() {
		super();
	}

	public CarritoCompras(Long id, String fecha) {
		super();
		this.id = id;
		this.fecha = fecha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	
}
