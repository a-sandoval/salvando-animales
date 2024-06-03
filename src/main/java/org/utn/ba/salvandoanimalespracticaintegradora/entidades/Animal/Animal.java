package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Animal;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

@Getter
@Setter
@Entity
public class Animal extends Persistente {
    private Double pesoKg;
    private Double alturaEnMetros;
    private Especie especie;
    private String nombre;
}
