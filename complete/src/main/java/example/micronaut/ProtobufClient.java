package example.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.protobuf.codec.ProtobufferCodec;

@Client("/proto") // <1>
public interface ProtobufClient extends ProtobufOperations {

    @Override
    @Produces(ProtobufferCodec.PROTOBUFFER_ENCODED)
    String getLicense(@Body byte[] data);
}