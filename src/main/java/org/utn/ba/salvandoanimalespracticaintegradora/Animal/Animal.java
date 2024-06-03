package org.utn.ba.salvandoanimalespracticaintegradora.Animal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Animal {
    private double pesoKg;
    private double alturaEnMetros;
    private Especie especie;
    private String nombre;
}
