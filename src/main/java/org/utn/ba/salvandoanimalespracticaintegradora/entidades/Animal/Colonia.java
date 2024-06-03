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
public class Colonia extends Persistente {
    private String nombre;
    private List<Grupo> grupos;

    public Colonia() {
        grupos = new ArrayList<>();
    }
}
