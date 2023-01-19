package ec.edu.espe.examen2leiva.controller.mapper;

import ec.edu.espe.examen2leiva.controller.dto.ClienteRS;
import ec.edu.espe.examen2leiva.model.SolicitudTurno;

public class ClineteMapper {
    public static ClienteRS toRequestServiceRS(SolicitudTurno solicitudTurno) {
        return ClienteRS.builder()
        .apellidos(solicitudTurno.getApellidos())
        .cedula(solicitudTurno.getCedula())
        .nombres(solicitudTurno.getNombres()).build();
    }
}
