package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Animal;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
public class Especie extends Persistente {
    private String nombre;
    private String descripcion;
    @ManyToMany
    @JoinTable(inverseJoinColumns = @JoinColumn(name="caracteristica_id", referencedColumnName = "id"), joinColumns =  @JoinColumn(name="especia_id", referencedColumnName = "id"))
    private List<Caracteristica> caracteristicas;

    public Especie() {
        caracteristicas = new ArrayList<>();
    }
}

