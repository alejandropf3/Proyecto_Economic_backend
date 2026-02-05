package com.backend.economic.controller;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;

public class EconomicController implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String response = "Bienvenido al Sistema Economic Backend :)";
        exchange.sendResponseHeaders(200, response.length());
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(response.getBytes());
        }
    }
}