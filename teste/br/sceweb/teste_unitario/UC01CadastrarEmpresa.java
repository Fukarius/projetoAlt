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
		empresa = new Empresa();
		empresaDao = new EmpresaDao();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void CT01UC01CadastrarEmpresa_com_sucesso() {
		assertEquals(1,empresaDao.adiciona(empresa));
	}

}
