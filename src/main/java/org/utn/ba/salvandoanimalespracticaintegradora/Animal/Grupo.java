package org.utn.ba.salvandoanimalespracticaintegradora.Animal;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Grupo {
    private String color;
    private ArrayList<Animal> animales;

    public void aniadirAnimal(Animal a){this.animales.add(a);}
}
