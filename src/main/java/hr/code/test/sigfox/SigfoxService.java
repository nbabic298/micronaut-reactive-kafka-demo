package hr.code.test.sigfox;

import reactor.core.publisher.Mono;

import javax.inject.Singleton;
import java.util.UUID;

@Singleton
public class SigfoxService {

    public Mono<String> testString() {
        return Mono.just(UUID.randomUUID().toString());
    }

}
