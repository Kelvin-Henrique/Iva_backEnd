package br.com.app.iva.iva.rest;

import java.util.Optional;

import org.springframework.aop.framework.adapter.ThrowsAdviceInterceptor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.app.iva.iva.entity.CadastrarMembro;
import br.com.app.iva.iva.service.CadastrarMembroService;

@RestController
@RequestMapping("/api/cadastrarMembro")
public class CadastrarMembroController {

	CadastrarMembroService cadastrarService;
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public CadastrarMembro save(@RequestParam(required = true) CadastrarMembro membro) {
		
		return cadastrarService.salvar(membro);
	}
	
	@GetMapping
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public Optional<CadastrarMembro> update(@RequestParam(required = true) CadastrarMembro membroAtualizado) {
		
		return this.cadastrarService.alterar(membroAtualizado);
		
		//TODO realizar a lógica do modelo CRUD
		  
	}
}
