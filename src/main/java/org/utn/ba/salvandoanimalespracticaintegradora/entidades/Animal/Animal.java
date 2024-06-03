package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Animal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Animal {
    private Double pesoKg;
    private Double alturaEnMetros;
    private Especie especie;
    private String nombre;
}
