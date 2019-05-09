package example.micronaut;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
public class HelloControllerTest {

    @Inject
    HelloClient helloClient;

    @Test
    void testHello() {
        assertEquals(
                "Hello Fred!",
                helloClient.hello("Fred").blockingGet());
    }

    @Test
    void testLogs() {
        helloClient.logs("[\"lineuno\",\"linedos\"]");
        /*helloClient.logs("{ \"datos\" : [\"lineuno\",\"linedos\"] }");*/
    }
}
