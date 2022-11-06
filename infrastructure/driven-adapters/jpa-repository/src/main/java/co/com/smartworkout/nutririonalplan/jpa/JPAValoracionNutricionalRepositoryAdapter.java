package co.com.smartworkout.nutririonalplan.jpa;

import co.com.smartworkout.nutririonalplan.jpa.entity.PlanNutricionalEntity;
import co.com.smartworkout.nutririonalplan.jpa.entity.ValoracionNutricionalEntity;
import co.com.smartworkout.nutririonalplan.jpa.helper.AdapterOperations;
import co.com.smartworkout.nutririonalplan.model.plannutricional.PlanNutricional;
import co.com.smartworkout.nutririonalplan.model.valoracionnutricional.ValoracionNutricional;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class JPAValoracionNutricionalRepositoryAdapter extends AdapterOperations<
        ValoracionNutricional,
        ValoracionNutricionalEntity,
        String ,
        JPAValoracionNutricionalRepository>
// implements ModelRepository from domain
{

    public JPAValoracionNutricionalRepositoryAdapter(JPAValoracionNutricionalRepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, ValoracionNutricional.class/* change for domain model */));
    }

    public ValoracionNutricionalEntity findByIdPlanNutricional(String idPlanNutricional) {
        return repository.findByIdPlanNutricional(idPlanNutricional);
    }

}
