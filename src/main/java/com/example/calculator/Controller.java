package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final Logik logik;

    public Controller(Logik logik) {
        this.logik = logik;
    }

    @GetMapping("/calculator")
    public String HelloPeople() {
        return "Добро пожаловать в калькулятор!!!";
    }

    @RequestMapping("/calculator/plus")
    public String Sum(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + logik.getSum(num1, num2);
    }

    @RequestMapping("/calculator/minus")
    public String Difference(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + logik.getDifference(num1, num2);
    }

    @RequestMapping("/calculator/multiply")
    public String Multiplication(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + logik.getMultiplication(num1, num2);

    }

    @RequestMapping("/calculator/divide")
    public String Division(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0) {
            return logik.Eror();


        } else {
            return num1 + " / " + num2 + " = " + logik.getDivision(num1, num2);
        }
    }

}
