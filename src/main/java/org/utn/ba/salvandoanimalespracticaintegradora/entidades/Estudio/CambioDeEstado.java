package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Estudio;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name="cambio_de_estado")
public class CambioDeEstado extends Persistente {

    @Enumerated(EnumType.STRING)
    @Column(name="estado_previo")
    private EstadoEstudio estadoPrevio;
    @Enumerated(EnumType.STRING)
    @Column(name="estado_siguiente")
    private EstadoEstudio estadoSiguiente;
    @Column(name="fecha")
    private LocalDateTime fecha;
}
