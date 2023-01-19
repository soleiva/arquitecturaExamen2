package ec.edu.espe.examen2leiva.service;

import org.springframework.stereotype.Service;

import ec.edu.espe.examen2leiva.controller.SolicitudTurnoController;
import ec.edu.espe.examen2leiva.model.SolicitudTurno;
import ec.edu.espe.examen2leiva.repository.SolicitudTurnoRepository;

@Service
public class SolicitudTurnoService {

    private final SolicitudTurnoRepository solicitudTurnoRepository;

    

    public SolicitudTurnoService(SolicitudTurnoRepository solicitudTurnoRepository) {
        this.solicitudTurnoRepository = solicitudTurnoRepository;
    }



    public SolicitudTurno findByCedula(String cedula) {
        try {
            return solicitudTurnoRepository.findByCedula(cedula);
        } catch (Exception e) {
            throw e;
        }
    }
    
}
