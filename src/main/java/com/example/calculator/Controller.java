package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final Logik logik;

    public Controller(Logik logik) {
        this.logik = logik;
    }
    @GetMapping("")
    public String HelloPeople() {
        return "Добро пожаловать в калькулятор!!!";
    }

    @GetMapping("/plus")
    public String Sum(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + logik.getSum(num1, num2);
    }

    @GetMapping("/minus")
    public String Difference(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + logik.getDifference(num1, num2);
    }

    @GetMapping("/multiply")
    public String Multiplication(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + logik.getMultiplication(num1, num2);

    }

    @GetMapping("/divide")
    public String Division(@RequestParam int num1, @RequestParam int num2) throws DivisionNull {

            return num1 + " / " + num2 + " = " + logik.getDivision(num1, num2);

    }

}
