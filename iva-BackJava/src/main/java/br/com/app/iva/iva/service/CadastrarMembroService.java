package br.com.app.iva.iva.service;

import java.util.Optional;

import br.com.app.iva.iva.entity.CadastrarMembro;


public interface CadastrarMembroService {

	public CadastrarMembro salvar(CadastrarMembro membro);
	
	public Optional<CadastrarMembro> alterar(CadastrarMembro membro);
	
	public CadastrarMembro deletar(Integer id);
	
	public CadastrarMembro buscarPorEmail(String email);
}
