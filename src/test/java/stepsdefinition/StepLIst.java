package stepsdefinition;

import com.mashape.unirest.http.exceptions.UnirestException;

import io.cucumber.java.en.When;
import metodos.Metodo;

public class StepLIst{
	
	Metodo metodo = new Metodo();

	@When("eu Criar o List na Api e valido o statuscode {string}{string}")
	public void eu_criar_o_list_na_api_e_valido_o_statuscode(String key, String token) throws UnirestException {
		 metodo.CrateList("Automação", "622eaae8448634271d633bb0", key, token);
	}

}
