package com.akursat.ws;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.xml.ws.Endpoint;

/**
 *
 * @author akursat
 */
public class WebServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/JaxWSDemo/user-service", new UserServiceImpl());
    }
}
