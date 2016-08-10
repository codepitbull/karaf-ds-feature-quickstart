package de.codepitbull.karaf.testbundle;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component(name="HelloWorldRest",
            service = HelloWorldRest.class,
            property = {"service.exported.interfaces=*",
                          "service.exported.configs=org.apache.cxf.rs",
                          "org.apache.cxf.rs.address=/rester"})
@Produces(MediaType.TEXT_PLAIN)
public class HelloWorldRest {
    @GET
    @Path("/")
    public String getHello() {
        return "hello world";
    }

    @Activate
    void activate() {
        System.out.println("Activating V1");
    }
}
