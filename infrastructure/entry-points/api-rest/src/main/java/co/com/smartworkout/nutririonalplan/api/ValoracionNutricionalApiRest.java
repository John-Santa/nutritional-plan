package co.com.smartworkout.nutririonalplan.api;
import co.com.smartworkout.nutririonalplan.model.plannutricional.PlanNutricional;
import co.com.smartworkout.nutririonalplan.model.valoracionnutricional.ValoracionNutricional;
import co.com.smartworkout.nutririonalplan.usecase.plannutricional.PlanNutricionalUseCase;
import co.com.smartworkout.nutririonalplan.usecase.valoracionnutricional.ValoracionNutricionalUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping(value = "/api/valoracion-nutricional", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ValoracionNutricionalApiRest {
    private final ValoracionNutricionalUseCase valoracionNutricionalUseCase;

    @GetMapping("/{id}")
    public ResponseEntity<ValoracionNutricional> getValoracionNutricional(@PathVariable String id) {
        return ResponseEntity
                .ok(valoracionNutricionalUseCase.buscarPorIdPlanNutricional(id));
    }

    @PostMapping
    public ResponseEntity<String> crearNutricional(@RequestBody ValoracionNutricional valoracionNutricional) {
        valoracionNutricionalUseCase.crear(valoracionNutricional);
        return ResponseEntity
                .created(URI.create("/api/valoracion-nutricional/" + valoracionNutricional.getIdPlanNutricional()))
                .build();

    }

    @PutMapping("/{id}")
    public void actualizarValoracionNutricional(@PathVariable String id, @RequestBody ValoracionNutricional valoracionNutricional) {
        valoracionNutricionalUseCase.actualizar(id, valoracionNutricional);
    }


    @GetMapping(path = "/path")
    public String commandName() {
//      return useCase.doAction();
        return "Hello World";
    }
}
