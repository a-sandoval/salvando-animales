package org.utn.ba.salvandoanimalespracticaintegradora.GeneradorInformes;

import org.utn.ba.salvandoanimalespracticaintegradora.Estudio.Estudio;
import org.utn.ba.salvandoanimalespracticaintegradora.Estudio.Seccion;

import java.util.ArrayList;

public interface GeneradorInforme {
    public ArrayList<Seccion> generarSecciones(Estudio e );
}
