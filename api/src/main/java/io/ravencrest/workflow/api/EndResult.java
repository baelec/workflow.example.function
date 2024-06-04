package io.ravencrest.workflow.api;

public record EndResult(
        EndState state
) implements WorkflowResult {
}
