package org.utn.ba.salvandoanimalespracticaintegradora.entidades;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDate;

@MappedSuperclass
public abstract class Persistente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
