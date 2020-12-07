package com.kelsonthony.festa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Convidado implements Serializable {
	
	private static final long serialVersionUID = 1l;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private Integer qunatidadeAcompanhantes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQunatidadeAcompanhantes() {
		return qunatidadeAcompanhantes;
	}

	public void setQunatidadeAcompanhantes(Integer qunatidadeAcompanhantes) {
		this.qunatidadeAcompanhantes = qunatidadeAcompanhantes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
