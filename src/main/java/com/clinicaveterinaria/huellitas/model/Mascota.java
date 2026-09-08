package com.clinicaveterinaria.huellitas.model;

import com.clinicaveterinaria.huellitas.enums.TIPO;
import jakarta.persistence.*;

@Entity
@Table(name = "MASCOTAS")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "tipo", nullable = false)
    @Enumerated(EnumType.STRING)
    private TIPO tipo;

    @Column(name = "edad", nullable = false)
    private int edad;

    public Mascota() {
    }

    public Mascota(Long id, String nombre, TIPO tipo, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TIPO getTipo() {
        return tipo;
    }

    public void setTipo(TIPO tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}