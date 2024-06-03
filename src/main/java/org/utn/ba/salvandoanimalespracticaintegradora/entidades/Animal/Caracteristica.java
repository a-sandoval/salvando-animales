package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Animal;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

@Setter
@Getter
@Entity
public class Caracteristica extends Persistente {
    private String caracteristica;
    private String descripcion;
}
