package example.micronaut;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
public class ProtobufTest {

    @Inject
    ProtobufClient protobufClient;

    @Test
    public void testProto() {
        String res = protobufClient.getLicense("prueba".getBytes());
        System.out.println(res);
    }

}
