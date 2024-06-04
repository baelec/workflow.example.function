package io.ravencrest.workflow.app.function;

import io.ravencrest.workflow.api.Workflow;
import io.ravencrest.workflow.api.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Function;
import java.util.function.Supplier;

@Component
public class Functions {
    final Workflow workflow;

    public Functions(Workflow workflow) {
        this.workflow = workflow;
    }

    @Bean
    public Supplier<Registration> register() {
        return workflow::register;
    }

    @Bean
    public Supplier<SchemaResult> schema() {
        return workflow::schema;
    }

    @Bean
    public Function<WorkflowSubmission, ValidateResult> validate() {
        return workflow::validate;
    }

    @Bean
    public Function<Trigger, WorkflowResult> task() {
        return workflow::task;
    }

    @Bean
    public Function<Trigger, WorkflowResult> trigger() {
        return workflow::trigger;
    }
}
