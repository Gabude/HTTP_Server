package Online_Space.HTTP_Server;

import Online_Space.HTTP_Server.httpServer.config.Configuration;
import Online_Space.HTTP_Server.httpServer.config.ConfigurationManager;
import Online_Space.HTTP_Server.httpServer.core.ServerListenerThread;

import java.io.IOException;

public class HttpServer {
    public static void main(String[] args) {

        ConfigurationManager.getInstance().loadConfigurationFile("src/main/java/Online_Space/HTTP_Server/http.json"); //File from content-root

        Configuration conf = ConfigurationManager.getInstance().getCurrentConfiguration();

        System.out.println("Using Port: " + conf.getPort());
        System.out.println("Using WebRoot: " + conf.getWebroot());

        try {
            ServerListenerThread serverListenerThread = new ServerListenerThread(conf.getPort(), conf.getWebroot());
            serverListenerThread.start();
        } catch (IOException e) {
            e.printStackTrace();
            // TODO handle later.
        }
    }
}
