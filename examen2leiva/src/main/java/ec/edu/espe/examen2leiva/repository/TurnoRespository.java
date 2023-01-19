package ec.edu.espe.examen2leiva.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.examen2leiva.model.Turno;



@Repository
public interface TurnoRespository extends MongoRepository<Turno, String>{

    Turno findByNumTurnoAndCodUsuaioEjecutivo(String numTurno, String codUsuaioEjecutivo);
    Turno findByTurno(String turno);


    
}
