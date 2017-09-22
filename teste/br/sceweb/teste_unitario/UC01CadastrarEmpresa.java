package br.sceweb.teste_unitario;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.model.Empresa;
import br.sceweb.model.EmpresaDao;

public class UC01CadastrarEmpresa {

	public static Empresa empresa;
	public static EmpresaDao empresaDao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDao = new EmpresaDao();
		empresa = new Empresa();
		empresa.setNomeDaEmpresa("empresa x");
		empresa.setCnpj("89424232000180");
		empresa.setNomeFantasia("empresa x");
		empresa.setEnedereco("rua taquari");
		empresa.setTelefone("2222");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void CT01UC01CadastrarEmpresa_com_sucesso() {
		assertEquals(1, empresaDao.adiciona(empresa));
	}

	@Test(expected = IllegalArgumentException.class)
	public void CT02UC01CadastrarEmpresa_sem_sucesso() {
		empresa.setNomeDaEmpresa("");
	}

}
