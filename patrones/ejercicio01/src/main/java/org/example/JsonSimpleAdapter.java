package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.List;

public class JsonSimpleAdapter extends VoorheesExporter{

    private JSONObject exportar(Socio socio) {
        JSONObject socioJson = new JSONObject();
        socioJson.put("nombre",socio.getNombre());
        socioJson.put("email",socio.getEmail());
        socioJson.put("legajo",socio.getLegajo());
        return socioJson;
    }

    @Override
    public String exportar(List<Socio> socios) {
        if(socios.isEmpty()){
            return "[]";
        }
        JSONArray lista = new JSONArray();
        socios.stream().forEach(socio -> lista.add(this.exportar(socio)));
        return lista.toJSONString();
    }
}
