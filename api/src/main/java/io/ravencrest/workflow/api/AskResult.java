package io.ravencrest.workflow.api;

public record AskResult(
        String question
) implements WorkflowResult { }
