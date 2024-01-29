package de.dauer.rest.clientService;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import de.dauer.rest.businessServices.App;
import de.dauer.rest.businessServices.ModelDTO;

@Service
public class ConsumerService {
	
	private App app;
	
	public ConsumerService(App app){
		this.app=app;
	}
	
	
	public void sendRestToConsumer(ModelRest modelRest) {
	RestTemplate restTemplate= new RestTemplate();
	Map<String,String> jsonToSend= new HashMap<>();
	jsonToSend.put("vorname", modelRest.getVorname());
	jsonToSend.put("nachname",modelRest.getNachname());
	jsonToSend.put("stadt",modelRest.getStadt());
	

	
	HttpEntity<Map<String,String>> request=new HttpEntity<>(jsonToSend);
	String url="https://8afa233c-e886-4cf1-a153-73c40cc47258.mock.pstmn.io/dauermock/person";
	String response=restTemplate.postForObject(url, request, String.class);
	System.out.println(response);
	
	System.out.println("My builder "+app.buy(modelRest));
	
	}

}
