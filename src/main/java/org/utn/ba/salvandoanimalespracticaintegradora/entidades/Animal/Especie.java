package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Animal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
public class Especie extends Persistente {

    @Column
    private String nombre;

    @Column
    private String descripcion;
    @ManyToMany
    @JoinTable(inverseJoinColumns = @JoinColumn(name="caracteristica_id", referencedColumnName = "id"), joinColumns =  @JoinColumn(name="especia_id", referencedColumnName = "id"))
    private List<Caracteristica> caracteristicas;

    public Especie() {
        caracteristicas = new ArrayList<>();
    }
}

