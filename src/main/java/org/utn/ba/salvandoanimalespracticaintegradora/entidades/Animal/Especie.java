package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Animal;

import jakarta.persistence.Entity;
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
    private List<Caracteristica> caracteristicas;

    public Especie() {
        caracteristicas = new ArrayList<>();
    }
}

