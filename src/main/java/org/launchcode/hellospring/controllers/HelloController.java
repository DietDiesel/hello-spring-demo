package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    // handler for /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    @ResponseBody
    public static String createMessage(@RequestParam String name, String lang) {
        switch (lang) {
            case "English": return "Hello, " + name + "!";
            case "Badenglish": return "Go frick yerself, " + name + "!";
            case "Senglish": return "Howdy, " + name + "!";
            case "Spanglish": return "Oye, acho, you that " + name + "?";
            case "Klingon": return "nuqneH, " + name + "!";
            default: return "Who the heck are you??";
        }

    }

    // handler for /form
    @GetMapping("form")
    public String helloForm() {
        return "form";
    }
}
