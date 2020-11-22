package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
@RequestMapping("/condiments")
public class SandwichCondimentsController {

    @GetMapping
    public ModelAndView getCondiments(){
        return new ModelAndView("index");
    }

    @PostMapping
    public ModelAndView showCondiments(@RequestParam(defaultValue = "") String[] condiment){
        return new ModelAndView("index","condiments", !Arrays.toString(condiment).equals("[]")? Arrays.toString(condiment):"Empty!");
    }
}
