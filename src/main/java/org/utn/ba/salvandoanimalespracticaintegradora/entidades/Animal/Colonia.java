package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Animal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
public class Colonia extends Persistente {

    @Column
    private String nombre;
    @OneToMany
    @JoinColumn(name="colonia_id", referencedColumnName = "id")
    private List<Grupo> grupos;

    public Colonia() {
        grupos = new ArrayList<>();
    }
}
