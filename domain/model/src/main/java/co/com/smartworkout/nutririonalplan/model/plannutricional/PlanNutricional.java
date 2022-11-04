package co.com.smartworkout.nutririonalplan.model.plannutricional;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class PlanNutricional {

    private String id;
    private String idNutricionista;
    private String idCliente;
    private String objetivoNutricional;
    private Double kiloCaloriasDiarias;
    private String recomendaciones;
//    private ValoracionNutricional valoracionNutricional;

}
