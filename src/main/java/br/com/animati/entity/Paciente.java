package br.com.animati.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "paciente", schema = "public")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_paciente")
    @Column(name = "idPaciente")
    private long idPaciente;
    @Column(name = "empresa")
    private String empresa;
    @Column(name = "nome")
    private String nome;
    @Column(name = "nomeSocial")
    private String nomeSocial;
    @Column(name = "nomeMae")
    private String nomeMae;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "password")
    private String password;
    @Column(name = "rg")
    private String rg;
    @Column(name = "sexo")
    private String sexo;

}
