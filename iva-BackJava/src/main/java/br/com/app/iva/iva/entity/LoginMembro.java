package br.com.app.iva.iva.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class LoginMembro {

	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idLogin;
	
	private String email;
	
	private String Senha;
	
	@JoinColumn(name = "idMembro")
	@OneToOne
	private CadastrarMembro id_membro;
}
