package com.HAndN.spring_hibernate.services;

import com.HAndN.spring_hibernate.models.ResponseTemplate;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {


    public ResponseTemplate<Double> divideNumbers(int num1, int num2){
        if(num2 == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        double result = num1*1.0 / num2;
        return ResponseTemplate.buildResponse(result, "", 200);
    }

    public ResponseTemplate<Integer> addNumbers(int number1, int number2) {
        return ResponseTemplate.buildResponse(number1 + number2, "", 200);
    }
}
