package steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import elementos.Elementos;
import metodos.Metodos;

public class Testes {
	
	Elementos el = new Elementos();
	Metodos td = new Metodos();
	
			
	@Dado("^que acesse o site \"([^\"]*)\"$")
	public void que_acesse_o_site(String arg1) throws Throwable {
		td.abrirBrowser(arg1);
		
	   
	}

	@Quando("^preencho todos os formularios$")
	public void preencho_todos_os_formularios() throws Throwable {
		td.esperarElemento(el.btnMake);
		td.click(el.btnMake);
		td.click(el.btnOpcaoMake);
		td.click(el.btnOpcaoModel);
		td.click(el.btnModel);
		td.preencherDados(el.btnCylinder, "1800");
		td.preencherDados(el.btnEngine, "200");
		td.preencherDados(el.btnDataManufacture, "04/16/2021;");
		td.click(el.btnNumeroSeats);
		td.click(el.btnOpcaoRight);
		td.click(el.btnRight);
		td.click(el.btnNumeroRight1);
		td.click(el.btnEscolherRight1);
		td.click(el.btnFuel);
		td.click(el.btnEscolhafuel);
		td.preencherDados(el.btnPayload, "400");
		td.preencherDados(el.btnWeight, "850");
		td.preencherDados(el.btnListPrice, "62000");
		td.preencherDados(el.btnNumeroPlate, "GX5789");
		td.preencherDados(el.btnMileage, "30000");
		td.click(el.btnNext);
		td.preencherDados(el.btnFirstName, "Anthony");
		td.preencherDados(el.btnLastName, "Brito");
		td.preencherDados(el.btnBorn, "11/26/1986");
		td.click(el.btnGenderM);
		td.preencherDados(el.btnAddress, "Rua Maria");
		td.click(el.btnCountry);
		td.click(el.btnyourCountry);
		td.preencherDados(el.btnZip, "05160420");
		td.preencherDados(el.btnCity, "São Paulo ");
		td.click(el.btnOccupation);
		td.click(el.btnEscolhaOccupation);
		td.click(el.btnHobbies);
		td.click(el.btnEscolhaHobbies);
		td.preencherDados(el.btnWebSite, "www.accenture.com");
		td.click(el.btnNext1);
		td.preencherDados(el.btnInicio, "08/12/2021");
		td.click(el.btnValorSeguro);
		td.click(el.btnEscolherValor);
		td.click(el.btnMerito);
		td.click(el.btnEscolherMerito);
		td.click(el.btnDanos);
		td.click(el.btnEscolherDanos);
		td.click(el.btnProduto);
		td.click(el.btnCortesia);
		td.click(el.btnEscolherCortesia);
		td.click(el.btnProximapag);
		td.aguardar(2000);
		td.click(el.btnGold);
		td.aguardar(2000);
		td.ScrollDescer();
		td.click(el.btnProximaPag1);
		td.preencherDadosUsuario("carolinebulhoes@gmail.com", "5511952341922", "Bulhoesca" ,"CaAn123241", "CaAn123241");
		td.click(el.btnSend);
			
			}		

	@Entao("^valido msg de envio  com sucesso$")
	public void valido_msg_de_envio_com_sucesso() throws Throwable {
	   td.esperarElemento(el.btnMsg);
	   td.validaTexto(el.btnMsg, "Sending e-mail success!");
	   td.fecharBrowser();
	   
		
	}



}
