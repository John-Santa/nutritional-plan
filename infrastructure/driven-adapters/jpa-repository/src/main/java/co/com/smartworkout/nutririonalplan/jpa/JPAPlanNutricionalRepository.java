package co.com.smartworkout.nutririonalplan.jpa;


import co.com.smartworkout.nutririonalplan.jpa.entity.PlanNutricionalEntity;
import co.com.smartworkout.nutririonalplan.model.plannutricional.PlanNutricional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPAPlanNutricionalRepository extends
        CrudRepository<PlanNutricionalEntity, String>,
        QueryByExampleExecutor<PlanNutricionalEntity>,
        JpaRepository<PlanNutricionalEntity, String> {

    PlanNutricional findByIdCliente(String idCliente);
    PlanNutricional findByIdNutricionista(String idNutricionista);
}
