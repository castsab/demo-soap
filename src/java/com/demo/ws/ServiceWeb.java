/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author castsab
 */
@WebService(serviceName = "ServiceWeb")
public class ServiceWeb {

    /**
     * This is a sample web service operation
     * @param a
     * @param b
     * @return 
     */
    @WebMethod(operationName = "suma")
    public double suma(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return (a + b);
    }
}
