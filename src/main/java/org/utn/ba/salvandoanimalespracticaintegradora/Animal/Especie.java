package org.utn.ba.salvandoanimalespracticaintegradora.Animal;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class Especie {
    private String nombre;
    private String descripcion;
    private ArrayList<Caracteristica> caracteristicas;
}

