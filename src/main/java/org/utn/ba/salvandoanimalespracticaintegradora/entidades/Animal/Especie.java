package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Animal;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Especie {
    private String nombre;
    private String descripcion;
    private List<Caracteristica> caracteristicas;

    public Especie() {
        caracteristicas = new ArrayList<>();
    }
}

