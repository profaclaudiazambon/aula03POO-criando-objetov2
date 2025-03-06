package teste;

import animais.Cachorro;
import animais.Gato;
import pessoas.Atendente;
import pessoas.Auxiliar;
import pessoas.Medico;

public class Executa {

	public static void main(String[] args) {

		// Objeto Gato
		Gato gato = new Gato();
		gato.setNome("Amora");
		gato.setRaca("Persa");
		gato.setTutor("Carla");

		System.out.println(
				"Nome do pet: " + gato.getNome() + "\nRaça: " + gato.getRaca() + "\nTutor: " + gato.getTutor());
		gato.comer();
		gato.emitirSom();

		System.out.println("");

		// Objeto Médico
		Medico medico = new Medico();
		medico.setCadastro(13456);
		medico.setNome("Fernando");
		medico.setEspecialidade("Clínico Geral");

		System.out.println("Médico: " + medico.getNome() + "\nCadastro: " + medico.getCadastro() + 
				"\nEspecialidade: " + medico.getEspecialidade());
		medico.emitirReceita();
		medico.consultar();

		System.out.println("");

		// Objeto Cachorro
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Thor");
		cachorro.setRaca("Pincher");
		cachorro.setTutor("Jonas");

		System.out.println("Nome do pet: " + cachorro.getNome() + "\nRaça: " + cachorro.getRaca() + 
				"\nTutor: " + cachorro.getTutor());
		cachorro.comer();
		cachorro.emitirSom();
		
		System.out.println("");

		// Objeto Atendente
		Atendente atendente = new Atendente();
		atendente.setCadastro(24456);
		atendente.setNome("Pâmela");

		System.out.println("Atendente: " + atendente.getNome() + "\nCadastro: " + atendente.getCadastro());
		atendente.agendarConsultas();

		System.out.println("");
		
		// Objeto Auxiliar
		Auxiliar auxiliar = new Auxiliar();
		auxiliar.setCadastro(54789);
		auxiliar.setNome("Pedro");

		System.out.println("Auxiliar: " + auxiliar.getNome() + "\nCadastro: " + auxiliar.getCadastro());
		auxiliar.realizarBanho();
		auxiliar.realizarTosa();
	}

}
