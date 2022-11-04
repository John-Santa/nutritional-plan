package co.com.smartworkout.nutririonalplan.model.plannutricional.gateways;

import co.com.smartworkout.nutririonalplan.model.plannutricional.PlanNutricional;
import co.com.smartworkout.nutririonalplan.model.plannutricional.ValoracionNutricional;

public interface PlanNutricionalRepository {

    void crear(PlanNutricional planNutricional);

    PlanNutricional consultarPorIdCliente(String idCliente);

    PlanNutricional consultarPorIdNutricionista(String idNutricionista);

    void actualizar(String idPlanNutricional, PlanNutricional planNutricional);

    void eliminar(String idPlanNutricional);

//    void agregarValoracionNutricional(String idPlanNutricional, ValoracionNutricional valoracionNutricional);

}
