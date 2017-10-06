package br.sceweb.teste_unitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import br.sceweb.model.Empresa;
import br.sceweb.model.EmpresaDAO;

public class UC01CadastrarEmpresa {
	static EmpresaDAO empresaDAO;
	static Empresa empresa;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDAO();
		empresa = new Empresa();
		empresa.setNomeDaEmpresa("empresa x");
		empresa.setCnpj("89424232000180");
		empresa.setNomeFantasia("empresa x");
		empresa.setEndereco("rua taquari");
		empresa.setTelefone("2222");
	}
	/**
	 * CT01UC01FBCadastrar_com_sucesso
	 * Objetivo- verificar o comportamento para o cadasatro da empresa
	 */
	@ Ignore
	@Test
	public void CT01UC01FBCadastra_com_sucesso() {
		assertEquals(1,empresaDAO.adiciona(empresa));	
	}
	@Ignore
	@Test
	public void CT02UC01FBCadastra_cnpj_invalido() {
		assertEquals("cnpj invalido",empresa.setCnpj("9895"));
	}
	
	@Test
	public void CT03UC01FBCadastra_cnpj_jacadastrado() {
		empresaDAO.adiciona(empresa);
		assertEquals(0,empresaDAO.adiciona(empresa));
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//empresaDAO.exclui("89424232000180");
	}
}



