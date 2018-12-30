package com.example.accidentproperty.Service;

import com.example.accidentproperty.Model.Property;
import com.example.accidentproperty.Repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {

    @Autowired
    PropertyRepository propertyRepository;

    public List<Property> findAll(){
        return propertyRepository.findAll();
    }
}
