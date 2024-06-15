package br.com.app.iva.iva.service.impl;

import java.util.Optional;

import br.com.app.iva.iva.enume.EnumTelefone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.app.iva.iva.entity.CadastrarMembro;
import br.com.app.iva.iva.repository.CadastrarMembroRepository;
import br.com.app.iva.iva.service.CadastrarMembroService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.server.ResponseStatusException;

@Service
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CadastrarMembroServiceImpl implements CadastrarMembroService {

	@Autowired
	CadastrarMembroRepository cadastrarRepository;
	
	public CadastrarMembroServiceImpl(CadastrarMembroRepository cadastrarRepository) {
		super();
		this.cadastrarRepository = cadastrarRepository;
	}



	@Override
	public CadastrarMembro salvar(CadastrarMembro membro) {
		
		return this.cadastrarRepository.save(membro);
	}

	@Override
	public CadastrarMembro alterar(CadastrarMembro membro) throws ResponseStatusException {

		Optional<CadastrarMembro> membroAtualizado = this.cadastrarRepository.findById(membro.getIdMembro())
				.map(membroatualizando -> {

					membroatualizando.setTipo(membro.getTipo());
					membroatualizando.setNumero(membro.getNumero());
					membroatualizando.setEmail(membro.getEmail());
					membroatualizando.setSenha(membro.getSenha());

					return this.cadastrarRepository.save(membroatualizando);
				});

		return membroAtualizado.get();
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
