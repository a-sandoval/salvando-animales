package org.utn.ba.salvandoanimalespracticaintegradora.Dispositivo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class Dispositivo {
    private Long numero;
    private ArrayList<Sensor> sensores;
}
