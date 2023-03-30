package com.generation.cohorte23.jpa.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "orden")
public class DetalleOrdenModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombreDetalleOrden;
    private Integer ordenId;
    private Integer productoId;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombreDetalleOrden() {
        return nombreDetalleOrden;
    }
    public void setNombreDetalleOrden(String nombreDetalleOrden) {
        this.nombreDetalleOrden = nombreDetalleOrden;
    }
    public Integer getOrdenId() {
        return ordenId;
    }
    public void setOrdenId(Integer ordenId) {
        this.ordenId = ordenId;
    }
    public Integer getProductoId() {
        return productoId;
    }
    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }
    
    
}