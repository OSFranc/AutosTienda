package com.ugb.couchdbtestcatalogo;


import java.util.Base64;

public class utilidades {
    static String urlConsulta = "http://192.168.0.15:5984/dbvhcls/_design/dbvhcls/_view/dbvhcls";
    static String urlMto = "http://192.168.0.15:5984/dbvhcls/";
    static String user = "admin";
    static String passwd = "admin";
    static String credencialesCodificadas = Base64.getEncoder().encodeToString((user +":"+ passwd).getBytes());
    public String generarIdUnico(){
        return java.util.UUID.randomUUID().toString();
    }
}