package ec.edu.espe.examen2leiva.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.examen2leiva.model.Ejecutivo;

@Repository
public interface EjecutivoRespository extends MongoRepository<Ejecutivo, String>{
    
    Ejecutivo findByCodigo(String codigo);
}
