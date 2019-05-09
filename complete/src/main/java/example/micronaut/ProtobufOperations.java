package example.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;
import io.micronaut.protobuf.codec.ProtobufferCodec;

public interface ProtobufOperations {

    @Post("licencia")
    @Consumes(ProtobufferCodec.PROTOBUFFER_ENCODED)
    String getLicense(@Body byte[] data);

    @Post("logs")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    String getLogLines(@Body String logs);

}
