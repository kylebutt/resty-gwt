package org.fusesource.restygwt.client.basic;

import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import javax.ws.rs.GET;

/**
 *
 * Supersimple example service for testing...
 *
 *
 * @author <a href="mailto:mail@raphaelbauer.com">rEyez</<a>
 *
 */
public interface ExampleService extends RestService {

    @GET
    public void getExampleDto(MethodCallback<ExampleDto> callback);
}
