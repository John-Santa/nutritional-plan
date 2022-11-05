package co.com.smartworkout.nutririonalplan.jpa;


import co.com.smartworkout.nutririonalplan.jpa.entity.PlanNutricionalEntity;
import co.com.smartworkout.nutririonalplan.model.plannutricional.PlanNutricional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPAPlanNutricionalRepository extends
        CrudRepository<PlanNutricionalEntity, String>,
        QueryByExampleExecutor<PlanNutricionalEntity>,
        JpaRepository<PlanNutricionalEntity, String> {

    @Query("SELECT plan FROM PlanNutricionalEntity plan WHERE plan.idCliente = ?1")
    PlanNutricionalEntity findByIdCliente(String idCliente);

    @Query("SELECT plan FROM PlanNutricionalEntity plan WHERE plan.idNutricionista = ?1")
    PlanNutricionalEntity findByIdNutricionista(String idNutricionista);
}
