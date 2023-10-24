package br.com.app.iva.iva.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class Hello {

	@GetMapping
	public String hello() {
		return "Hello Api Cadastrar Membro";
	}
}
