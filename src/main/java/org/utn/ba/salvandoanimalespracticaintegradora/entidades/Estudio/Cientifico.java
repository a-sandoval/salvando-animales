package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Estudio;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

@Setter
@Getter
@Entity
public class Cientifico extends Persistente {
    private String nombre;
    private String apellido;
    private Especialidad especialidad;
    private String matricula;
}
