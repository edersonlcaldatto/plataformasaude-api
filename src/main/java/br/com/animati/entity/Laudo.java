package br.com.animati.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "laudo")
public class Laudo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_laudo")
    @Column(name = "idLaudo")
    private long idLaudo;
    @Column(name = "texto")
    private String texto;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "atendimento_id", nullable = false)

    private Atendimento atendimento;

    @JoinColumn(name = "medico_id", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    private Medico medico;

}
