package hr.code.test.sigfox;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Controller("/sigfox")
public class SigfoxCallbackController {

    private final SigfoxService sigfoxService;

    @Get("/test")
    public Mono getTest() {
        return sigfoxService.testString();
    }

}
