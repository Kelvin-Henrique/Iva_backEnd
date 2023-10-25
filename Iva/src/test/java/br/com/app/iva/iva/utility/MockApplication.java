package br.com.app.iva.iva.utility;

import br.com.app.iva.iva.entity.CadastrarMembro;
import br.com.app.iva.iva.enume.EnumTelefone;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MockApplication {

	public static CadastrarMembro getCadastrarMembro() {
		
		CadastrarMembro membro = new CadastrarMembro();
		
		membro.setIdMembro(1111);
		membro.setNome("Felipe  Andre");
		membro.setStatus("Membro");
		membro.setTipo(EnumTelefone.CEL);
		membro.setNumero("11983239176");
		membro.setEmail("teste_teste@gmail.com");
		
		return membro;
	}
}
