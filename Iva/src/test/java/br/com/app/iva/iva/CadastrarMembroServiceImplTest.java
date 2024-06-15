package br.com.app.iva.iva;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.app.iva.iva.entity.CadastrarMembro;
import br.com.app.iva.iva.repository.CadastrarMembroRepository;
import br.com.app.iva.iva.service.CadastrarMembroService;
import br.com.app.iva.iva.service.impl.CadastrarMembroServiceImpl;
import br.com.app.iva.iva.utility.MockApplication;

@ExtendWith(MockitoExtension.class)
public class CadastrarMembroServiceImplTest {

	private CadastrarMembroService service;
	
	@Mock
	private CadastrarMembroRepository repository;
	
	@BeforeEach
	public void init(){
		service = new CadastrarMembroServiceImpl(repository);
	}
	
	@Test
	public void salvarMembro_comSucesso() {
		
		Mockito.when(repository.save(any(CadastrarMembro.class)))
		   .thenReturn(MockApplication.getCadastrarMembro());
		
		assertNotNull(service.salvar(MockApplication.getCadastrarMembro()));
		
	}
	
}
