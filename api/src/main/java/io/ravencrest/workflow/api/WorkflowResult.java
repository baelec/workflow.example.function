package io.ravencrest.workflow.api;

public sealed interface WorkflowResult permits AskResult, EndResult { }
