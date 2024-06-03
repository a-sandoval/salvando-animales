package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Estudio;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CambioDeEstado {
    private Estudio estudio;
    private EstadoEstudio estadoPrevio;
    private EstadoEstudio estadoSiguiente;
    private LocalDateTime fecha;
}
