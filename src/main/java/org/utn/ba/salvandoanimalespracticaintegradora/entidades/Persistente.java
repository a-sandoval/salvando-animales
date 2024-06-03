package org.utn.ba.salvandoanimalespracticaintegradora.entidades;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDate;

@MappedSuperclass
public abstract class Persistente {
    @Id
    @GeneratedValue
    private Long id;

    private Boolean activo;

    private LocalDate fecha_creacion;
}
