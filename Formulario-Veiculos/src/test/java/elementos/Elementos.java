package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By btnMake = By.id("make");

	public By btnOpcaoMake = By.cssSelector("#make > option:nth-child(3)");

	public By btnModel = By.id("model");

	public By btnOpcaoModel = By.cssSelector("#model > option:nth-child(2)");

	public By btnCylinder = By.id("cylindercapacity");

	public By btnEngine = By.id("engineperformance");

	public By btnDataManufacture = By.id("dateofmanufacture");

	public By btnNumeroSeats = By.id("numberofseats");

	public By btnOpcaoRight = By.cssSelector("#numberofseats > option:nth-child(5)");
	
	

	public By btnRight = By.cssSelector(
			"#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(1) > span");

	public By btnNumeroRight1 = By.id("numberofseatsmotorcycle");

	public By btnEscolherRight1 = By.cssSelector("#numberofseatsmotorcycle > option:nth-child(3)");

	public By btnFuel = By.id("fuel");

	public By btnEscolhafuel = By.cssSelector("#fuel > option:nth-child(4)");

	public By btnPayload = By.id("payload");

	public By btnWeight = By.id("totalweight");

	public By btnListPrice = By.id("listprice");

	public By btnNumeroPlate = By.id("licenseplatenumber");

	public By btnMileage = By.id("annualmileage");

	public By btnNext = By.id("nextenterinsurantdata");

	public By btnFirstName = By.id("firstname");

	public By btnLastName = By.id("lastname");

	public By btnBorn = By.id("birthdate");

	public By btnGenderM = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]");

	public By btnAddress = By.id("streetaddress");

	public By btnCountry = By.id("country");

	public By btnyourCountry = By.cssSelector("#country > option:nth-child(7)");

	public By btnZip = By.id("zipcode");

	public By btnCity = By.id("city");

	public By btnOccupation = By.id("occupation");

	public By btnEscolhaOccupation = By.cssSelector("#occupation > option:nth-child(3)");

	public By btnHobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p");

	public By btnEscolhaHobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]");

	public By btnWebSite = By.id("website");

	public By btnNext1 = By.id("nextenterproductdata");

	public By btnInicio = By.id("startdate");

	public By btnValorSeguro = By.id("insurancesum");

	public By btnEscolherValor = By.cssSelector("#insurancesum > option:nth-child(2)");

	public By btnMerito = By.id("meritrating");

	public By btnEscolherMerito = By.cssSelector("#meritrating > option:nth-child(5)");

	public By btnDanos = By.id("damageinsurance");

	public By btnEscolherDanos = By.xpath("//*[@id=\"damageinsurance\"]/option[4]");

	public By btnProduto = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span");

	public By btnCortesia = By.id("courtesycar");

	public By btnEscolherCortesia = By.cssSelector("#courtesycar > option:nth-child(3)");

	public By btnProximapag = By.id("nextselectpriceoption");

	public By btnGold = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(2) > span");

	public By btnProximaPag1 = By.id("nextsendquote");

	public By btnSend = By.id("sendemail");
	
	public By btnMsg = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2");
	
	
}
