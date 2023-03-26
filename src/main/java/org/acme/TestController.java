package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RestClient;

//import javax.inject.Inject;
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;

@Path(value = "testController")
public class TestController {

    @Inject
    @RestClient
    MyRemoteService myRemoteService;

    @GET
    @Path("/hello")
    public String hello() {
        return "hello";
    }

    @GET
    @Path("/restClient")
    public String helloRestClient() {
        return myRemoteService.getExtensionsById("1").toString();
    }

}
