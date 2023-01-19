package ec.edu.espe.examen2leiva.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.examen2leiva.controller.dto.ClienteRS;
import ec.edu.espe.examen2leiva.controller.mapper.ClineteMapper;
import ec.edu.espe.examen2leiva.model.SolicitudTurno;
import ec.edu.espe.examen2leiva.service.SolicitudTurnoService;

@RestController
@RequestMapping(value = "api/client")
public class SolicitudTurnoController {

    private final SolicitudTurnoService solicitudTurnoService;

    public SolicitudTurnoController(SolicitudTurnoService solicitudTurnoService) {
        this.solicitudTurnoService = solicitudTurnoService;
    }

    @ResponseBody
    @RequestMapping(value = "/{cedula}", method = RequestMethod.GET)
    public ResponseEntity<ClienteRS> obtenerInformacionCliente(@PathVariable("cedula") String cedula) {
        
        SolicitudTurno solicitudTurno = this.solicitudTurnoService.findByCedula(cedula);
        if (solicitudTurno != null) {
            ClienteRS ClineteRS = ClineteMapper.toRequestServiceRS(solicitudTurno);
            return ResponseEntity.ok(ClineteRS);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
