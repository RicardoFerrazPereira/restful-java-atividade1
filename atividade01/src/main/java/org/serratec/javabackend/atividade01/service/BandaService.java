package org.serratec.javabackend.atividade01.service;

import java.util.ArrayList;
import java.util.List;

import org.serratec.javabackend.atividade01.entity.Banda;
import org.springframework.stereotype.Service;

@Service
public class BandaService {
	
	List<Banda> lista = new ArrayList<>();
	
	// Método para adicionar objeto na lista
	
	public void adicionar(Banda banda) {
		lista.add(banda);
	}
	public List<Banda> listaBanda() {
		return this.lista;
	}
	
	// Método para pegar infomação nalista pelo ID
	
	public Banda bandaId(int posicaoLista) {
		Banda bandas = new Banda();
		bandas = lista.get(posicaoLista);
		return bandas;
		
	}
	
	// Método para atualizar objeto na lista
	
	public void atualizar(Integer posicaoLista, Banda banda) {
		Banda bandaLista = new Banda();
		bandaLista = lista.get(posicaoLista);
		
		bandaLista.setId(banda.getId());
		bandaLista.setNomeBanda(banda.getNomeBanda());
		bandaLista.setGenero(banda.getGenero());
		
	}
	
	// Método para deletar objeto na lista
	
	public void deletar(int posicaoLista) {
		lista.remove(posicaoLista);
	}
	

}
