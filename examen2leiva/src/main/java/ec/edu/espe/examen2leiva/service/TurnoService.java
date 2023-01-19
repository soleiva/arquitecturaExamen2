package ec.edu.espe.examen2leiva.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ec.edu.espe.examen2leiva.model.Ejecutivo;
import ec.edu.espe.examen2leiva.model.SolicitudTurno;
import ec.edu.espe.examen2leiva.model.Turno;
import ec.edu.espe.examen2leiva.repository.EjecutivoRespository;
import ec.edu.espe.examen2leiva.repository.SolicitudTurnoRepository;
import ec.edu.espe.examen2leiva.repository.TurnoRespository;

@Service
public class TurnoService {
    private final TurnoRespository turnoRespository;
    private final EjecutivoRespository ejecutivoRespository;


    public TurnoService(TurnoRespository turnoRespository, EjecutivoRespository ejecutivoRespository) {
        this.turnoRespository = turnoRespository;
        this.ejecutivoRespository = ejecutivoRespository;
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

    public void iniciAtencion(String numTurno, String codUsuarioEjecutivo) {
        Turno optional = this.turnoRespository.findByNumTurnoAndCodUsuaioEjecutivo(numTurno,
                codUsuarioEjecutivo);
        Ejecutivo optEjecutivo = this.ejecutivoRespository.findByCodigo(codUsuarioEjecutivo);
        if (optional != null && optEjecutivo != null) {
            
            optional.setFechaCreacion(new Date());;
            Ejecutivo ejecutivo = optEjecutivo.get();
            ejecutivo.setAsignado(false);
            try {
                this.turnoRepository.save(turno);
                this.ejecutivoRepository.save(ejecutivo);
            } catch (Exception e) {
                throw new CustomRuntimeException("Ha ocurrido un error", ResponseCodeUtils.INTERNAL_ERROR_SERVER.code);
            }
        } else {
            throw new CustomRuntimeException("El turno no ha sido encontrado", ResponseCodeUtils.NOT_FOUND.code);
        }
    }

    
}
