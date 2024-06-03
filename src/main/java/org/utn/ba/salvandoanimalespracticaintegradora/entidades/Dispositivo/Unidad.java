package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Dispositivo;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

@Getter
@Setter
@Entity

public class Unidad extends Persistente {

    private String nombre;
    private String descripcion;

}
