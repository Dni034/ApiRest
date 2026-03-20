package com.dania.pm;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Registro {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime fechaRegistro;
    
 
    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
 
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
 
    public LocalDateTime getFechaRegistro() { return fechaRegistro; }

}
