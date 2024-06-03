package org.utn.ba.salvandoanimalespracticaintegradora.Animal;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class Colonia {
    private String nombre;
    private ArrayList<Grupo> grupos;
}
