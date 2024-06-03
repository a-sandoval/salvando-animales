package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Animal;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Grupo extends Persistente {
    private ColorGrupo color;
    private List<Animal> animales;

    public void agregar(Animal a){this.animales.add(a);}

    public Grupo() {
        animales =  new ArrayList<>();
    }
}
