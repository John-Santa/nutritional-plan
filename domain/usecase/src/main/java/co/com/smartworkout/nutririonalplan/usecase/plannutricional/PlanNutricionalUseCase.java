package co.com.smartworkout.nutririonalplan.usecase.plannutricional;

import co.com.smartworkout.nutririonalplan.model.plannutricional.PlanNutricional;
import co.com.smartworkout.nutririonalplan.model.plannutricional.gateways.PlanNutricionalRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PlanNutricionalUseCase {

    private final PlanNutricionalRepository planNutricionalRepository;

    public void crear(PlanNutricional planNutricional) {
        planNutricionalRepository.crear(planNutricional);
    }

    public PlanNutricional consultarPorIdCliente(String idCliente) {
        return planNutricionalRepository.consultarPorIdCliente(idCliente);
    }

    public PlanNutricional consultarPorIdNutricionista(String idNutricionista) {
        return planNutricionalRepository.consultarPorIdNutricionista(idNutricionista);
    }

    public void actualizar(String  idNutricionista, PlanNutricional planNutricional) {
        planNutricionalRepository.actualizar(idNutricionista, planNutricional);
    }

    public void eliminar(String  idNutricionista) {
        planNutricionalRepository.eliminar(idNutricionista);
    }

//    public void agregarValoracionNutricional(String  idNutricionista, ValoracionNutricional valoracionNutricional) {
//        planNutricionalRepository.agregarValoracionNutricional(idNutricionista, valoracionNutricional);
//    }

}
