package stepsdefinition;

import com.mashape.unirest.http.exceptions.UnirestException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import metodos.Metodo;

public class StepBoard{

	Metodo metodo = new Metodo();
	
	@Given("que eu acesse a API")
	public void que_eu_acesse_a_api() {
	
	}


	@When("eu Criar o Board na Api valido o statuscode {string}{string}")
	public void eu_criar_o_board_na_api_valido_o_statuscode(String key, String token) throws UnirestException{
	  metodo.CreateBoard("sensedia", key, token);
	}
}
