package stepsdefinition;

import com.mashape.unirest.http.exceptions.UnirestException;

import io.cucumber.java.en.When;
import metodos.Metodo;

public class StepUpdateCard {
	
	Metodo metodo = new Metodo();
	
	@When("eu editar o Card na Api valido o statuscode {string}{string}")
	public void eu_editar_o_card_na_api_valido_o_statuscode(String key, String token) throws UnirestException {
		metodo.UpdateCard("622e9e65b9d9634fb7b281d8",key,token);
		
	}

}
