package metodos;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import io.restassured.RestAssured;

public class Metodo {

	public void CreateBoard(String name, String key, String token) throws UnirestException {
		HttpResponse<String> response = Unirest.post("https://api.trello.com/1/boards/?name=" + name + key + token)

				.header("Accept", "application/json").asString();

		System.out.println(response.getBody());

	}

	public void CrateList(String name, String idBoard, String key, String token) throws UnirestException {

		HttpResponse<String> response = Unirest
				.post("https://api.trello.com/1/lists?name=" + name + "&idBoard=" + idBoard + key + token)
				.header("Accept", "application/json")

				.asString();

		System.out.println(response.getBody());

	}

	public void CrateCard(String idlist,String key,String token) throws UnirestException {

		HttpResponse<String> response = Unirest.post("https://api.trello.com/1/cards?idList="+idlist+key+token)
				  .header("Accept", "application/json")
				  .asString();

				System.out.println(response.getBody());
	}
	
	
	public void UpdateCard(String idcard,String key,String token) throws UnirestException {

		RestAssured
		.given()
		.header("Accept", "application/json")
		.body("{\"color\": \"yellow\",\"idUploadedBackground\":true,\"size\":\"normal\",\"brightness\":\"light\",\"isTemplate\": false}")
		.when()
		.post("https://api.trello.com/1/cards/"+idcard+"/actions/comments?text=roque"+key+token)
		.then()
		;
		
	}
		
		
	public void DeliteBoard(String idboard, String key, String token) throws UnirestException {
	HttpResponse<String> response = Unirest.delete("https://api.trello.com/1/boards/"+idboard+"?"+key+token)
			  .asString();

			System.out.println(response.getBody());	
		
	}
}