package br.com.app.iva.iva.rest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.app.iva.iva.entity.CadastrarMembro;
import br.com.app.iva.iva.service.CadastrarMembroService;
import br.com.app.iva.iva.utility.MockApplication;

@ExtendWith(MockitoExtension.class)
public class CadastroMembroControllerTest {

	@InjectMocks
	private CadastrarMembroController controller;
	
	@Mock
	private CadastrarMembroService service;
	
	@Test
	public void salvarMembroTest() {
		
		Mockito.when(this.service.salvar(any(CadastrarMembro.class)))
		  .thenReturn(MockApplication.getCadastrarMembro());
		
		Integer membro = this.controller.save(MockApplication.getCadastrarMembro());
		
		assertNotNull(membro);
	}
}
