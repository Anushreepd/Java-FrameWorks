package rest;

import java.io.IOException;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.elements.exception.ConnectorException;

public class Clientcoap {
	public static void main(String[] args) {
	CoapClient client = new CoapClient("coap://192.168.0.179/humidity");
	for(int i = 0; i<10; i++) {
		String text;
		try {
			text = client.get().getResponseText();
			System.out.println("Humidity"+text);
			Thread.sleep(1000);
		} catch (ConnectorException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}catch (Exception e) {
			
			
		}
	}
	}

}
