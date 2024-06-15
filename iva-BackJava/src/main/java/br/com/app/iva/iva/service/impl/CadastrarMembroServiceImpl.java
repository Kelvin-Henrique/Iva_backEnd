package br.com.app.iva.iva.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.app.iva.iva.entity.CadastrarMembro;
import br.com.app.iva.iva.repository.CadastrarMembroRepository;
import br.com.app.iva.iva.service.CadastrarMembroService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CadastrarMembroServiceImpl implements CadastrarMembroService {
	
	@Autowired
	CadastrarMembroRepository cadastrarRepository;

	@Override
	public CadastrarMembro salvar(CadastrarMembro membro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<CadastrarMembro> alterar(CadastrarMembro membro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CadastrarMembro deletar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CadastrarMembro buscarPorEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
