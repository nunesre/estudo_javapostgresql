package controllers;

import java.util.Scanner;

import entities.Pessoa;
import repositories.PessoaRepository;

public class PessoaController {

	public void cadastrarPessoa() {

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("*** CADASTRO DE PESSOA ***");

			Pessoa pessoa = new Pessoa();

			System.out.print("Informe o nome da pessoa.....: ");
			pessoa.setNome(scanner.nextLine());

			System.out.print("Informe o cpf da pessoa.....: ");
			pessoa.setCpf(scanner.nextLine());

			System.out.print("Informe o email da pessoa.....: ");
			pessoa.setEmail(scanner.nextLine());
			
			PessoaRepository pessoaRepository = new PessoaRepository();
			pessoaRepository.create(pessoa);
			
			System.out.println("Pessoa cadastrada com sucesso! ");
		}

		catch (Exception e) {
			System.out.println("Erro" + e.getMessage());

		}
	}

}
