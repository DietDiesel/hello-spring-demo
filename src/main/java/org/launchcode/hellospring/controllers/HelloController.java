package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    // handler for /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    public static String createMessage(@RequestParam String name, String lang, Model model) {
        String greeting;
        switch (lang) {
            case "English": greeting = "Hello, " + name + "!"; break;
            case "Badenglish": greeting = "Go frick yerself, " + name + "!"; break;
            case "Senglish": greeting = "Howdy, " + name + "!"; break;
            case "Spanglish": greeting = "Oye, acho, you that " + name + "?"; break;
            case "Klingon": greeting = "nuqneH, " + name + "!"; break;
            default: greeting = "Who the heck are you??";
        }
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    // handler for /form
    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

    @GetMapping("hello-names")
    public String hellNames(Model model) {
        List<String> names = new ArrayList<>();
        names.add("Joel");
        names.add("Crow");
        names.add("Tom Servo");
        names.add("Gypsy");
        names.add("Cambot");
        model.addAttribute("names", names);
        return "hello-list";
    }
}
