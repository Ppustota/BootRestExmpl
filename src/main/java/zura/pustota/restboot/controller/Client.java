package zura.pustota.restboot.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import zura.pustota.restboot.entity.Account;

import java.util.List;

@Service
public class Client {
    private final WebClient webClient;

    public Client(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8080").build();
    }

    public Mono<List<Account>> restCall(){
        return  this.webClient.get().uri("/accounts").retrieve().bodyToFlux(Account.class).collectList();
    }
}
