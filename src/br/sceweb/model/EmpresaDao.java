package br.sceweb.model;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.sceweb.servico.FabricaDeConexoes;

public class EmpresaDao {

	public int adiciona(Empresa empresa) {
		PreparedStatement ps;
		int codigoRetorno = 0;
		try (Connection conn = new FabricaDeConexoes().getConnection()) {
			ps = (PreparedStatement) conn.prepareStatement(
					"insert into empresa (cnpj, nomeDaEmpresa, nomeFantasia, endereco, telefone) values(?,?,?,?,?)");
			ps.setString(1, empresa.getCnpj());
			ps.setString(2, empresa.getNomeDaEmpresa());
			ps.setString(3, empresa.getNomeFantasia());
			ps.setString(4, empresa.getEnedereco());
			ps.setString(5, empresa.getTelefone());
			codigoRetorno = ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return codigoRetorno;
	}

	public int exclui(String cnpj) {
		java.sql.PreparedStatement ps;
		int codigoretorno = 0;
		try (Connection conn = new FabricaDeConexoes().getConnection()) {
			ps = conn.prepareStatement("delete from empresa where cnpj = ?");
			ps.setString(1, cnpj);
			codigoretorno = ps.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return codigoretorno;
	}
}