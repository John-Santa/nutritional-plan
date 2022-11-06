package co.com.smartworkout.nutririonalplan.jpa;

import co.com.smartworkout.nutririonalplan.jpa.entity.ValoracionNutricionalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPAValoracionNutricionalRepository extends
        CrudRepository<ValoracionNutricionalEntity, String>,
        QueryByExampleExecutor<ValoracionNutricionalEntity>,
        JpaRepository<ValoracionNutricionalEntity, String> {

    @Query("SELECT valoracion FROM ValoracionNutricionalEntity valoracion WHERE valoracion.idPlanNutricional = ?1")
    ValoracionNutricionalEntity findByIdPlanNutricional(String idPlanNutricional);

}
