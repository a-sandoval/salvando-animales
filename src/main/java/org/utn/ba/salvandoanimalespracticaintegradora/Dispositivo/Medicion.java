package org.utn.ba.salvandoanimalespracticaintegradora.Dispositivo;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Medicion {
    private String medicion;
    private LocalDateTime horaMedicion;
    private String unidad;
}
