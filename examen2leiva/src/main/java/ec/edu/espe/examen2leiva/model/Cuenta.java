package ec.edu.espe.examen2leiva.model;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cuenta {

    String numeroCuenta;
    String tipo;
    BigDecimal saldoPromedio;
    
}
