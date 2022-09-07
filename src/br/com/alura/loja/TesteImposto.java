package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;

public class TesteImposto {

	public static void main(String[] args) {
		CalculadoraDeImpostos calculo = new CalculadoraDeImpostos();
		System.out.println(calculo.calcular(new Orcamento(new BigDecimal("100")),new ICMS()));		
		System.out.println(calculo.calcular(new Orcamento(new BigDecimal("100")),new ISS()));
	}

}
