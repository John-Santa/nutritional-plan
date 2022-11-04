package co.com.smartworkout.nutririonalplan.jpa;


import co.com.smartworkout.nutririonalplan.model.plannutricional.PlanNutricional;
import co.com.smartworkout.nutririonalplan.model.plannutricional.ValoracionNutricional;
import co.com.smartworkout.nutririonalplan.model.plannutricional.gateways.PlanNutricionalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class JPAPlanNutricionalImpl implements PlanNutricionalRepository {

    private JPAPlanNutricionalRepositoryAdapter jpaPlanNutricionalRepositoryAdapter;

    @Override
    public void crear(PlanNutricional planNutricional) {
        jpaPlanNutricionalRepositoryAdapter.save(planNutricional);
    }

    @Override
    public PlanNutricional consultarPorIdCliente(String idCliente) {
        return jpaPlanNutricionalRepositoryAdapter.findByIdCliente(idCliente);
    }

    @Override
    public PlanNutricional consultarPorIdNutricionista(String idNutricionista) {
        return jpaPlanNutricionalRepositoryAdapter.findByIdNutricionista(idNutricionista);
    }

    @Override
    public void actualizar(String idPlanNutricional, PlanNutricional planNutricional) {
        PlanNutricional planNutricionalConsultado = jpaPlanNutricionalRepositoryAdapter.findById(idPlanNutricional);

        if (planNutricionalConsultado == null) {
            throw new RuntimeException("No existe el plan nutricional");
        } else {
//            ValoracionNutricional valoracionNutricional = planNutricional.getValoracionNutricional();
            planNutricionalConsultado.setObjetivoNutricional(planNutricional.getObjetivoNutricional());
            planNutricionalConsultado.setKiloCaloriasDiarias(planNutricional.getKiloCaloriasDiarias());
            planNutricionalConsultado.setRecomendaciones(planNutricional.getRecomendaciones());
//            planNutricionalConsultado.setValoracionNutricional(valoracionNutricional);
            jpaPlanNutricionalRepositoryAdapter.save(planNutricionalConsultado);
        }
    }

    @Override
    public void eliminar(String idPlanNutricional) {
        jpaPlanNutricionalRepositoryAdapter.deleteById(idPlanNutricional);
    }
//
//    @Override
//    public void agregarValoracionNutricional(String idPlanNutricional, ValoracionNutricional valoracionNutricional) {
//        // TODO Auto-generated method stub
//    }
}
