//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.24 a las 07:43:12 AM COT 
//


package com.example.soapclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SecondNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "firstNumber",
    "secondNumber"
})
@XmlRootElement(name = "getSumRequest")
public class GetSumRequest {

    protected double firstNumber;
    @XmlElement(name = "SecondNumber")
    protected double secondNumber;

    /**
     * Obtiene el valor de la propiedad firstNumber.
     * 
     */
    public double getFirstNumber() {
        return firstNumber;
    }

    /**
     * Define el valor de la propiedad firstNumber.
     * 
     */
    public void setFirstNumber(double value) {
        this.firstNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad secondNumber.
     * 
     */
    public double getSecondNumber() {
        return secondNumber;
    }

    /**
     * Define el valor de la propiedad secondNumber.
     * 
     */
    public void setSecondNumber(double value) {
        this.secondNumber = value;
    }

}
