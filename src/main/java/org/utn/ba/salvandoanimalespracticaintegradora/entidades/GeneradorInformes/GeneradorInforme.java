package org.utn.ba.salvandoanimalespracticaintegradora.entidades.GeneradorInformes;

import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Estudio.Estudio;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Estudio.Seccion;

import java.util.List;

public interface GeneradorInforme {
    public List<Seccion> generarSecciones(Estudio e );
}
