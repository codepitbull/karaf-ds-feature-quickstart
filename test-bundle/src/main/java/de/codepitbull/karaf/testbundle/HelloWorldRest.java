package de.codepitbull.karaf.testbundle;

import org.apache.felix.scr.annotations.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component(name="HelloWorldRest", immediate = true)
@Service(HelloWorldRest.class)
@Properties({
        @Property(name = "service.exported.interfaces", value = "*"),
        @Property(name = "service.exported.configs", value = "org.apache.cxf.rs"),
        @Property(name = "org.apache.cxf.rs.address", value = "/rester")
})
@Produces(MediaType.TEXT_PLAIN)
@Path("")
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
