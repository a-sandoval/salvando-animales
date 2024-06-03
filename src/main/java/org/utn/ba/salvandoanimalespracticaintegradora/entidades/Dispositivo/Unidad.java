package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Dispositivo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

@Getter
@Setter
@Entity
@Table
public class Unidad extends Persistente {

    @Column
    private String nombre;

    @Column
    private String descripcion;

}
