package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    // handles requests for URI /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, HTML!";
//    }

    // lives at /hello/goodbye
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, HTML!";
    }

    // handler for /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    // handler for /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello again, " + name + "!";
    }

    // lives at /hello/form
    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<head>" +
                "<title>" +
                "helloForm" +
                "</title>" +
                "</head>" +
                "<body>" +
                "<form action='hello' method='post'>" +
                "<input type='text' name='name'>" + //submit a request to /hello
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
