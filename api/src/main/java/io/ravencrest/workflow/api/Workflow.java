package io.ravencrest.workflow.api;

public interface Workflow {
    Registration register();
    SchemaResult schema();
    ValidateResult validate(WorkflowSubmission submission);
    WorkflowResult task(Trigger trigger);
    WorkflowResult trigger(Trigger trigger);
}
