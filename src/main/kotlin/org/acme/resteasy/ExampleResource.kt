package org.acme.resteasy

import java.net.InetAddress
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/resteasy/hello")
class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(): String = InetAddress.getLoopbackAddress().hostName;
}