package br.com.projeto.persistence.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by jaels on 20/10/2016.
 */
@Entity
@Table(name = "projeto")
public class Projeto extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	private String nome;





    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
