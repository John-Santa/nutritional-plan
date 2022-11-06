package co.com.smartworkout.nutririonalplan.jpa.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "valoracion_nutricional")
public class ValoracionNutricionalEntity {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    @Column(name = "id")
    private String id;
    @Column(name = "id_plan_nutricional")
    private String idPlanNutricional;
    @Column(table = "valoracion_nutricional", name = "fecha_creacion")
    private String fechaCreacion;
    @Column(table = "valoracion_nutricional", name = "biceps")
    private Double biceps;
    @Column(table = "valoracion_nutricional", name = "abdomen")
    private Double abdomen;
    @Column(table = "valoracion_nutricional", name = "cresta_iliaca")
    private Double crestaIliaca;
    @Column(table = "valoracion_nutricional", name = "muslo")
    private Double muslo;
    @Column(table = "valoracion_nutricional", name = "supraespinal")
    private Double supraespinal;
    @Column(table = "valoracion_nutricional", name = "subescapular")
    private Double subescapular;
    @Column(table = "valoracion_nutricional", name = "pantorrilla")
    private Double pantorrilla;
    @Column(table = "valoracion_nutricional", name = "triceps")
    private Double triceps;
    @Column(table = "valoracion_nutricional", name = "brazo_relajado")
    private Double brazoRelajado;
    @Column(table = "valoracion_nutricional", name = "brazo_contraido")
    private Double brazoContraido;
    @Column(table = "valoracion_nutricional", name = "cintura")
    private Double cintura;
    @Column(table = "valoracion_nutricional", name = "cadera")
    private Double cadera;
    @Column(table = "valoracion_nutricional", name = "perimetro_muslo")
    private Double perimetroMuslo;
    @Column(table = "valoracion_nutricional", name = "pierna")
    private Double pierna;
    @Column(table = "valoracion_nutricional", name = "peso")
    private Double peso;
    @Column(table = "valoracion_nutricional", name = "estatura")
    private Double estatura;
    @Column(table = "valoracion_nutricional", name = "diagnostico")
    private String diagnostico;
    @Column(table = "valoracion_nutricional", name = "sumatoria_pliegues")
    private Double sumatoriaPliegues;
    @Column(table = "valoracion_nutricional", name = "porcentaje_yuhasz")
    private Double porcentajeYuhasz;
    @Column(table = "valoracion_nutricional", name = "mlg")
    private Double MLG;
    @Column(table = "valoracion_nutricional", name = "mg")
    private Double MG;

}
