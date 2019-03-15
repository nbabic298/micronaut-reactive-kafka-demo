package hr.code.test.sigfox;

import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

import javax.inject.Singleton;

@Slf4j
@Singleton
@KafkaListener(groupId = "new-group", clientId = "new-client", redelivery = true, batch = true)
public class KafkaMessageReceiver {

    @Topic("tester")
    public Flux<String> receive(Flux<String> message) {
        return message.doOnNext(m -> log.info("Message received: {}", m));
    }

}
