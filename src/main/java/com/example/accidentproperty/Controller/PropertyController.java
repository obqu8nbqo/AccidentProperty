package com.example.accidentproperty.Controller;

import com.example.accidentproperty.Model.Property;
import com.example.accidentproperty.Service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PropertyController {

    @Autowired
    PropertyService propertyService;

    @RequestMapping("/top")
    public String topPage(Model model) {
        List<Property> propertyList;
        propertyList = propertyService.findAll();
        model.addAttribute("propertyList", propertyList);
        return "top_pc";
    }

    @RequestMapping(value="/", method = RequestMethod.POST)
    public String success(@RequestParam String mailAddress, String inquiryContents, Model model) {
        model.addAttribute("mailAddress", mailAddress);
        model.addAttribute("inquiryContents", inquiryContents);
        return "success";
    }


}
