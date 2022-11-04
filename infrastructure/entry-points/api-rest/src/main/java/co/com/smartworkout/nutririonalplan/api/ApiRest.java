package co.com.smartworkout.nutririonalplan.api;
import co.com.smartworkout.nutririonalplan.model.plannutricional.PlanNutricional;
import co.com.smartworkout.nutririonalplan.usecase.plannutricional.PlanNutricionalUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/plan-nutricional", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final PlanNutricionalUseCase planNutricionalUseCase;

    @GetMapping("/{id}")
    public void getPlanNutricional(@PathVariable String id) {
        planNutricionalUseCase.consultarPorIdCliente(id);
    }

    @PostMapping
    public void crearPlanNutricional(@RequestBody PlanNutricional planNutricional) {
        planNutricionalUseCase.crear(planNutricional);
    }

    @PutMapping("/{id}")
    public void actualizarPlanNutricional(@PathVariable String id, @RequestBody PlanNutricional planNutricional) {
        planNutricionalUseCase.actualizar(id, planNutricional);
    }


    @GetMapping(path = "/path")
    public String commandName() {
//      return useCase.doAction();
        return "Hello World";
    }
}
