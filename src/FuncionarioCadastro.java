import java.util.ArrayList;
import java.util.Scanner;

public class FuncionarioCadastro {

	private static final String CONTINUAR = "s";

	public static void main(String[] args) {
		ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		Scanner entrada = new Scanner(System.in);
		
		String nome = "";
		int codigoFuncional = 0;
		String nomeEscola = "";
		String nomeUniversidade = "";
		String curso = "";
		int escolaridade = 0;
		int cargo = 0;
		String continuar = "s";
		Funcionario funcionario;
		
		while(CONTINUAR.equalsIgnoreCase(continuar)){
			System.out.print("Grau de escolaridade: \n1 - Não estudou\n2 - Ensino Fundamental\n3 - Ensino Médio\n4 - Graduação\nDigite o número da opção: ");
			String escolaridadeString = entrada.nextLine();
			escolaridade = Integer.parseInt(escolaridadeString);
			System.out.print("Cargo: \n1 - Vendedor\n2 - Supervisor\n3 - Gerente\nDigite o número da opção: ");
			String cargoString = entrada.nextLine();
			cargo = Integer.parseInt(cargoString);
			
			if(escolaridade ==  1){
				System.out.print("\nNome do funcionário: ");
				nome = entrada.nextLine();
				System.out.print("Código funcional: ");
				String codigoString = entrada.nextLine();
				codigoFuncional = Integer.parseInt(codigoString);
			}else if(escolaridade ==  2 || escolaridade ==  3){
				System.out.print("Nome do funcionário: ");
				nome = entrada.nextLine();
				System.out.print("Nome da Escola: ");
				nomeEscola = entrada.nextLine();
			}else if(escolaridade ==  4){
				System.out.print("Nome do funcionário: ");
				nome = entrada.nextLine();
				System.out.print("Nome da Universidade: ");
				nomeUniversidade = entrada.nextLine();
				System.out.print("Nome do curso: ");
				curso = entrada.nextLine();
			}
			
			funcionario = new Funcionario();
			funcionario.setNome(nome);
			funcionario.setCodigoFuncional(codigoFuncional);
			funcionario.setEscola(nomeEscola);
			funcionario.setUniversidade(nomeUniversidade);
			funcionario.setCurso(curso);
			funcionario.setEscolaridade(escolaridade);
			funcionario.setCargo(cargo);
			funcionario.calcularSalarioTotal(escolaridade, cargo);
			
			listaFuncionarios.add(funcionario);
			
			System.out.print("\nCadastrar mais um? [S - sim / N - nao] : ");
			continuar = entrada.nextLine();
		}
		
		for(int i = 0; i < listaFuncionarios.size(); i++){	
			Funcionario dadosFuncionario = listaFuncionarios.get(i);
				
			if(dadosFuncionario.getEscolaridade() ==  1){
				System.out.println("\nNome: "+dadosFuncionario.getNome());
				System.out.println("Código funcional: "+dadosFuncionario.getCodigoFuncional());
				System.out.println("Salário: R$"+ dadosFuncionario.getSalarioTotal());
			}else if(dadosFuncionario.getEscolaridade() ==  2 || dadosFuncionario.getEscolaridade() ==  3){
				System.out.println("\nNome: "+dadosFuncionario.getNome());
				System.out.println("Escola: "+dadosFuncionario.getEscola());
				System.out.println("Salário: R$"+ dadosFuncionario.getSalarioTotal());
			}else{
				System.out.println("\nNome: "+dadosFuncionario.getNome());
				System.out.println("Universidade: "+dadosFuncionario.getUniversidade());
				System.out.println("Universidade: "+dadosFuncionario.getCurso());
				System.out.println("Salário: R$"+ dadosFuncionario.getSalarioTotal());
			}
		}
		System.out.println("\nDespesa mensal com funcionários sem estudo: "+calcularDespesasSalarios(listaFuncionarios, 1));
		System.out.println("Despesa mensal com funcionários com Ensino Fundamental: "+calcularDespesasSalarios(listaFuncionarios, 2));
		System.out.println("Despesa mensal com funcionários com Ensino Médio:  "+calcularDespesasSalarios(listaFuncionarios, 3));
		System.out.println("Despesa mensal com funcionários com Graduação: "+calcularDespesasSalarios(listaFuncionarios, 4));
	
	}

	public static double calcularDespesasSalarios(ArrayList<Funcionario> listaFuncionarios,int escolaridade) {
		double despesa = 0;	
		for(int i = 0; i < listaFuncionarios.size(); i++){	
			Funcionario salario = listaFuncionarios.get(i);
			if(salario.getEscolaridade() ==  escolaridade){
				despesa = despesa + salario.getSalarioTotal();
			}
		}
		return despesa;	
	}

}
