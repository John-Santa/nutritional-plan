package co.com.smartworkout.nutririonalplan.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "plan_nutricional")
//@SecondaryTable(name = "valoracion_nutricional", pkJoinColumns = @PrimaryKeyJoinColumn(name = "id_valoracion_nutricional", referencedColumnName = "id"))
public class PlanNutricionalEntity {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    @Column(name = "id")
    private String id;
    @Column(name = "id_nutricionista")
    private String idNutricionista;
    @Column(name = "id_cliente")
    private String idCliente;
    @Column
    private String objetivoNutricional;
    @Column
    private Double kiloCaloriasDiarias;
    @Column
    private String recomendaciones;

//    @Column(table = "valoracion_nutricional", name = "fecha_creacion")
//    private String fechaCreacion;
//    @Column(table = "valoracion_nutricional", name = "biceps")
//    private Double biceps;
//    @Column(table = "valoracion_nutricional", name = "abdomen")
//    private Double abdomen;
//    @Column(table = "valoracion_nutricional", name = "cresta_iliaca")
//    private Double crestaIliaca;
//    @Column(table = "valoracion_nutricional", name = "muslo")
//    private Double muslo;
//    @Column(table = "valoracion_nutricional", name = "supraespinal")
//    private Double supraespinal;
//    @Column(table = "valoracion_nutricional", name = "subescapular")
//    private Double subescapular;
//    @Column(table = "valoracion_nutricional", name = "pantorrilla")
//    private Double pantorrilla;
//    @Column(table = "valoracion_nutricional", name = "triceps")
//    private Double triceps;
//    @Column(table = "valoracion_nutricional", name = "brazo_relajado")
//    private Double brazoRelajado;
//    @Column(table = "valoracion_nutricional", name = "brazo_contraido")
//    private Double brazoContraido;
//    @Column(table = "valoracion_nutricional", name = "cintura")
//    private Double cintura;
//    @Column(table = "valoracion_nutricional", name = "cadera")
//    private Double cadera;
//    @Column(table = "valoracion_nutricional", name = "perimetro_muslo")
//    private Double perimetroMuslo;
//    @Column(table = "valoracion_nutricional", name = "pierna")
//    private Double pierna;
//    @Column(table = "valoracion_nutricional", name = "diagnostico")
//    private String diagnostico;

}