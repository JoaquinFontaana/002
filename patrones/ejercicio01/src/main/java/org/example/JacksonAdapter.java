package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

public class JacksonAdapter extends VoorheesExporter {

    @Override
    public String exportar(List<Socio> socios){
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(socios);
            return json;
        }
        catch (Exception e){
            return e.getMessage();
        }

    }

}
