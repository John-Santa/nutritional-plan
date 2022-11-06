package co.com.smartworkout.nutririonalplan.jpa;


import co.com.smartworkout.nutririonalplan.jpa.helper.PlanNutricionalEntityToModel;
import co.com.smartworkout.nutririonalplan.jpa.helper.ValoracionEntityToModel;
import co.com.smartworkout.nutririonalplan.model.plannutricional.PlanNutricional;
import co.com.smartworkout.nutririonalplan.model.plannutricional.gateways.PlanNutricionalRepository;
import co.com.smartworkout.nutririonalplan.model.valoracionnutricional.ValoracionNutricional;
import co.com.smartworkout.nutririonalplan.model.valoracionnutricional.gateways.ValoracionNutricionalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class JPAValoracionNutricionalImpl implements ValoracionNutricionalRepository {

    private JPAValoracionNutricionalRepositoryAdapter jpaValoracionNutricionalRepositoryAdapter;


    @Override
    public void crear(ValoracionNutricional valoracionNutricional) {
        jpaValoracionNutricionalRepositoryAdapter.save(valoracionNutricional);
    }

    @Override
    public ValoracionNutricional buscarPorIdPlanNutricional(String idPlanNutricional) {
        return ValoracionEntityToModel.convert(
                jpaValoracionNutricionalRepositoryAdapter.findByIdPlanNutricional(idPlanNutricional)
        );
    }

    @Override
    public ValoracionNutricional actualizar(String id, ValoracionNutricional valoracionNutricional) {
        ValoracionNutricional valoracionConsultada = jpaValoracionNutricionalRepositoryAdapter.findById(id);

        if (valoracionConsultada == null) {
            throw new RuntimeException("No existe la valoracion nutricional");
        } else {
            valoracionConsultada.setBiceps(valoracionNutricional.getBiceps());
            valoracionConsultada.setAbdomen(valoracionNutricional.getAbdomen());
            valoracionConsultada.setCrestaIliaca(valoracionNutricional.getCrestaIliaca());
            valoracionConsultada.setMuslo(valoracionNutricional.getMuslo());
            valoracionConsultada.setSupraespinal(valoracionNutricional.getSupraespinal());
            valoracionConsultada.setSubescapular(valoracionNutricional.getSubescapular());
            valoracionConsultada.setPantorrilla(valoracionNutricional.getPantorrilla());
            valoracionConsultada.setTriceps(valoracionNutricional.getTriceps());
            valoracionConsultada.setBrazoRelajado(valoracionNutricional.getBrazoRelajado());
            valoracionConsultada.setBrazoContraido(valoracionNutricional.getBrazoContraido());
            valoracionConsultada.setCintura(valoracionNutricional.getCintura());
            valoracionConsultada.setCadera(valoracionNutricional.getCadera());
            valoracionConsultada.setPerimetroMuslo(valoracionNutricional.getPerimetroMuslo());
            valoracionConsultada.setPierna(valoracionNutricional.getPierna());
            valoracionConsultada.setPeso(valoracionNutricional.getPeso());
            valoracionConsultada.setEstatura(valoracionNutricional.getEstatura());
            valoracionConsultada.setDiagnostico(valoracionNutricional.getDiagnostico());
            valoracionConsultada.setSumatoriaPliegues(valoracionNutricional.getSumatoriaPliegues());
            valoracionConsultada.setPorcentajeYuhasz(valoracionNutricional.getPorcentajeYuhasz());
            valoracionConsultada.setMLG(valoracionNutricional.getMLG());
            valoracionConsultada.setMG(valoracionNutricional.getMG());
            return jpaValoracionNutricionalRepositoryAdapter.save(valoracionConsultada);
        }
    }

}
