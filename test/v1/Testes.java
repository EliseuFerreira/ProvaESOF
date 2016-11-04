package v1;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class Testes {

	@Test
	public void exemplo() {
		Pessoa p1 = new Pessoa("Fulano", false, false);
		Pessoa p2 = new Pessoa("Ciclana", false, false);
		Pessoa p3 = new Pessoa("Beltrana", false, false);

		Fila f = new Fila();

		f.addPessoa(p1);
		f.addPessoa(p2);
		f.addPessoa(p3);

		Pessoa proximo = f.proximoFila();

		Assert.assertEquals(proximo.getNome(), "Fulano");

		f.removePessoa(proximo);
		proximo = f.proximoFila();

		Assert.assertEquals(proximo.getNome(), "Ciclana");

		f.removePessoa(proximo);
		proximo = f.proximoFila();

		Assert.assertEquals(proximo.getNome(), "Beltrana");

		f.removePessoa(proximo);
	}

	@Test
	public void solucaoExcecao() {
		// Questão 3
		Fila f = new Fila();
		Pessoa p1 = new Pessoa("Andrea", false, false);
		Pessoa p2 = new Pessoa("Carla", true, false);

		// chamar o método sem adicionar nada na fila
		Pessoa proximo = f.proximoFila();
		Assert.assertNull(proximo);

	}

	@Test
	public void TesteGravida() {
		// Questão 4
		Fila f = new Fila();
		Pessoa p1 = new Pessoa("Eliseu", false, false);
		Pessoa p2 = new Pessoa("Fulana", true, false);
		Pessoa p3 = new Pessoa("Ciclana", false, false);

		f.addPessoa(p1);
		f.addPessoa(p2);
		f.addPessoa(p3);

		Pessoa proximo = f.proximoFila();

		Assert.assertEquals(proximo.getNome(), "Fulana");

		f.removePessoa(proximo);
		proximo = f.proximoFila();

		Assert.assertEquals(proximo.getNome(), "Eliseu");

		f.removePessoa(proximo);
		proximo = f.proximoFila();

		Assert.assertEquals(proximo.getNome(), "Ciclana");

	}

	@Test
	public void TesteIdoso() {
		//Questão 6
		// gravida vem primeiro e idoso depois na prioridade.
		Pessoa p1 = new Pessoa("Eliseu", false, false);
		Pessoa p2 = new Pessoa("Fulana", true, false);
		Pessoa p3 = new Pessoa("Beltrano", false, true);

		Fila f = new Fila();

		f.addPessoa(p1);
		f.addPessoa(p2);
		f.addPessoa(p3);

		Pessoa proximo = f.proximoFila();

		Assert.assertEquals(proximo.getNome(), "Beltrano");

		f.removePessoa(proximo);
		proximo = f.proximoFila();

		Assert.assertEquals(proximo.getNome(), "Fulana");

		f.removePessoa(proximo);
		proximo = f.proximoFila();

		Assert.assertEquals(proximo.getNome(), "Eliseu");

		f.removePessoa(proximo);

	}
}
