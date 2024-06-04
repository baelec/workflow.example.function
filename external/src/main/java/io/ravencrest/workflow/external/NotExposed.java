package io.ravencrest.workflow.external;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
public class NotExposed {
    @Bean
    Supplier<String> expose() {
        return () -> "this shouldn't work";
    }
}
