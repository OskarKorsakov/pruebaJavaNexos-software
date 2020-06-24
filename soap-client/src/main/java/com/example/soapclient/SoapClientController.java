package com.example.soapclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/operations")
public class SoapClientController {

    @Autowired
    private SoapClient soapClient;

    @RequestMapping(value = "/sum", method = RequestMethod.POST)
    public Double sum(@RequestBody TestEntity testEntity) {
        return soapClient.getSum(testEntity.getFirstNumber(), testEntity.getSecondNumber());
    }

    @RequestMapping(value = "/diference", method = RequestMethod.POST)
    public Double diference(@RequestBody TestEntity testEntity) {
        return soapClient.getDiference(testEntity.getFirstNumber(), testEntity.getSecondNumber());
    }
    
    @RequestMapping(value = "/multiplication", method = RequestMethod.POST)
    public Double multiplication(@RequestBody TestEntity testEntity) {
        return soapClient.getMultiplication(testEntity.getFirstNumber(), testEntity.getSecondNumber());
    }
    
    @RequestMapping(value = "/division", method = RequestMethod.POST)
    public Double division(@RequestBody TestEntity testEntity) {
        return soapClient.getDivision(testEntity.getFirstNumber(), testEntity.getSecondNumber());
    }
    
    @RequestMapping(value = "/slope", method = RequestMethod.POST)
    public Double slope(@RequestBody TestEntity testEntity) {
        return soapClient.getDivision(testEntity.getFirstNumber(), testEntity.getSecondNumber());
    }
    
    @RequestMapping(value = "/average", method = RequestMethod.POST)
    public Double average(@RequestBody TestEntity testEntity) {
        return soapClient.getAverage(testEntity.getListNumbers());
    }
    
    @RequestMapping(value = "/areatriangle", method = RequestMethod.POST)
    public Double triangle(@RequestBody TestEntity testEntity) {
        return soapClient.getTriangle(testEntity.getFirstNumber(), testEntity.getSecondNumber());
    }
    
    @RequestMapping(value = "/areacircle", method = RequestMethod.POST)
    public Double circle(@RequestBody TestEntity testEntity) {
        return soapClient.getCircle(testEntity.getFirstNumber());
    }
}
