package br.com.db1.calculadoraapi.model;

public enum Operacao {
	SOMA {
		@Override
		public Double realizaCalculo(Double num1, Double num2) {
			return num1 + num2;
		}
	},
	SUBTRACAO {
		@Override
		public Double realizaCalculo(Double num1, Double num2) {
			return num1 - num2;
		}
	},
	DIVISAO {
		@Override
		public Double realizaCalculo(Double num1, Double num2) {
			return num1 / num2;
		}
	},
	MULTIPLICACAO {
		@Override
		public Double realizaCalculo(Double num1, Double num2) {
			return num1 * num2;
		}
	};

	public abstract Double realizaCalculo(Double num1, Double nums);

}
