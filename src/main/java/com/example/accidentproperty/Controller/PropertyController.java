package com.example.accidentproperty.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping("/top")
    public String hello() {
        return "top_pc";
    }

    @RequestMapping(value="/", method = RequestMethod.POST)
    public String success(@RequestParam String mailAddress, String inquiryContents, Model model) {
        model.addAttribute("mailAddress", mailAddress);
        model.addAttribute("inquiryContents", inquiryContents);
        return "success";
    }


}
