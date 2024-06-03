package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Dispositivo;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Medicion extends Persistente {
    private String medicion;
    private LocalDateTime fechaHoraMedicion;
    private Unidad unidad;
}
