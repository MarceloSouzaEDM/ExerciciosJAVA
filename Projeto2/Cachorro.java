package Projeto2;

import java.util.Scanner;

public class Cachorro extends SuperPet implements Animal {
	Scanner ler = new Scanner (System.in);
	
	String nomeAnimal;
	private String raca;
	private String idade;
	private double peso;
	private String cor;
	private String sexo;
	private double valor;
	
	public Cachorro() {
		super();
	}
	public void cadastro() {
		System.out.println("MARAVILHA!!! um doguinho xD ");
		System.out.println("Vamos para o seu cadastro!");
		System.out.println("-------------------------------");
		System.out.print("Qual o seu nome?");
		
		setNomeDono(ler.nextLine());
		System.out.print("Qual o seu endere�o?");
		setEndereco(ler.nextLine());
		
		System.out.print("Qual o seu cpf?");
		setCpf(ler.nextLine());
		
		System.out.print("Qual o seu telefone?");
		setTelefone(ler.nextLine());
		
		
		System.out.println("Agora vamos cadastrar seu amiguinho.... xD");
		System.out.print("Qual o nome do dog?");
		setNomeAnimal(ler.nextLine());
	
		System.out.print("Qual a idade do "+getNomeAnimal()+"?");
		setIdade(ler.nextLine());
		//ler.nextLine();
		System.out.print("Qual a ra�a do " +getNomeAnimal()+"?");
		setRaca(ler.nextLine());
		
		System.out.print("Qual a cor do "+getNomeAnimal()+"?");
		setCor(ler.nextLine());
		
		System.out.print("Qual o sexo do "+getNomeAnimal()+"?");
		setSexo(ler.nextLine());
		
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String getNomeAnimal() {
		return nomeAnimal;
	}
	@Override
	public void setNomeAnimal(String Nome) {
		this.nomeAnimal = Nome;
		
	}
	@Override
	public String getIdade() {
		return idade;
	}
	@Override
	public void setIdade(String idade) {
		this.idade = idade;
	}
	@Override
	public double getPeso() {
		return peso;
	}
	@Override
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String getCor() {
		return cor;
	}
	@Override
	public void setCor(String cor) {
		this.cor = cor;
		
	}
	@Override
	public String getSexo() {
		return sexo;
	}
	@Override
	public void setSexo(String sexo) {
		this.sexo = sexo;
		
	}
	@Override
	public String getRaca() {
		return raca;
	}
	@Override
	public void setRaca(String raca) {
		this.raca = raca;
	}


	@Override
	public void banhoETosa() {
		this.valor += 40;
		if(getPeso()<10) {
			System.out.println("O porte do cachorro � pequeno");
		}
		else if(getPeso()>=10 && getPeso()<=15) {
			System.out.println("O porte do cachorro � m�dio");
			this.valor+=50;
		}
		else
		{
			System.out.println("O porte do cachorro � grande ");
			this.valor+=75;
		}
	}
	
	@Override
	public void creche() {
		int	hora = 0;
		int acrescimo = 15;
		
			System.out.print("Digite por favor , quantas horas voc� deseja que AmiC�o fique com o"+" " +getNomeAnimal());
			hora = ler.nextInt();
			
			if(hora==1) {
				this.valor +=40;
			System.out.println("AmiC�o ficar� com o " +getNomeAnimal()+" " +hora+ " hora na sua resid�ncia");
			
			} else {
				System.out.println("AmiC�o ficar� com o " +getNomeAnimal()+" " +hora+ " horas na sua resid�ncia : ");
				this.valor +=40+ (acrescimo*(hora-1));
		}
		
	}


	@Override
	public void passeio() {
		
		int acrescimo = 20;
		int hora = 0;
		
		System.out.print("Digite por favor , quantas horas voc� deseja que AmiC�o passeie com o(a) " +getNomeAnimal()+"?");
		hora = ler.nextInt();
		
		if(hora==1) {
			this.valor +=30;
			System.out.println("AmiC�o passear� com o(a) " +getNomeAnimal()+" " +hora+ " hora ");
			
			} else {
				
				System.out.println("AmiC�o passear� com o(a) " +getNomeAnimal()+" " +hora+ " horas");
				this.valor +=50+ (acrescimo*(hora-1));
		}
		
		
	}
	@Override
	public void valortotal() {
		System.out.printf("O valor total dos seus servi�os ser� de R$%.2f\n ",getValor());
		
	}	


	

	
	
		
	
	

}
