package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Animal;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Grupo {
    private ColorGrupo color;
    private List<Animal> animales;

    public void agregar(Animal a){this.animales.add(a);}

    public Grupo() {
        animales =  new ArrayList<>();
    }
}
