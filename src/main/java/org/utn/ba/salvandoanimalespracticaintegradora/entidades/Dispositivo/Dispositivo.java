package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Dispositivo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Dispositivo {
    private Long numero;
    private List<Sensor> sensores;

    public Dispositivo() {
        sensores = new ArrayList<>();
    }
}
