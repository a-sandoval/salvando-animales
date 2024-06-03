package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Animal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "grupo")
public class Grupo extends Persistente {
    @Embedded
    private ColorGrupo color;
    @OneToMany
    @JoinColumn(name="grupo_id", referencedColumnName = "id")
    private List<Animal> animales;

    public void agregar(Animal a){this.animales.add(a);}

    public Grupo() {
        animales =  new ArrayList<>();
    }
}
