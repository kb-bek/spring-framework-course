package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false   ) String surname,
                            Model model) {
//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");

        model.addAttribute("message", "Hello" + " " + name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }


    @GetMapping("/calculator")
    public String calculator(@RequestParam("a") String a,
                             @RequestParam("b") String b,
                             @RequestParam("action") String action,
                             Model model) {
        if (action.equals("addition")) {
            model.addAttribute("result", "a = " + a + "\n" + "b = " + b + "\n"
                     + "Action - " + action + "\n" 
                     + "Result - " + (Integer.parseInt(a) + Integer.parseInt(b)));
        } else if (action.equals("subtraction")) {
            model.addAttribute("result", "a = " + a + "\n" + "b = " + b +"\n"
                    + "Action - " + action + "\n"
                    + "Result - " + (Integer.parseInt(a) - Integer.parseInt(b)));
        } else if (action.equals("multiplication")) {
            model.addAttribute("result", "a = " + a + "\n" + "b = " + b + "\n"
                    + "Action - " + action + "\n"
                    + "Result - " + (Integer.parseInt(a) * Integer.parseInt(b)));
        } else if (action.equals("division")) {
            if (b.equals("0"))
                model.addAttribute("result", "Нельзя делить цифру на ноль");
            else
                model.addAttribute("result", "a = " + a + "\n" + "b = " + b + "\n"
                        + "Action - " + action + "\n"
                        + "Result - " + (Integer.parseInt(a) / Integer.parseInt(b)));
        }

        return "first/calculator";
    }
}
