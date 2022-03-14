package stepsdefinition;

import com.mashape.unirest.http.exceptions.UnirestException;

import io.cucumber.java.en.When;
import metodos.Metodo;

public class StepCard {


	Metodo metodo = new Metodo();
	
	@When("eu Criar o Card na Api valido o statuscode {string}{string}")
	public void eu_criar_o_card_na_api_valido_o_statuscode(String key, String token) throws UnirestException {
	  metodo.CrateCard("622eab12d3d4ad0ef43854e6",key,token);
	  
	}

}
