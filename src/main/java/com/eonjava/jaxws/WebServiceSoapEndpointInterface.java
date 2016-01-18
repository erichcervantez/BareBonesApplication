package com.eonjava.jaxws;

import javax.jws.*;

/**
 * JAX-WS annotation
 */
@WebService
public interface WebServiceSoapEndpointInterface
{
    @WebMethod
    String returnAJedi();
}
