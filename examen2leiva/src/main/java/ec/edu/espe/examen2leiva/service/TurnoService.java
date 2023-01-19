package ec.edu.espe.examen2leiva.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import ec.edu.espe.examen2leiva.model.Ejecutivo;
import ec.edu.espe.examen2leiva.model.SolicitudTurno;
import ec.edu.espe.examen2leiva.model.Turno;
import ec.edu.espe.examen2leiva.repository.SolicitudTurnoRepository;
import ec.edu.espe.examen2leiva.repository.TurnoRespository;

@Service
public class TurnoService {
    private final TurnoRespository turnoRespository;
   

    

    public TurnoService(TurnoRespository turnoRespository) {
        this.turnoRespository = turnoRespository;
    }



    public void guardarTurno(Turno turno) {
        SolicitudTurno solicitudTurno;
        Ejecutivo ejecutivo;
        try {
          turnoRespository.save(Turno.builder()
            .cedula(solicitudTurno.getCedula())
            .nombreCliente(solicitudTurno.getNombres()+solicitudTurno.getApellidos())
            .codUsuaioEjecutivo(ejecutivo.getCodigo())
            .numTurno("TN1")
            .nombreEjecutivo(ejecutivo.getNombreCompleto())
            .fechaCreacion(new Date())
            .fechaInicioAtencion(new Date())
            .fechaFinAtencion(new Date())
            .calificacion(5)).build();

                        
        
        } catch (Exception e) {
            throw e;
        }

    }

    
}
