package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Animal;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Colonia {
    private String nombre;
    private List<Grupo> grupos;

    public Colonia() {
        grupos = new ArrayList<>();
    }
}
