package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Dispositivo;

import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.EstrategiaRecepcion.EstrategiaRecepcion;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Sensor {
    private Long identificador;
    private TipoSensor tipoSensor;
    private List<Medicion> mediciones;
    private EstrategiaRecepcion receptor;

    public Sensor() {
        mediciones = new ArrayList<>();
    }

    public void recibirMedicion(String s){
        this.receptor.recibir(s);
    }
    public void agregarMedicion(Medicion m){

    }
}
