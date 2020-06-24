package com.example.soapclient;



import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


//entidad de prueba utilizada para enviar los valores al servicio REST
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestEntity {
	private Double firstNumber;
	
	private Double SecondNumber;
	
	private List<Double> listNumbers;

	public Double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(Double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public Double getSecondNumber() {
		return SecondNumber;
	}

	public void setSecondNumber(Double secondNumber) {
		SecondNumber = secondNumber;
	}

	public List<Double> getListNumbers() {
		return listNumbers;
	}

	public void setListNumbers(List<Double> listNumbers) {
		this.listNumbers = listNumbers;
	}
	

	
}