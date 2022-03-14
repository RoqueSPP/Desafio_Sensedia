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
	
	public void UpdateCard(String idcard,String key,String token) throws UnirestException{
		
		HttpResponse<JsonNode> response = Unirest.put("https://api.trello.com/1/cards/"+idcard+key+token)
				.header("Accept", "application/json")
				.queryString("idAttachment" , idcard)
				.queryString("color" ,"yellow")
				.queryString("size" ,"normal")
				.queryString( "brightness", "blue")
				.queryString("isTemplate", false)
				  .asJson();

				System.out.println(response.getBody());
		
		
	public void DeliteBoard(String idboard, String key, String token) throws UnirestException {
	HttpResponse<String> response = Unirest.delete("https://api.trello.com/1/boards/"+idboard+"?"+key+token)
			  .asString();

			System.out.println(response.getBody());	
		
	}
}
