/*
 * Copyright 2017 original authors
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package example.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.reactivex.Single;

import javax.validation.constraints.NotBlank;

/**
 * @author Graeme Rocher
 * @since 1.0
 */
@Controller("/")
public class HelloController {

    @Get(uri = "/hello/{name}", produces = MediaType.TEXT_PLAIN)
    public Single<String> hello(@NotBlank String name) {
        return Single.just("Hello " + name + "!");
    }

    @Post(uri = "/logs", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
    public String logs(@Body String[] lineas) {
        System.out.println(lineas);
        return "[\"linea1\",\"linea2\"]";
    }

}
