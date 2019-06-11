package com.sample;

import java.util.*;

public class Loja{
	Armazem armazem;
	HashMap<String,Carrinho> lista;
	

	public Loja(Armazem armazem) {
		this.lista = new HashMap<>();
		this.armazem = armazem;
		Carrinho carrinho = new Carrinho();
		carrinho.addCompra(new Items("001", "Chapeu",10, "Tommy", "homem", null));
		this.lista.put("001", carrinho);
	}

	public Armazem getArmazem() {
		return armazem;
	}

	public void setArmazem(Armazem armazem) {
		this.armazem = armazem;
	}

	public HashMap<String, Carrinho> getLista() {
		return lista;
	}

	public void setLista(HashMap<String, Carrinho> lista) {
		this.lista = lista;
	}
	
	
	
	
}