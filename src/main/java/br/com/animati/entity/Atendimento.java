package br.com.animati.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "atendimento")
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_atendimento")
    @Column(name = "idAtendimento")
    private long IdAtendimento;

    @CreationTimestamp
    @Column(name = "dataHora")
    private Date dataHora;

    @Column(name = "nomeProcedimento")
    private String nomeProcedimento;

    @Column(name = "modalidade")
    private String modalidade;

    @JoinColumn(name = "medico_id", nullable = false)
    @OneToOne
    private Medico medico;

    @JoinColumn(name = "paciente_id", nullable = false)
    @OneToOne
    private Paciente paciente;

}
