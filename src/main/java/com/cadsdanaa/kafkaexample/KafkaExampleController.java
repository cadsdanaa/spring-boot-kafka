package com.cadsdanaa.kafkaexample;

import com.cadsdanaa.kafkaexample.consumer.KafkaConsumer;
import com.cadsdanaa.kafkaexample.producer.KafkaProducer;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE, makeFinal = true)
public class KafkaExampleController {

    KafkaProducer kafkaProducer;

    @PostMapping("/kafka")
    public void produceAndConsume() {
        kafkaProducer.sendMessage("Hello World");
    }

}
