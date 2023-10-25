package br.com.app.iva.iva.service;

import java.util.Optional;

import br.com.app.iva.iva.entity.CadastrarMembro;
import org.springframework.web.server.ResponseStatusException;


public interface CadastrarMembroService {

	public CadastrarMembro salvar(CadastrarMembro membro);
	
	public CadastrarMembro alterar(CadastrarMembro membroAtualizado) throws ResponseStatusException;
	
	public CadastrarMembro deletar(Integer id);
	
	public CadastrarMembro buscarPorEmail(String email);
}
