package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Estudio;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

@Setter
@Getter
@Entity
@Table(name="cientifico")
public class Cientifico extends Persistente {
    @Column
    private String nombre;
    @Column
    private String apellido;

    @ManyToOne
    @JoinColumn(name="especialidad_id", referencedColumnName = "id")
    private Especialidad especialidad;
    @Column
    private String matricula;
}
