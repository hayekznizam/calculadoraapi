package br.com.db1.calculadoraapi.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Calculadora")
public class Calculadora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "numeroUm")
	private Double numeroUm;

	@Column(name = "numeroDois")
	private Double numeroDois;

	@Column(name = "resultado")
	private Double resultado;

	@Enumerated(EnumType.STRING)
	@Column(name = "operacao", nullable = false)
	private Operacao operacao;

	@Column(name = "data")
	private LocalDateTime data;

	public Calculadora(Double numeroUm, Double numeroDois, Operacao operacao) {
		this.numeroUm = numeroUm;
		this.numeroDois = numeroDois;
		this.operacao = operacao;
		this.data = LocalDateTime.now();
		this.realizaCalculo();
	}

	protected Calculadora() {

	}

	private void realizaCalculo() {
		this.resultado = this.operacao.realizaCalculo(this.numeroUm, this.numeroDois);
	}

	public Long getId() {
		return id;
	}

	public Operacao getOperacao() {
		return operacao;
	}

	public LocalDateTime getdata() {
		return data;
	}

	public Double getResultado() {
		return resultado;
	}

}
