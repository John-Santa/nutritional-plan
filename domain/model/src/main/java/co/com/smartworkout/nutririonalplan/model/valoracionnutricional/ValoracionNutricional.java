package co.com.smartworkout.nutririonalplan.model.valoracionnutricional;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class ValoracionNutricional {

    private String id;
    private String idPlanNutricional;
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
    private double peso;
    private double estatura;
    private String diagnostico;

    private double sumatoriaPliegues;
    private double porcentajeYuhasz;
    private double MLG;
    private double MG;

}
