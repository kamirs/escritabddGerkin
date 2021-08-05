package br.com.desafio.Steps;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import br.com.desafio.Util;
import br.com.desafio.Page.mapeamentoPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class mapeamentoSteps extends Util {
	mapeamentoPage mpt = new mapeamentoPage();
	
	@Dado("^que eu esteja na plataforma  \"([^\"]*)\"$")
	public void que_eu_esteja_na_plataforma(String url) throws Throwable {
	   
		setup(url);
	}

	@Quando("^Realizo a seleção do campo MAKE \"([^\"]*)\"$")
	public void realizoASeleçãoDoCampoMAKE(String carro) throws Throwable {
		
		mpt.campoMake(carro);
		System.out.println(carro);
		
	}

	@E("^Seleciono o Modelo \"([^\"]*)\"$")
	public void selecionoOModelo(String modelo) throws Throwable {
		mpt.campoModel(modelo);
		System.out.println(modelo);
	}

	@E("^Digito a capacidade \"([^\"]*)\"$")
	public void digitoACapacidade(String capacidade) throws Throwable {
		
		mpt.campocapacidade(capacidade);
		System.out.println(capacidade);
	}

	@E("^preencho o campo perfomance \"([^\"]*)\"$")
	public void preenchoOCampoPerfomance(String perfomance) throws Throwable {
		
		mpt.campoperfomance(perfomance);
		System.out.println(perfomance);
	}

	@E("^Seleciono uma data \"([^\"]*)\"$")
	public void selecionoUmaData(String data) throws Throwable {
		mpt.data(data);
		System.out.println(data);
	}

	@E("^Seleciono o numberSeats \"([^\"]*)\"$")
	public void selecionoONumberSeats(String numero) throws Throwable {
		mpt.numberSeats(numero);
		System.out.println(numero);
	}

	@E("^Seleciono o Right Hand Drive Yes$")
	public void selecionoORightHandDriveYes() throws Throwable {
		
		
		mpt.righthanddriveyes();
	}

	@E("^Seleciono o NumberOFSeats \"([^\"]*)\"$")
	public void selecionoONumberOFSeats(String assentos) throws Throwable {
		mpt.numberofseatsmotorcycle(assentos);
		System.out.println(assentos);
	}

	@E("^Seleciono o FuelType \"([^\"]*)\"$")
	public void selecionoOFuelType(String fuel) throws Throwable {
		mpt.fuelType(fuel);
		System.out.println(fuel);
	}

	@E("^preencho a capacidade \"([^\"]*)\"$")
	public void preenchoACapacidade(String peso) throws Throwable {
		mpt.payload(peso);
		System.out.println(peso);
		
	}

	@E("^Preencho o totalweight \"([^\"]*)\"$")
	public void preenchoOTotalweight(String total) throws Throwable {
		mpt.totalWeigt(total);
		System.out.println(total);
	}

	@E("^Preencho a List Price \"([^\"]*)\"$")
	public void preenchoAListPrice(String lista) throws Throwable {
		
		mpt.listPrice(lista);
		System.out.println(lista);
	}

	@E("^Preencho plate Number \"([^\"]*)\"$")
	public void preenchoPlateNumber(String number) throws Throwable {
		mpt.numeroLincense(number);
	}

	@E("^Prrencho o Annual Mileage \"([^\"]*)\"$")
	public void prrenchoOAnnualMileage(String mileage) throws Throwable {
		mpt.annualmileage(mileage);
	}

	@E("^Realizo o click em next$")
	public void realizoOClickEmNext() throws Throwable {
		mpt.primeiroBotaoNext();
	}

	@E("^Preencho o FirtName \"([^\"]*)\"$")
	public void preenchoOFirtName(String primeiroNome) throws Throwable {
		mpt.firstName(primeiroNome);
	}

	@E("^Preencho o LastName \"([^\"]*)\"$")
	public void preenchoOLastName(String segundoNome) throws Throwable {
		mpt.lastName(segundoNome);
	}

	@E("^Preencho a data de aniversario \"([^\"]*)\"$")
	public void preenchoADataDeAniversario(String dataaniversario) throws Throwable {
		mpt.dataAniversario(dataaniversario);
	}

	@E("^Prrencho o Street Addres \"([^\"]*)\"$")
	public void prrenchoOStreetAddres(String end) throws Throwable {
		mpt.stretAdress(end);
	}

	@E("^Seleciono a Country \"([^\"]*)\"$")
	public void selecionoACountry(String cid) throws Throwable {
		mpt.contry(cid);
	}

	@E("^preencho o Zip Code \"([^\"]*)\"$")
	public void preenchoOZipCode(String code) throws Throwable {
		mpt.zipCode(code);
	}

	@E("^Seleciono a ocupacao \"([^\"]*)\"$")
	public void selecionoAOcupacao(String ocupacion) throws Throwable {
		mpt.ocupacion(ocupacion);
	}

	@E("^Seleciono Hobbies$")
	public void selecionoHobbies() throws Throwable {
		mpt.hobbies();
	}

	@E("^Realizo o click no segundo next$")
	public void realizoOClickNoSegundoNext() throws Throwable {

		mpt.segundoNext();
	}

	@E("^preencho a startDate \"([^\"]*)\"$")
	public void preenchoAStartDate(String dateiniti) throws Throwable {
		mpt.startDate(dateiniti);
	}

	@E("^seleciono a insurancesum \"([^\"]*)\"$")
	public void selecionoAInsurancesum(String preco) throws Throwable {
		mpt.insurancesum(preco);
	}

	@E("^seleciono o Merit Rating \"([^\"]*)\"$")
	public void selecionoOMeritRating(String merito) throws Throwable {
		mpt.meritrating(merito);
	}

	@E("^Seleciono o damageinsurance \"([^\"]*)\"$")
	public void selecionoODamageinsurance(String damage) throws Throwable {
		mpt.damageinsurance(damage);
	}

	@E("^Seleciono o Optimal product$")
	public void selecionoOOptimalProduct() throws Throwable {
		mpt.optinalProduct();
	}

	@E("^seleciono o Courtesy Car \"([^\"]*)\"$")
	public void selecionoOCourtesyCar(String car) throws Throwable {
		mpt.courtesyCar(car);
	}

	@E("^seleciono o terceiro next$")
	public void selecionoOTerceiroNext() throws Throwable {
		mpt.terceiroNext();
	}

	@E("^Seleciono a primeira opcao$")
	public void selecionoAPrimeiraOpcao() throws Throwable {
	
		mpt.primeiraOpcao();
	}

	@E("^Seleciono o quarto Next$")
	public void selecionoOQuartoNext() throws Throwable {
		mpt.quartoNext();
	}

	@E("^incluo o e mail \"([^\"]*)\"$")
	public void incluoOEMail(String mail) throws Throwable {
		mpt.eMail(mail);
		System.out.println(mail);
	}

	@E("^Incluo o fone \"([^\"]*)\"$")
	public void incluoOFone(String tfone) throws Throwable {
		mpt.fone(tfone);
	}

	@E("^incluo o username \"([^\"]*)\"$")
	public void incluoOUsername(String username) throws Throwable {
		mpt.username(username);
	}

	@E("^Incluo o password \"([^\"]*)\"$")
	public void incluoOPassword(String password) throws Throwable {
		mpt.password(password);
	}

	@E("^Confirmo o password \"([^\"]*)\"$")
	public void confirmoOPassword(String password) throws Throwable {
		mpt.confpassword(password);
	}

	@E("^clico em sendmail$")
	public void clicoEmSendmail() throws Throwable {
		mpt.botaoSendMail();
	}

	@Entao("^recebo a mensagem de confirmação \"([^\"]*)\"$")
	public void receboAMensagemDeConfirmação(String send) throws Throwable {
		
		String esperada = mpt.emailsucess();
		assertEquals(esperada, send);
		System.out.println(send);
		System.out.println(esperada);
		finalizar();
	}



	

	
	
	
	
	
	
	
	

	

	

}
