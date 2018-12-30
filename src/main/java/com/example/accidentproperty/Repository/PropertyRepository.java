package com.example.accidentproperty.Repository;

import com.example.accidentproperty.Model.Property;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@Repository
public class PropertyRepository {

    @Value("http://localhost:8090/property")
    URI uri;

    RestTemplate restTemplate = new RestTemplate();

    public List<Property> findAll(){
        Property property = new Property();
        RequestEntity requestEntity = RequestEntity.get(uri).build();
        ResponseEntity<List<Property>> responseEntity =
                restTemplate.exchange(requestEntity, new ParameterizedTypeReference<List<Property>>(){});
        return responseEntity.getBody();
    }

}
