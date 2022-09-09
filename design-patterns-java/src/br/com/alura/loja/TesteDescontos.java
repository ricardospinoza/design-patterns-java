package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;

public class TesteDescontos {

	public static void main(String[] args) {
		Orcamento orcamentoPrimeiro = new Orcamento(new BigDecimal("200"), 4);		
		Orcamento orcamentoSegundo = new Orcamento(new BigDecimal("1000"), 1);
		CalculadoraDeDescontos calculo = new CalculadoraDeDescontos();
		System.out.println(calculo.calcular(orcamentoPrimeiro));
		System.out.println(calculo.calcular(orcamentoSegundo));
		
	}

}
