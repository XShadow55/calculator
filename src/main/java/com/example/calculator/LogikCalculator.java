package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class LogikCalculator implements Logik{



    @Override
    public int getSum(int num1,int num2) {
        return num1+num2;
    }

    @Override
    public int getDifference(int num1,int num2) {
        return num1-num2;
    }

    @Override
    public int getMultiplication(int num1,int num2) {
        return num1*num2;
    }

    @Override
    public int getDivision(int num1,int num2) {
        return num1/num2;
    }
    @Override
    public String Eror(){
        return "На ноль делить нельзя";
    }
}
