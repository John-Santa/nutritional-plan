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

}