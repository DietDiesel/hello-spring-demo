package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class HelloController {

    // handler for /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
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
    public String helloForm(){
        return "<html>" +
                "<head>" +
                "<title>" +
                "helloForm" +
                "</title>" +
                "</head>" +
                "<body>" +
                "<form action='hello' method='get'>" +
                "<input type='text' name='name'>" + //submit a request to /hello
                "<label for='lang'></label><select id='lang' name='lang'>" +
                "<option value='English'>English</option>" +
                "<option value='Badenglish'>Bad English</option>" +
                "<option value='Senglish'>Southern English</option>" +
                "<option value='Spanglish'>Spanglish</option>" +
                "<option value='Klingon'>Klingon</option>" +
                "</select>"+
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
