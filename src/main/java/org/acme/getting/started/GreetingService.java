package org.acme.getting.started;

import javax.enterprise.context.ApplicationScoped;
import java.net.*;

@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        String hn = "";
        try {
		hn = InetAddress.getLocalHost().getHostName();
        } catch(Exception e) {}
	System.out.println("您好， " + name + "\nHostname: " + hn + "\n");
	return "您好， " + name + "\nHostname: " + hn + "\n";
    }

}
