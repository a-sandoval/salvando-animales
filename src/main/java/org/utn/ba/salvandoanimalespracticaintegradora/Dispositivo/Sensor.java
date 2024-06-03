package org.utn.ba.salvandoanimalespracticaintegradora.Dispositivo;

import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.EstrategiaRecepcion.EstrategiaRecepcion;

import java.util.ArrayList;

@Getter
@Setter
public class Sensor {
    private Long identificador;
    private TipoSensor tipoSensor;
    private ArrayList<Medicion> mediciones;
    private EstrategiaRecepcion receptor;

    public void recibirMedicion(String s){

    }
    public void agregarMedicion(Medicion m){

    }
}
