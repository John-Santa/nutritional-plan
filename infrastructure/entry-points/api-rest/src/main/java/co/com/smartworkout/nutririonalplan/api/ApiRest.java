package co.com.smartworkout.nutririonalplan.api;
import co.com.smartworkout.nutririonalplan.model.plannutricional.PlanNutricional;
import co.com.smartworkout.nutririonalplan.usecase.plannutricional.PlanNutricionalUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping(value = "/api/plan-nutricional", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final PlanNutricionalUseCase planNutricionalUseCase;

    @GetMapping("/{id}")
    public ResponseEntity<PlanNutricional> getPlanNutricional(@PathVariable String id) {
        return ResponseEntity
                .ok(planNutricionalUseCase.consultarPorIdCliente(id));
    }

    @PostMapping
    public ResponseEntity<String> crearPlanNutricional(@RequestBody PlanNutricional planNutricional) {
        planNutricionalUseCase.crear(planNutricional);
        return ResponseEntity
                .created(URI.create("/api/plan-nutricional/" + planNutricional.getIdCliente()))
                .build();

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
