package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Animal;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
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
