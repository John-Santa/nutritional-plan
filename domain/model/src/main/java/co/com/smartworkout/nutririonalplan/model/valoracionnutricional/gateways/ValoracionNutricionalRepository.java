package co.com.smartworkout.nutririonalplan.model.valoracionnutricional.gateways;

import co.com.smartworkout.nutririonalplan.model.valoracionnutricional.ValoracionNutricional;

public interface ValoracionNutricionalRepository {

        void crear(ValoracionNutricional valoracionNutricional);

        ValoracionNutricional buscarPorIdPlanNutricional(String idPlanNutricional);

        ValoracionNutricional actualizar(String id, ValoracionNutricional valoracionNutricional);

}
