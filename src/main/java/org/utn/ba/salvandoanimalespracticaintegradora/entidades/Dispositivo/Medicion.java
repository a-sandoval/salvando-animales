package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Dispositivo;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Medicion {
    private String medicion;
    private LocalDateTime fechaHoraMedicion;
    private Unidad unidad;
}
