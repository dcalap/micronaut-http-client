package example.micronaut;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.protobuf.codec.ProtobufferCodec;

@Controller("/proto")
public class ProtobufController implements ProtobufOperations{

//    private final ProtobufClient protobufClient;

//    public ProtobufController(ProtobufClient protobufClient) {
//        this.protobufClient = protobufClient;
//    }

    @Override
    public String getLicense(@Body byte[] data) {
        System.out.println(data);
        return data.toString();
    }


//    @Post("/receivedata")
//    @Consumes(ProtobufferCodec.PROTOBUFFER_ENCODED)
//    @Produces(MediaType.TEXT_PLAIN)
//    public HttpResponse deserializeLicense(byte[] data) {
//        System.out.println(data);
//        String myBody = data + "TEXTO ADDED";
//        if (true) {
//            return null;
//        }
//        return HttpResponse.ok(myBody);
//    }
//
//    @Post(value = "/receive-bytes", consumes = MediaType.MULTIPART_FORM_DATA)
//    public String receiveBytes(byte[] data) {
//
//        System.out.println("LENGHT: " + data.length);
//
//        System.out.println(protobufClient.getLicense(data));
//        String myBody = data + "TEXTO ADDED";
//        return myBody;
//
//    }


//    @Post("/pruebas")
////    @Consumes("application/x-protobuf")
//    @Consumes(MediaType.MULTIPART_FORM_DATA)
//    public String pruebas (@Body MultipartBody body) {
//
//
//        System.out.println(protobufClient.getLicense(body));
//        String myBody = body + "TEXTO ADDED";
//        return  myBody;
//    }



}
