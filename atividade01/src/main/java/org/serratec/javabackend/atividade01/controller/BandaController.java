package org.serratec.javabackend.atividade01.controller;

import java.util.List;

import org.serratec.javabackend.atividade01.entity.Banda;
import org.serratec.javabackend.atividade01.service.BandaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banda")

public class BandaController {
	
	@Autowired
	BandaService bandaService;
	
	// Acessar a lista
	
	@GetMapping("/lista")
	public List<Banda> getBanda(){
		return bandaService.listaBanda();
	}
	
	// Acessar a lista com ID
	@GetMapping("/lista/{posicaoLista}")
	public Banda getbandaId(@PathVariable int posicaoLista) {
		return bandaService.bandaId(posicaoLista);
	}
	

	// Adicionar objeto na lista
	
	@PostMapping("/adicionar")
	public void adicionar(@RequestBody Banda banda) {
		bandaService.adicionar(banda);
	}
	
	// Atualizar objeto na lista pelo ID (posição na lista)
	
	@PutMapping("/atualizar/{posicaoLista}")
	public void atualizar(@PathVariable Integer posicaoLista, @RequestBody Banda banda) {
		bandaService.atualizar(posicaoLista, banda);
	}
	
	// Excluir objeto na lista pelo ID (posição na lista)
	
	@DeleteMapping("/delete/{posicaoLista}")
	public void deletar(@PathVariable int posicaoLista) {
		bandaService.deletar(posicaoLista);
	
	}
	
	
	
}	

