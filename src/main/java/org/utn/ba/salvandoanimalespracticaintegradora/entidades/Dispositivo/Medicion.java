package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Dispositivo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table
public class Medicion extends Persistente {

    @Column
    private String medicion;
    @Column
    private LocalDateTime fechaHoraMedicion;
    @ManyToOne
    @JoinColumn(name = "unidad_id", referencedColumnName = "id")
    private Unidad unidad;
}
