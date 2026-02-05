package com.backend.economic.server;

import com.sun.net.httpserver.HttpServer;
import com.backend.economic.controller.EconomicController;
import java.net.InetSocketAddress;
import java.io.IOException;

public class AppServer {

    public static void start(int port) throws IOException {
        // Se crea el servidor indicando el puerto ()
        // El '0' es el backlog y define cuantas conexiones entrantes pueden quedarse en
        // espera o en cola
        // El valor ingresado en el backlog define la cantidad de peticiones que puede
        // mantener en cola
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // Registramos la ruta principal
        server.createContext("/api/economic", new EconomicController());

        server.setExecutor(null);
        server.start(); // Se enciende el servidor
        System.out.println("Servidor Económic iniciado en el puerto: " + port);
    }
}
