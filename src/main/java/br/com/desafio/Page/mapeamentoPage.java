package br.com.desafio.Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.desafio.Util;

public class mapeamentoPage extends Util {

	public void campoMake(String carro) {

		WebDriverWait make = new WebDriverWait(driver, 100);
		make.until(ExpectedConditions.presenceOfElementLocated(ById.id("make"))).sendKeys(Keys.ENTER + carro);
		make.until(ExpectedConditions.presenceOfElementLocated(ById.id("make"))).click();
	}

	public void campoModel(String modelo) {

		WebDriverWait model = new WebDriverWait(driver, 100);
		model.until(ExpectedConditions.presenceOfElementLocated(ById.id("model"))).sendKeys(Keys.ENTER + modelo);
		model.until(ExpectedConditions.presenceOfElementLocated(ById.id("model"))).click();
	}

	public void campocapacidade(String capacidade) {

		WebDriverWait capacid = new WebDriverWait(driver, 100);
		capacid.until(ExpectedConditions.presenceOfElementLocated(ById.id("cylindercapacity")))
				.sendKeys(Keys.ENTER + capacidade);

	}

	public void campoperfomance(String perfomance) {

		WebDriverWait capacid = new WebDriverWait(driver, 100);
		capacid.until(ExpectedConditions.presenceOfElementLocated(ById.id("engineperformance")))
				.sendKeys(Keys.ENTER + perfomance);

	}

	public void data(String data) {

		WebDriverWait date = new WebDriverWait(driver, 100);
		date.until(ExpectedConditions.presenceOfElementLocated(ById.id("dateofmanufacture")))
				.sendKeys(Keys.ENTER + data);

	}

