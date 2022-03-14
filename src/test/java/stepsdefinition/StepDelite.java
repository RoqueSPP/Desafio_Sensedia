package stepsdefinition;

import com.mashape.unirest.http.exceptions.UnirestException;

import io.cucumber.java.en.When;
import metodos.Metodo;

public class StepDelite {
	
	Metodo metodo = new Metodo();

	@When("eu deletar o board na Api valido o statuscode {string}{string}")
	public void eu_deletar_o_board_na_api_valido_o_statuscode(String key, String token) throws UnirestException {
		metodo.DeliteBoard("622eaae8448634271d633bb0", key, token);
	}

}
