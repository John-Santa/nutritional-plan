package co.com.smartworkout.nutririonalplan.model.plannutricional;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class ValoracionNutricional {

    private String fechaCreacion;
    private double biceps;
    private double abdomen;
    private double crestaIliaca;
    private double muslo;
    private double supraespinal;
    private double subescapular;
    private double pantorrilla;
    private double triceps;
    private double brazoRelajado;
    private double brazoContraido;
    private double cintura;
    private double cadera;
    private double perimetroMuslo;
    private double pierna;
    private String diagnostico;
}