package co.com.smartworkout.nutririonalplan.usecase.valoracionnutricional;

import co.com.smartworkout.nutririonalplan.model.valoracionnutricional.ValoracionNutricional;
import co.com.smartworkout.nutririonalplan.model.valoracionnutricional.gateways.ValoracionNutricionalRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ValoracionNutricionalUseCase {

    private final ValoracionNutricionalRepository valoracionNutricionalRepository;

    public void crear(ValoracionNutricional valoracionNutricional) {
        Double sumatoriaPliegues = calcularSumatoriaDePliegues(valoracionNutricional);
        valoracionNutricional.setSumatoriaPliegues(sumatoriaPliegues);
        valoracionNutricional.setPorcentajeYuhasz(calcularPorcentajeYuhasz(sumatoriaPliegues, true));
        valoracionNutricionalRepository.crear(valoracionNutricional);
    }

    public ValoracionNutricional buscarPorIdPlanNutricional(String idPlanNutricional) {
        return valoracionNutricionalRepository.buscarPorIdPlanNutricional(idPlanNutricional);
    }

    public ValoracionNutricional actualizar(String id, ValoracionNutricional valoracionNutricional) {
        Double sumatoriaPliegues = calcularSumatoriaDePliegues(valoracionNutricional);
        valoracionNutricional.setSumatoriaPliegues(sumatoriaPliegues);
        valoracionNutricional.setPorcentajeYuhasz(calcularPorcentajeYuhasz(sumatoriaPliegues, true));
        valoracionNutricional.setMLG(calcularMLG(valoracionNutricional));
        valoracionNutricional.setMG(valoracionNutricional.getPeso() - valoracionNutricional.getMLG());
        return valoracionNutricionalRepository.actualizar(id, valoracionNutricional);
    }

    public Double calcularSumatoriaDePliegues(ValoracionNutricional valoracionNutricional) {
        Double biceps = valoracionNutricional.getBiceps();
        Double abdomen = valoracionNutricional.getAbdomen();
        Double crestaIliaca = valoracionNutricional.getCrestaIliaca();
        Double muslo = valoracionNutricional.getMuslo();
        Double supraespinal = valoracionNutricional.getSupraespinal();
        Double subescapular = valoracionNutricional.getSubescapular();
        Double pantorrilla = valoracionNutricional.getPantorrilla();
        Double triceps = valoracionNutricional.getTriceps();

        return biceps + abdomen + crestaIliaca + muslo + supraespinal + subescapular + pantorrilla + triceps;
    }

    public Double calcularPorcentajeYuhasz(Double sumatoriaPliegues, boolean esHombre) {
        return (esHombre) ? sumatoriaPliegues * 0.1051 + 2.585 : sumatoriaPliegues * 0.1548 - 3.580;
    }

public Double calcularMLG(ValoracionNutricional valoracionNutricional) {
        double peso = valoracionNutricional.getPeso();
        double yuhasz = valoracionNutricional.getPorcentajeYuhasz();
        return peso * (100 - yuhasz) / 100;
    }
}
