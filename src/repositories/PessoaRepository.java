package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import entities.Pessoa;
import factories.ConnectionFactory;
import interfaces.IRepository;

public class PessoaRepository implements IRepository<Pessoa> {

	@Override
	public void create(Pessoa obj) throws Exception {

		Connection connection = ConnectionFactory.createConnection();

		PreparedStatement statement = connection.prepareStatement("INSERT INTO PESSOA(NOME, CPF, EMAIL) VALUES (?, ?, ?)");
		statement.setString(1, obj.getNome());
		statement.setString(2, obj.getCpf());
		statement.setString(3, obj.getEmail());
		statement.execute();

		connection.close();

	}

	@Override
	public void update(Pessoa obj) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Pessoa> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
