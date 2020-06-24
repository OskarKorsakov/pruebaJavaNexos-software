//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.24 a las 07:43:12 AM COT 
//


package com.example.soapwebservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.spring.guides.gs_producing_web_service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.spring.guides.gs_producing_web_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSumRequest }
     * 
     */
    public GetSumRequest createGetSumRequest() {
        return new GetSumRequest();
    }

    /**
     * Create an instance of {@link GetSumResponse }
     * 
     */
    public GetSumResponse createGetSumResponse() {
        return new GetSumResponse();
    }
    
    /**
     * Create an instance of {@link GetDiferenceRequest }
     * 
     */
    public GetDiferenceRequest createGetDiferenceRequest() {
        return new GetDiferenceRequest();
    }

    /**
     * Create an instance of {@link GetDiferenceResponse }
     * 
     */
    public GetDiferenceResponse createGetDiferenceResponse() {
        return new GetDiferenceResponse();
    }
    
    
    /**
     * Create an instance of {@link GetMultiplicationRequest }
     * 
     */
    public GetMultiplicationRequest createGetMultiplicationRequest() {
        return new GetMultiplicationRequest();
    }

    /**
     * Create an instance of {@link GetMultiplicationResponse }
     * 
     */
    public GetMultiplicationResponse createGetMultiplicationResponse() {
        return new GetMultiplicationResponse();
    }
    
    
    /**
     * Create an instance of {@link GetDivisionRequest }
     * 
     */
    public GetDivisionRequest createGetDivisionRequest() {
        return new GetDivisionRequest();
    }

    /**
     * Create an instance of {@link GetDivisionResponse }
     * 
     */
    public GetDivisionResponse createGetDivisionResponse() {
        return new GetDivisionResponse();
    }

}
