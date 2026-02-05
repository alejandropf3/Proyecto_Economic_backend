/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.backend.economic;

import com.backend.economic.config.ConfigDB;
import com.backend.economic.server.AppServer;

/**
 *
 * @author Propietario
 */
public class Economic {

    public static void main(String[] args) {
        ConfigDB.getConnection();

        try {
            // Iniciamos el backend
            AppServer.start(8080);
        } catch (Exception e) {
            // Recibimos el error e imprimimos un mensaje
            System.err.println("Error al arrancar la aplicacion:" + e.getMessage());
        }
    }
}
