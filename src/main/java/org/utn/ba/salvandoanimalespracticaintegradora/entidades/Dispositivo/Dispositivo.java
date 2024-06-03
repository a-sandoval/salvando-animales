package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Dispositivo;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
public class Dispositivo extends Persistente {
    private Long numero;
    private List<Sensor> sensores;

    public Dispositivo() {
        sensores = new ArrayList<>();
    }
}
