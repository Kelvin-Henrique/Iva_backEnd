package br.com.app.iva.iva.entity;

import br.com.app.iva.iva.enume.Enumeration;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Table
@Entity
@Getter
@Setter
public class CadastrarMembro {

	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMembro;
	
	@Column
	private String status;
	
	@Column
	private Enumeration tipo;
	
	@Column
	private String numero;
	
	@Column
	private String email;
	
	@Column
	private String senha;

}
