package com.example.soapwebservice;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;



@Endpoint
public class OperationsEndpoint {
	private static final String NAMESPACE_URI = "test";


	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSumRequest")
	@ResponsePayload
	public GetSumResponse getSum(@RequestPayload GetSumRequest request) {
		GetSumResponse response = new GetSumResponse();
		response.setResponse(request.getFirstNumber() + request.getSecondNumber());
		
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDiferenceRequest")
	@ResponsePayload
	public GetDiferenceResponse getDiference(@RequestPayload GetDiferenceRequest request) {
		GetDiferenceResponse response = new GetDiferenceResponse();
		response.setResponse(request.getFirstNumber() - request.getSecondNumber());
		
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMultiplicationRequest")
	@ResponsePayload
	public GetMultiplicationResponse getMultiplication(@RequestPayload GetMultiplicationRequest request) {
		GetMultiplicationResponse response = new GetMultiplicationResponse();
		response.setResponse(request.getFirstNumber() * request.getSecondNumber());
		
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDivisionRequest")
	@ResponsePayload
	public GetDivisionResponse getDivision(@RequestPayload GetDivisionRequest request) {
		GetDivisionResponse response = new GetDivisionResponse();
		response.setResponse(request.getFirstNumber() / request.getSecondNumber());
		
		return response;
	}
}