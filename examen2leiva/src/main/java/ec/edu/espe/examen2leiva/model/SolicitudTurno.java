package ec.edu.espe.examen2leiva.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "turno")
public class SolicitudTurno {
    @Id
    private String id;

    private String cedula;
    private String nombres;
    private String apellidos;
    private Date fechaNacimineto;
    private String direccion;
    private String telefono;
    private String correo;

    private List<Cuenta> cuentas;

    @Version
    private Long version;

}
