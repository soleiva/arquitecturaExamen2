package ec.edu.espe.examen2leiva.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Turno {
    @Id
    private String id;

    @Indexed
    private String numTurno;

    private String cedula;
    private String nombreCliente;
    private String codUsuaioEjecutivo;
    private String nombreEjecutivo;
    private Date fechaCreacion;
    private Date fechaInicioAtencion;
    private Date fechaFinAtencion;
    private Integer calificacion;

    @Version
    private Long version;
}
