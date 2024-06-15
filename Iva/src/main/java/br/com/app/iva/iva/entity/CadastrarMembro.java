package br.com.app.iva.iva.entity;

import br.com.app.iva.iva.enume.EnumTelefone;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Table
@Entity
public class CadastrarMembro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMembro;
	
	@Column
	private String nome;
	
	@Column
	private String status;
	
	@Column
	private EnumTelefone tipo;
	
	@Column
	private String numero;
	
	@Column
	private String email;
	
	@Column
	private String senha;

	public Integer getIdMembro() {
		return idMembro;
	}

	public void setIdMembro(Integer idMembro) {
		this.idMembro = idMembro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public EnumTelefone getTipo() {
		return tipo;
	}

	public void setTipo(EnumTelefone tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
