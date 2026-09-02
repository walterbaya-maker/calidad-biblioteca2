package com.biblioteca.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fechaPrestamo;

    private LocalDate fechaDevolucion;

    private boolean devuelto;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Libro libro;

    public Prestamo() {
    }

    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = LocalDate.now();
        this.devuelto = false;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void devolver() {
        this.devuelto = true;
        this.fechaDevolucion = LocalDate.now();
    }
}