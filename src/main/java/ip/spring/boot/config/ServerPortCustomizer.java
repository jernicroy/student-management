package ip.spring.boot.config;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;
@SuppressWarnings("rawtypes")
@Component
public class ServerPortCustomizer implements WebServerFactoryCustomizer {
    @Override
	public void customize(WebServerFactory factory) {
        String port = System.getenv("X_ZOHO_CATALYST_LISTEN_PORT");
        int listenPort;
        if(port != null && !port.isEmpty()) {
            listenPort = Integer.parseInt(System.getenv("X_ZOHO_CATALYST_LISTEN_PORT"));
        } else {
            listenPort = 8080;
        }
        ((ConfigurableWebServerFactory) factory).setPort(listenPort);
    }
}