
public class Funcionario {

	private String nome;
	private int codigoFuncional;
	private int escolaridade;
	private String escola;
	private String universidade;
	private String curso;
	private double salarioBase = 1000;
	private int cargo;
	private double salarioTotal = 0;
	
	public void setNome(String nome){
		this.nome = nome;	
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setCodigoFuncional(int codigo){
		this.codigoFuncional = codigo;	
	}
	
	public int getCodigoFuncional(){
		return codigoFuncional;
	}
	
	public void setEscolaridade(int escolaridade){
		if(escolaridade >= 1 && escolaridade <= 4){
			this.escolaridade = escolaridade;
		}
	}
	
	public int getEscolaridade(){
		return escolaridade;
	}
	
	public void setEscola(String escola){
		this.escola = escola;
	}
	
	public String getEscola(){
		return escola;
	}
	
	public void setCurso(String curso){
		this.curso = curso;
	}
	
	public String getCurso(){
		return curso;
	}	
	
	public void setUniversidade(String universidade){
		this.universidade = universidade;
	}
	
	public String getUniversidade(){
		return universidade;
	}
	
	public void setCargo(int cargo){	
		if(cargo >= 1 && cargo <= 3){
			this.cargo = cargo;
		}
	}
	
	public void calcularSalarioTotal(int escolaridade, int cargo){
		setEscolaridade(escolaridade);
		if(escolaridade == 2){
			salarioTotal = salarioBase * 0.10 + salarioBase;
		}else if(escolaridade == 3){
			salarioTotal = salarioBase * 0.50 + salarioBase;
		}else if(escolaridade == 4){
			salarioTotal = salarioBase * 1.0 + salarioBase;
		}else{
			salarioTotal = salarioBase;
		}
		
		if(cargo == 1){
			salarioTotal += 250.0;
		}else if(cargo == 2){
			salarioTotal += 600.0;
		}else{
			salarioTotal += 1000.0;
		}
	}
	
	public double getSalarioTotal(){
		return salarioTotal;
	}
	

	

	
	

}
