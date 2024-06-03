package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Estudio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class CambioDeEstado extends Persistente {

    private EstadoEstudio estadoPrevio;
    private EstadoEstudio estadoSiguiente;
    private LocalDateTime fecha;
}
