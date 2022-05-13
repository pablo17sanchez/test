package com.web.javaweb.controllers;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.GenericType;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.web.javaweb.model.VisitantesConsumer;

@ManagedBean(name = "visitas", eager = true)
@RequestScoped
public class VisitasController implements Serializable {

    public String SERVICE_BASE_URI;

    public List<VisitantesConsumer> getAllVisitas() {

        List<VisitantesConsumer> visitas = new ArrayList<>();
        try {

            com.sun.jersey.api.client.Client client = com.sun.jersey.api.client.Client.create();

            WebResource webResource = client
                    .resource("http://localhost:9192/visitantes");

            ClientResponse response = webResource.accept("application/json")
                    .get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            String json = response.getEntity(String.class);
            Gson gson=new Gson();

            visitas = gson.fromJson(json, new TypeToken<List<VisitantesConsumer>>(){}.getType());


        } catch (Exception e) {

            e.printStackTrace();

        }
        return visitas;

    }

}