	public void numberSeats(String numero) throws AWTException {

		WebDriverWait seat = new WebDriverWait(driver, 100);
		seat.until(ExpectedConditions.presenceOfElementLocated(ById.id("numberofseats"))).sendKeys(Keys.ENTER + numero);
		seat.until(ExpectedConditions.presenceOfElementLocated(ById.id("numberofseats"))).click();

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);

	}

	public void righthanddriveyes() throws InterruptedException, AWTException {

		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);

		WebDriverWait drive = new WebDriverWait(driver, 100);
		drive.until(ExpectedConditions.presenceOfElementLocated(ById.id("righthanddriveyes"))).click();
	}

	public void numberofseatsmotorcycle(String assentos) throws InterruptedException, AWTException {

		WebDriverWait motocycle = new WebDriverWait(driver, 100);
		motocycle.until(ExpectedConditions.presenceOfElementLocated(ById.id("numberofseatsmotorcycle")))
				.sendKeys(assentos + Keys.TAB);

	}

	public void fuelType(String fuel) throws InterruptedException, AWTException {

		WebDriverWait gas = new WebDriverWait(driver, 100);
		gas.until(ExpectedConditions.presenceOfElementLocated(ById.id("fuel"))).sendKeys(fuel + Keys.TAB);

	}

	public void payload(String peso) throws InterruptedException, AWTException {

		WebDriverWait kg = new WebDriverWait(driver, 100);
		kg.until(ExpectedConditions.presenceOfElementLocated(ById.id("payload"))).sendKeys(peso + Keys.TAB);

	}

	public void totalWeigt(String total) throws InterruptedException, AWTException {

		WebDriverWait weigt = new WebDriverWait(driver, 100);
		weigt.until(ExpectedConditions.presenceOfElementLocated(ById.id("totalweight"))).sendKeys(total + Keys.TAB);

	}

	public void listPrice(String lista) throws InterruptedException, AWTException {

		WebDriverWait list = new WebDriverWait(driver, 100);
		list.until(ExpectedConditions.presenceOfElementLocated(ById.id("listprice"))).sendKeys(lista + Keys.TAB);

	}

	public void numeroLincense(String number) throws InterruptedException, AWTException {

		WebDriverWait lincense = new WebDriverWait(driver, 100);
		lincense.until(ExpectedConditions.presenceOfElementLocated(ById.id("licenseplatenumber")))
				.sendKeys(number + Keys.TAB);

	}

	public void annualmileage(String mileage) throws InterruptedException, AWTException {

		WebDriverWait anual = new WebDriverWait(driver, 100);
		anual.until(ExpectedConditions.presenceOfElementLocated(ById.id("annualmileage"))).sendKeys(mileage + Keys.TAB);

	}

	public void primeiroBotaoNext() {

		WebDriverWait next = new WebDriverWait(driver, 100);
		next.until(ExpectedConditions.presenceOfElementLocated(ById.id("nextenterinsurantdata"))).click();

	}

	public void firstName(String primeiroNome) {

		WebDriverWait primeiro = new WebDriverWait(driver, 100);
		primeiro.until(ExpectedConditions.presenceOfElementLocated(ById.id("firstname")))
				.sendKeys(primeiroNome + Keys.TAB);

	}

	public void lastName(String segundoNome) {

		WebDriverWait segundo = new WebDriverWait(driver, 100);
		segundo.until(ExpectedConditions.presenceOfElementLocated(ById.id("lastname")))
				.sendKeys(segundoNome + Keys.TAB);

	}

	public void dataAniversario(String dataaniversario) {

		WebDriverWait dateaniversario = new WebDriverWait(driver, 100);
		dateaniversario.until(ExpectedConditions.presenceOfElementLocated(ById.id("birthdate")))
				.sendKeys(Keys.ENTER + dataaniversario);
	}

	public void stretAdress(String end) {

		WebDriverWait adress = new WebDriverWait(driver, 100);
		adress.until(ExpectedConditions.presenceOfElementLocated(ById.id("streetaddress"))).sendKeys(Keys.ENTER + end);
	}

	public void contry(String cid) {

		WebDriverWait cyti = new WebDriverWait(driver, 100);
		cyti.until(ExpectedConditions.presenceOfElementLocated(ById.id("country"))).sendKeys(Keys.ENTER + cid);
		cyti.until(ExpectedConditions.presenceOfElementLocated(ById.id("country"))).click();
	}

	public void zipCode(String code) {

		WebDriverWait zip = new WebDriverWait(driver, 100);
		zip.until(ExpectedConditions.presenceOfElementLocated(ById.id("zipcode"))).sendKeys(Keys.ENTER + code);

	}

	public void ocupacion(String ocupacion) {

		WebDriverWait trab = new WebDriverWait(driver, 100);
		trab.until(ExpectedConditions.presenceOfElementLocated(ById.id("occupation"))).sendKeys(Keys.ENTER + ocupacion);
		trab.until(ExpectedConditions.presenceOfElementLocated(ById.id("occupation"))).click();
		trab.until(ExpectedConditions.presenceOfElementLocated(ById.id("occupation"))).sendKeys(Keys.TAB);
	}

	public void hobbies() throws InterruptedException, AWTException {
		WebDriverWait hob = new WebDriverWait(driver, 100);
		hob.until(ExpectedConditions.presenceOfElementLocated(ByCssSelector.cssSelector(
				"section:nth-of-type(2) > .field.idealforms-field.idealforms-field-checkbox > .group > label:nth-of-type(1) > .ideal-check")))
				.click();

		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	}

	public void segundoNext() throws InterruptedException {
		
		Thread.sleep(4000);
		WebDriverWait next2 = new WebDriverWait(driver, 100);
		next2.until(ExpectedConditions.presenceOfElementLocated(ById.id("nextenterproductdata"))).click();
	}

	public void startDate(String dateiniti) {

		WebDriverWait init = new WebDriverWait(driver, 100);
		init.until(ExpectedConditions.presenceOfElementLocated(ById.id("startdate"))).sendKeys(Keys.ENTER + dateiniti);
	}

	public void insurancesum(String preco) {

		WebDriverWait prec = new WebDriverWait(driver, 100);
		prec.until(ExpectedConditions.presenceOfElementLocated(ById.id("insurancesum"))).sendKeys(Keys.ENTER + preco);
		prec.until(ExpectedConditions.presenceOfElementLocated(ById.id("insurancesum"))).click();
		prec.until(ExpectedConditions.presenceOfElementLocated(ById.id("insurancesum"))).sendKeys(Keys.TAB);
	}

	public void meritrating(String merito) {

		WebDriverWait bonus = new WebDriverWait(driver, 100);
		bonus.until(ExpectedConditions.presenceOfElementLocated(ById.id("meritrating"))).sendKeys(Keys.ENTER + merito);
		bonus.until(ExpectedConditions.presenceOfElementLocated(ById.id("meritrating"))).click();
		bonus.until(ExpectedConditions.presenceOfElementLocated(ById.id("meritrating"))).sendKeys(Keys.TAB);

	}

	public void damageinsurance(String damage) {

		WebDriverWait bonus = new WebDriverWait(driver, 100);
		bonus.until(ExpectedConditions.presenceOfElementLocated(ById.id("damageinsurance")))
				.sendKeys(Keys.ENTER + damage);
		bonus.until(ExpectedConditions.presenceOfElementLocated(ById.id("damageinsurance"))).click();
		bonus.until(ExpectedConditions.presenceOfElementLocated(ById.id("damageinsurance"))).sendKeys(Keys.TAB);

	}

	public void optinalProduct() {

		WebDriverWait optimal = new WebDriverWait(driver, 100);
		optimal.until(ExpectedConditions.presenceOfElementLocated(
				ByCssSelector.cssSelector("section:nth-of-type(3)  p > label:nth-of-type(2) > .ideal-check"))).click();
	}

	public void courtesyCar(String car) {

		WebDriverWait court = new WebDriverWait(driver, 100);
		court.until(ExpectedConditions.presenceOfElementLocated(ById.id("courtesycar"))).sendKeys(Keys.ENTER + car);
		court.until(ExpectedConditions.presenceOfElementLocated(ById.id("courtesycar"))).click();
		court.until(ExpectedConditions.presenceOfElementLocated(ById.id("courtesycar"))).sendKeys(Keys.TAB);
		System.out.println(car);

	}

	public void terceiroNext() {

		WebDriverWait next2 = new WebDriverWait(driver, 100);
		next2.until(ExpectedConditions.presenceOfElementLocated(ById.id("nextselectpriceoption"))).click();
	}

	public void primeiraOpcao() throws InterruptedException {

		Thread.sleep(2000);
		WebDriverWait opcao = new WebDriverWait(driver, 100);
		opcao.until(ExpectedConditions
				.presenceOfElementLocated(ByXPath.xpath("//table[@id='priceTable']//th[@class='group']/label[1]/span")))
				.click();
	}

	public void quartoNext() throws InterruptedException {

		Thread.sleep(5000);
		WebDriverWait next2 = new WebDriverWait(driver, 100);
		next2.until(ExpectedConditions.presenceOfElementLocated(ById.id("nextsendquote"))).click();
	}

	public void eMail(String mail) {

		WebDriverWait email = new WebDriverWait(driver, 100);
		email.until(ExpectedConditions.presenceOfElementLocated(ById.id("email"))).sendKeys(Keys.ENTER + mail);
		email.until(ExpectedConditions.presenceOfElementLocated(ById.id("email"))).sendKeys(Keys.TAB);
	}

	public void fone(String tfone) {

		WebDriverWait email = new WebDriverWait(driver, 100);
		email.until(ExpectedConditions.presenceOfElementLocated(ById.id("phone"))).sendKeys(Keys.ENTER + tfone);
		email.until(ExpectedConditions.presenceOfElementLocated(ById.id("phone"))).sendKeys(Keys.TAB);
	}

	public void username(String username) {

		WebDriverWait usename = new WebDriverWait(driver, 100);
		usename.until(ExpectedConditions.presenceOfElementLocated(ById.id("username"))).sendKeys(Keys.ENTER + username);
		usename.until(ExpectedConditions.presenceOfElementLocated(ById.id("username"))).sendKeys(Keys.TAB);
	}

	public void password(String password) {

		WebDriverWait pass = new WebDriverWait(driver, 100);
		pass.until(ExpectedConditions.presenceOfElementLocated(ById.id("password"))).sendKeys(Keys.ENTER + password);
		pass.until(ExpectedConditions.presenceOfElementLocated(ById.id("password"))).sendKeys(Keys.TAB);

	}

	public void confpassword(String password) {

		WebDriverWait pass = new WebDriverWait(driver, 100);
		pass.until(ExpectedConditions.presenceOfElementLocated(ById.id("confirmpassword"))).sendKeys(Keys.ENTER + password);
		pass.until(ExpectedConditions.presenceOfElementLocated(ById.id("confirmpassword"))).sendKeys(Keys.TAB);

	}
	
	public void botaoSendMail() throws InterruptedException {

		WebDriverWait mail = new WebDriverWait(driver, 100);
		mail.until(ExpectedConditions.presenceOfElementLocated(ById.id("sendemail"))).click();
		Thread.sleep(4000);

	}
	
	public String emailsucess() {
		WebDriverWait confirmacao = new WebDriverWait(driver, 100);
		return confirmacao.until(ExpectedConditions.presenceOfElementLocated(ByCssSelector.cssSelector(".showSweetAlert.sweet-alert.visible > h2"))).getText();
	}
	
	

}
