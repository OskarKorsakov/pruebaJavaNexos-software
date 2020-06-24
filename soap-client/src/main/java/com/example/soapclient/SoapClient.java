package com.example.soapclient;


import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;



@Service
@Component("operations")
public class SoapClient extends WebServiceGatewaySupport {

    private String endpoint = "http://localhost:8080/ws/operations.wsdl";

    public double getSum(Double firstNumber, Double SecondNumber) {
        GetSumRequest request = new GetSumRequest();
        request.setFirstNumber(firstNumber);
        request.setSecondNumber(SecondNumber);
        GetSumResponse response = (GetSumResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint,
                request);
        return response.getResponse();
    }
    
    public double getDiference(Double firstNumber, Double SecondNumber) {
        GetDiferenceRequest request = new GetDiferenceRequest();
        request.setFirstNumber(firstNumber);
        request.setSecondNumber(SecondNumber);
        GetDiferenceResponse response = (GetDiferenceResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint,
                request);
        return response.getResponse();
    }
    
    public double getMultiplication(Double firstNumber, Double SecondNumber) {
        GetMultiplicationRequest request = new GetMultiplicationRequest();
        request.setFirstNumber(firstNumber);
        request.setSecondNumber(SecondNumber);
        GetMultiplicationResponse response = (GetMultiplicationResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint,
                request);
        return response.getResponse();
    }
    
    public double getDivision(Double firstNUmber, Double SecondNumber) {
        GetDivisionRequest request = new GetDivisionRequest();
        request.setFirstNumber(firstNUmber);
        request.setSecondNumber(SecondNumber);
        GetDivisionResponse response = (GetDivisionResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint,
                request);
        return response.getResponse();
    }
    
    public double getAverage(List<Double> listNumbers) {
    	GetSumRequest sumRequest = new GetSumRequest();
        GetDivisionRequest divisionRequest = new GetDivisionRequest();
        Double sumTotal = (double) 0;
        for (Double item : listNumbers) {
        	sumRequest.setFirstNumber(item);
        	sumRequest.setSecondNumber(sumTotal);
        	GetSumResponse sumResponse = (GetSumResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint,
        			 sumRequest);
        	sumTotal = sumResponse.getResponse();
		}
        divisionRequest.setFirstNumber(sumTotal);
        divisionRequest.setSecondNumber(listNumbers.size());
        GetDivisionResponse divisionResponse = (GetDivisionResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint,
        		divisionRequest);
        return divisionResponse.getResponse();
    }
    
    
    public double getTriangle(Double firstNumber, Double SecondNumber) {
    	GetMultiplicationRequest multRequest = new GetMultiplicationRequest();
        GetDivisionRequest divisionRequest = new GetDivisionRequest();
        multRequest.setFirstNumber(firstNumber);
        multRequest.setSecondNumber(SecondNumber);
        GetMultiplicationResponse multResponse = (GetMultiplicationResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint,
        			multRequest);     
        divisionRequest.setFirstNumber(multResponse.getResponse());
        divisionRequest.setSecondNumber(2);
        GetDivisionResponse divisionResponse = (GetDivisionResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint,
        		divisionRequest);
        return divisionResponse.getResponse();
    }
    
    public double getCircle(Double firstNumber) {
    	GetMultiplicationRequest multRequest = new GetMultiplicationRequest();
        multRequest.setFirstNumber(firstNumber);
        multRequest.setSecondNumber(firstNumber);
        GetMultiplicationResponse multResponse = (GetMultiplicationResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint,
        			multRequest);     
        multRequest.setFirstNumber(Math.PI);
        multRequest.setSecondNumber(multResponse.getResponse());
        multResponse = (GetMultiplicationResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint,
    			multRequest);     
        return multResponse.getResponse();
    }

}
