package io.ravencrest.workflow.external;

import io.ravencrest.workflow.api.*;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ExampleWorkflow implements Workflow {
    private final Registration registration = new Registration(
            UUID.randomUUID().toString(),
            "Example",
            "This isn't the greatest workflow in the world. This is just an example."
    );

    @Override
    public Registration register() {
        return registration;
    }

    @Override
    public SchemaResult schema() {
        return new SchemaResult("test");
    }

    @Override
    public ValidateResult validate(WorkflowSubmission submission) {
        return new ValidateResult();
    }

    @Override
    public WorkflowResult task(Trigger trigger) {
        return new AskResult("Why hasn't Groovy been thrown into the sun?");
    }

    @Override
    public WorkflowResult trigger(Trigger trigger) {
        return new EndResult(EndState.SUCCESS);
    }
}
