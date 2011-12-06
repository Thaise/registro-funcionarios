import static org.junit.Assert.*;

import org.junit.Test;


public class RegistroFuncionarioTest {

	@Test
	public void verificaSalarioEscolaridade1Cargo1() {
		Funcionario func = new Funcionario();
		func.calcularSalarioTotal(1, 1);
		assertEquals(1250,func.getSalarioTotal(),0);
	}
	
	@Test
	public void verificaSalarioEscolaridade4Cargo2() {
		Funcionario func = new Funcionario();
		func.calcularSalarioTotal(4, 2);
		assertEquals(2600,func.getSalarioTotal(),0);
	}
	
	@Test
	public void verificaSalarioEscolaridade2Cargo2() {
		Funcionario func = new Funcionario();
		func.calcularSalarioTotal(2, 2);
		assertEquals(1700,func.getSalarioTotal(),0);
	}
	
	@Test
	public void verificaSalarioEscolaridade3Cargo3() {
		Funcionario func = new Funcionario();
		func.calcularSalarioTotal(3, 3);
		assertEquals(2500,func.getSalarioTotal(),0);
	}
	
	@Test
	public void verificaSalarioEscolaridade3Cargo2() {
		Funcionario func = new Funcionario();
		func.calcularSalarioTotal(3, 2);
		assertEquals(2100,func.getSalarioTotal(),0);
	}
	
	@Test
	public void verificaSalarioEscolaridade2Cargo1() {
		Funcionario func = new Funcionario();
		func.calcularSalarioTotal(2, 1);
		assertEquals(1350,func.getSalarioTotal(),0);
	}

}
