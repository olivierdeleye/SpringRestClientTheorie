package be.vdab.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.rest.FiliaalListItemREST;
import be.vdab.rest.FiliaalListREST;
import be.vdab.restClient.FiliaalClient;

public class Main {

	public static void main(String[] args) {
	   try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/restClient.xml")) {
			FiliaalClient filiaalClient = context.getBean(FiliaalClient.class);
			FiliaalListREST filiaalListREST = filiaalClient.findAll();
			for (FiliaalListItemREST filiaalItem : filiaalListREST.getFilialen()) {
			System.out.println(filiaalItem.getId() + ":" + filiaalItem.getNaam());
			}
			}

	}

}
