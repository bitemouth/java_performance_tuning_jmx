package com.bitemouth.jmxexample;

public interface CalculatorMBean {

  void setDecimalPlaces(int decimalPlaces);

  int getDecimalPlaces();
}