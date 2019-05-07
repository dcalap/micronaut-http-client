package example.micronaut;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Post;
import io.micronaut.protobuf.codec.ProtobufferCodec;

public interface ProtobufOperations {

    @Post
    @Consumes(ProtobufferCodec.PROTOBUFFER_ENCODED)
    String getLicense(@Body byte[] data);

}
