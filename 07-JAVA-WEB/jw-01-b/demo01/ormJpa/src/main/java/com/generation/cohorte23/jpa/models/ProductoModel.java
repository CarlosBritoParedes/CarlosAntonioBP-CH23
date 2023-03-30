package com.generation.cohorte23.jpa.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity // La clase es una entidad de base de datos
@Table(name = "producto") // Nombre de la tabla a la que se mapeará esta entidad
public class ProductoModel {
    @Id // Clave primaria de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Valor del campo será generado automáticamente por la base de datos
    @Column(unique = true, nullable = false) // Este campo debe ser único y no puede ser nulo
    private Long id;
    private String nombreProducto;
    private Integer usuarioId;
    // Aqui empiezan los getters y setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public Integer getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }
}