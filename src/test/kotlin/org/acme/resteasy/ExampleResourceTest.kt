package org.acme.resteasy

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test
import java.net.InetAddress

@QuarkusTest
class ExampleResourceTest {

    @Test
    fun testHelloEndpoint() {
        given()
          .`when`().get("/resteasy/hello")
          .then()
             .statusCode(200)
             .body(`is`(InetAddress.getLocalHost().hostName))
    }

}