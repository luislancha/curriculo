package br.com.lancha.curriculo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "rebels")
@NamedQueries({
        @NamedQuery(name = CurriculoModel.FIND,
                query = "FROM CurriculoModel c WHERE nome = :nome"
        )
})
public class CurriculoModel {
        public static final String FIND = "FIND";

        @Id
        @Column(name = "nome")
        private String nome;

        @Column(name = "telefone")
        private String telefone;

        @Column(name = "email")
        private String email;

        @Column(name = "idade")
        private int idade;

        @Column(name = "cidade")
        private String cidade;
}
