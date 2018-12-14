package br.com.db1.calculadoraapi;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import br.com.db1.calculadoraapi.model.Calculadora;
import br.com.db1.calculadoraapi.model.Operacao;
import br.com.db1.calculadoraapi.repository.CalculadoraRepository;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CalculadoraRepositoryTest {
	@Autowired
	private CalculadoraRepository calculadoraRepository;

	@After
	public void after() {
		calculadoraRepository.deleteAll();

	}

	@Test
	public void deveSalvarUmaNovaOperacao() {
		Calculadora calculadora = new Calculadora(15d, 25d,Operacao.SOMA);
		Assert.assertEquals(40d,calculadora.getResultado(),0.0);
		
			
		
		
	}
	
}
