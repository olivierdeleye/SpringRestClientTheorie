package be.vdab.restClient;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import be.vdab.rest.FiliaalListREST;

@Component
class FiliaalClientImpl implements FiliaalClient{

	private final URI filiaalServiceURI;
	private final RestTemplate restTemplate;
	@Autowired // er wordt een bean gemaakt
	public FiliaalClientImpl(@Value("${filiaalServiceURI}") URI filiaalServiceURI, RestTemplate restTemplate) {
	this.filiaalServiceURI = filiaalServiceURI;
	this.restTemplate = restTemplate;
	}
	
	@Override
	public FiliaalListREST findAll() {
		
		return restTemplate.getForObject(filiaalServiceURI, FiliaalListREST.class);
	}
}
