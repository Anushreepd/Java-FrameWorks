package rest;

import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class Humidity extends CoapResource
{
public Humidity(String name) {
	super(name);
}
int i=0;


@Override
public void handleGET(CoapExchange exchange) {
	exchange.respond("Temperature"+(i++));
}

public static void main(String[] args) {
	CoapServer server = new CoapServer();
	server.add(new Humidity("humidity"));
	server.add(new Humidity("hello1"));
	server.start();
}
}
