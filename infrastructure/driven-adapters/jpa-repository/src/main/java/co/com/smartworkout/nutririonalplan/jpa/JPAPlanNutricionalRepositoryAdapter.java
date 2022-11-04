package co.com.smartworkout.nutririonalplan.jpa;

import co.com.smartworkout.nutririonalplan.jpa.entity.PlanNutricionalEntity;
import co.com.smartworkout.nutririonalplan.jpa.helper.AdapterOperations;
import co.com.smartworkout.nutririonalplan.model.plannutricional.PlanNutricional;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class JPAPlanNutricionalRepositoryAdapter extends AdapterOperations<
        PlanNutricional,
        PlanNutricionalEntity,
        String ,
        JPAPlanNutricionalRepository>
// implements ModelRepository from domain
{

    public JPAPlanNutricionalRepositoryAdapter(JPAPlanNutricionalRepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, PlanNutricional.class/* change for domain model */));
    }

    public PlanNutricional findByIdCliente(String idCliente) {
        return repository.findByIdCliente(idCliente);
    }

    public PlanNutricional findByIdNutricionista(String idNutricionista) {
        return repository.findByIdNutricionista(idNutricionista);
    }
}
