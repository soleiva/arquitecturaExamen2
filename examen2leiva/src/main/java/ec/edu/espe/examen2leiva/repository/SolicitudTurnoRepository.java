package ec.edu.espe.examen2leiva.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.examen2leiva.model.SolicitudTurno;

@Repository
public interface SolicitudTurnoRepository extends MongoRepository<SolicitudTurno, String>{

    SolicitudTurno findByCedula(String cedula);
    
}
