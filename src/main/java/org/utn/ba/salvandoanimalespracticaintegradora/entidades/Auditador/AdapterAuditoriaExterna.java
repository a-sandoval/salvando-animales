package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Auditador;

public interface AdapterAuditoriaExterna {

    Boolean enviarPDFInforme(Long estudioID, String path);

    Boolean recibirPDFFirmaDigital(Long estudioID, String url);
}
