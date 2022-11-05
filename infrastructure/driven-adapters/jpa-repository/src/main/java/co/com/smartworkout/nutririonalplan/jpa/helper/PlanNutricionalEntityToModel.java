package co.com.smartworkout.nutririonalplan.jpa.helper;

import co.com.smartworkout.nutririonalplan.jpa.entity.PlanNutricionalEntity;
import co.com.smartworkout.nutririonalplan.model.plannutricional.PlanNutricional;

public class PlanNutricionalEntityToModel {

    public static PlanNutricional convert(PlanNutricionalEntity entity) {
        return PlanNutricional.builder()
                .id(entity.getId())
                .idNutricionista(entity.getIdNutricionista())
                .idCliente(entity.getIdCliente())
                .objetivoNutricional(entity.getObjetivoNutricional())
                .kiloCaloriasDiarias(entity.getKiloCaloriasDiarias())
                .recomendaciones(entity.getRecomendaciones())
                .build();
    }

    public static PlanNutricionalEntity convert(PlanNutricional model) {
        return PlanNutricionalEntity.builder()
                .id(model.getId())
                .idNutricionista(model.getIdNutricionista())
                .idCliente(model.getIdCliente())
                .objetivoNutricional(model.getObjetivoNutricional())
                .kiloCaloriasDiarias(model.getKiloCaloriasDiarias())
                .recomendaciones(model.getRecomendaciones())
                .build();
    }

}
