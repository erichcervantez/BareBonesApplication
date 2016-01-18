package com.eonjava.jaxws;

import com.eonjava.*;

import javax.jws.*;

/**
 * JAX-WS annotation for Web-Service Endpoint Implementation.
 */
@WebService(endpointInterface = "com.eonjava.WebServiceSoapEndpointInterface")
public class WebServiceSoapEndpointImpl implements WebServiceSoapEndpointInterface
{
    @WebMethod(operationName = "ReturnAJedi")
    public String returnAJedi()
    {
        return StarWarsApp.returnAJedi().toString();
    }
}
