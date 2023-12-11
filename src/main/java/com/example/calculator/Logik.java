package com.example.calculator;

public interface Logik  {

    int getSum(int num1, int num2);
    int getDifference(int num1,int num2);
    int getMultiplication(int num1,int num2);

    String getDivision(int num1,int num2) throws DivisionNull;


}
