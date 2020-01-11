package com.HAndN.spring_hibernate.controllers;

import com.HAndN.spring_hibernate.models.ResponseTemplate;
import com.HAndN.spring_hibernate.services.CalculatorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;

@Controller
public class CalculatorController {

    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/admin/divide/{number1}/{number2}")
    @ResponseBody
    public ResponseTemplate<Double> divideNumbers(@PathVariable("number1") int number1, @PathVariable("number2") int number2) {
        return calculatorService.divideNumbers(number1, number2);
    }

    @GetMapping("/user/add/{number1}/{number2}")
    @ResponseBody
    public ResponseTemplate<Integer> addNumbers(@PathVariable("number1") int number1, @PathVariable("number2") int number2) {
        return calculatorService.addNumbers(number1, number2);
    }
}
