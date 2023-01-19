package ec.edu.espe.examen2leiva.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "ejecutivo")
public class Ejecutivo {
    
    @Id
    private String id;

    private String codigo;
    private String nombreCompleto;
    private String numEscritorio;

    @Version
    private Long version;
    
}
