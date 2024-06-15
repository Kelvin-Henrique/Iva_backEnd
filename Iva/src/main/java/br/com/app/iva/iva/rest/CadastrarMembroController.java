package br.com.app.iva.iva.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.app.iva.iva.entity.CadastrarMembro;
import br.com.app.iva.iva.service.CadastrarMembroService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/cadastrarMembro")
public class CadastrarMembroController {

	@Autowired
	CadastrarMembroService cadastrarService;
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.OK)
	@Operation(summary = "Salvar Dados dos Membros")
	public Integer save
	(@RequestBody(required = true) CadastrarMembro cadastrarMembro) {

		CadastrarMembro membroSalvo = cadastrarService.salvar(cadastrarMembro);
		return membroSalvo.getIdMembro();
	}
	
	@PutMapping("/atualizar")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public CadastrarMembro update(@RequestBody(required = true) CadastrarMembro atualizarMembro) {
		
	CadastrarMembro membroAtualizado =  this.cadastrarService.alterar(atualizarMembro);
		
	return membroAtualizado;
		  
	}
}
