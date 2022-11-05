package co.com.smartworkout.nutririonalplan.model.plannutricional.gateways;

import co.com.smartworkout.nutririonalplan.model.plannutricional.PlanNutricional;

public interface PlanNutricionalRepository {

    void crear(PlanNutricional planNutricional);

    PlanNutricional consultarPorIdCliente(String idCliente);

    PlanNutricional consultarPorIdNutricionista(String idNutricionista);

    void actualizar(String idPlanNutricional, PlanNutricional planNutricional);

    void eliminar(String idPlanNutricional);

}
