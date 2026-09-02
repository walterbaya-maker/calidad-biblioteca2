package com.biblioteca.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String email;

    private boolean activo;

    private boolean moroso;

    @OneToMany
    private List<Prestamo> prestamos = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.activo = true;
        this.moroso = false;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActivo() {
        return activo;
    }

    public boolean isMoroso() {
        return moroso;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setMoroso(boolean moroso) {
        this.moroso = moroso;
    }
}