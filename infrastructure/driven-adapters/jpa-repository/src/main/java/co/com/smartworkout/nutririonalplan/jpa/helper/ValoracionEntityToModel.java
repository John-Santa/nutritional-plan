package co.com.smartworkout.nutririonalplan.jpa.helper;

import co.com.smartworkout.nutririonalplan.jpa.entity.ValoracionNutricionalEntity;
import co.com.smartworkout.nutririonalplan.model.valoracionnutricional.ValoracionNutricional;

public class ValoracionEntityToModel {

    public static ValoracionNutricional convert(ValoracionNutricionalEntity entity) {
        return ValoracionNutricional.builder()
                .id(entity.getId())
                .idPlanNutricional(entity.getIdPlanNutricional())
                .fechaCreacion(entity.getFechaCreacion())
                .biceps(entity.getBiceps())
                .abdomen(entity.getAbdomen())
                .crestaIliaca(entity.getCrestaIliaca())
                .muslo(entity.getMuslo())
                .supraespinal(entity.getSupraespinal())
                .subescapular(entity.getSubescapular())
                .pantorrilla(entity.getPantorrilla())
                .triceps(entity.getTriceps())
                .brazoRelajado(entity.getBrazoRelajado())
                .brazoContraido(entity.getBrazoContraido())
                .cintura(entity.getCintura())
                .cadera(entity.getCadera())
                .perimetroMuslo(entity.getPerimetroMuslo())
                .pierna(entity.getPierna())
                .diagnostico(entity.getDiagnostico())
                .build();
    }

    public static ValoracionNutricionalEntity convert(ValoracionNutricional model) {
        return ValoracionNutricionalEntity.builder()
                .id(model.getId())
                .idPlanNutricional(model.getIdPlanNutricional())
                .fechaCreacion(model.getFechaCreacion())
                .biceps(model.getBiceps())
                .abdomen(model.getAbdomen())
                .crestaIliaca(model.getCrestaIliaca())
                .muslo(model.getMuslo())
                .supraespinal(model.getSupraespinal())
                .subescapular(model.getSubescapular())
                .pantorrilla(model.getPantorrilla())
                .triceps(model.getTriceps())
                .brazoRelajado(model.getBrazoRelajado())
                .brazoContraido(model.getBrazoContraido())
                .cintura(model.getCintura())
                .cadera(model.getCadera())
                .perimetroMuslo(model.getPerimetroMuslo())
                .pierna(model.getPierna())
                .diagnostico(model.getDiagnostico())
                .build();
    }

}
