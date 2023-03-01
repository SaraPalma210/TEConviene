package com.teconviene.teconviene.util;

import com.teconviene.teconviene.model.Servicio;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class Util {
    public static List<Servicio> obtenerServicioList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uri = "/api/teconviene";

        String url1 = "http://localhost:8080/api/teconviene/servicio";
        List<Servicio> l = new LinkedList<Servicio>();
        Servicio t;
        try {
            URL url = new URL(url1);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;

            while ((output = br.readLine()) != null) {
                JsonParser parser = new JsonParser();
                Object obj = parser.parse(output);
                JsonArray json = (JsonArray) obj;
                for (int i = 0; i < json.size(); i++) {

                    JsonObject object = (JsonObject) json.get(i);
                    Servicio servicio = new Servicio();
                    servicio.setId(String.valueOf(object.get("id")));
                    servicio.setNombre(String.valueOf(object.get("nombre")));
                    servicio.setPrecio(Double.valueOf(String.valueOf(object.get("precio"))));

                    l.add(servicio);
                }
            }
            System.out.println(l);
            conn.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return l;

    }
}
