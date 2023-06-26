package com.generation.blogpessoal.model;

import java.time.LocalDateTime;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

	@Entity //utilizada para gerar uma tabela no Banco de dados da aplicação.
	@Table(name = "tb_postagens") // indica o nome da Tabela no Banco de dados
	public class Postagem {

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getTexto() {
			return texto;
		}

		public void setTexto(String texto) {
			this.texto = texto;
		}

		public LocalDateTime getData() {
			return data;
		}

		public void setData(LocalDateTime data) {
			this.data = data;
		}

		@Id  //  inidica que o Atributo anotado será a Chave Primária
		@GeneratedValue(strategy = GenerationType.IDENTITY) // indica que a Chave Primária será gerada pelo Banco de dados
		private Long id;
		
		@NotBlank(message = "O atributo título é Obrigatório!") // @NotBlank não permite que o Atributo seja Nulo ou contenha apenas espaços em branco. 
		@Size(min = 5, max = 100 , message = "O atibuto título deve conter no mínimo 05 e no máximo 100 caracteres")
		private String titulo;
		
		@NotBlank (message = "O atributo título é Obrigatório!")// Você pode configurar uma mensagem para o usuário através do Atributo message.
		@Size(min = 10, max = 1000 , message = "O atibuto texto deve conter no mínimo 10 e no máximo 100 caracteres")
		private String texto;
		//: A anotação @Size define o valor Mínimo (min) e o valor Máximo (max) de caracteres do Atributo.
		
		@UpdateTimestamp //A anotação @UpdateTimestamp configura o Atributo data como Timestamp,
		private LocalDateTime data;
		
		
	}
	

