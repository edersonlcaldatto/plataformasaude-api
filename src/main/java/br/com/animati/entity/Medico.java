package br.com.animati.entity;

import lombok.*;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_medico")
    @Column(name = "idMedico")
    private long idMedico;
    @Column(name = "nome")
    private String nome;
    @Column(name = "uf")
    private String Uf;
    @Column(name = "crm")
    private String crm;

}
