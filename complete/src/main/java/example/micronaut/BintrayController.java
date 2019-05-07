package example.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;
import io.reactivex.Maybe;

import java.util.List;

@Controller("/bintray") // <1>
public class BintrayController {

    private final BintrayLowLevelClient bintrayLowLevelClient;

    private final BintrayClient bintrayClient;

    private final ProtobufClient protobufClient;

    public BintrayController(BintrayLowLevelClient bintrayLowLevelClient, // <2>
                             BintrayClient bintrayClient,ProtobufClient protobufClient) {
        this.bintrayLowLevelClient = bintrayLowLevelClient;
        this.bintrayClient = bintrayClient;
        this.protobufClient = protobufClient;
    }

    @Get("miprueba")
    String prueba() {
        byte[] array = "Any String you want".getBytes();
        protobufClient.getLicense(array);
        return "";
    }

    @Get("/packages-lowlevel") // <3>
    Maybe<List<BintrayPackage>> packagesWithLowLevelClient() { // <4>
        return bintrayLowLevelClient.fetchPackages();
    }

    @Get(uri = "/packages", produces = MediaType.APPLICATION_JSON_STREAM)  // <5>
    Flowable<BintrayPackage> packages() { // <6>
        return bintrayClient.fetchPackages();
    }
}
