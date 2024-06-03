package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Auditador;

public class GestorAuditoriaExterna {

    private String urlExterna;
    private AdapterAuditoriaExterna adapterAuditoria;

    public Boolean enviarPDFInforme(Long estudioID, String path) {
        return true;
    }

    public Boolean recibirPDFParaFirmaDigital(Long estudioID, String url) {
        return true;
    }
}
