package com.algaworks.crm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // proprio banco de dados faz o incremento
	private Long id;
	
	@Column(nullable = false) //deixa ele not null
	private String nome;

}
