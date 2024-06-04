module external {
    requires api;
    requires spring.core;
    requires spring.context;
    opens io.ravencrest.workflow.external to spring.core, spring.beans, spring.context;
    exports io.ravencrest.workflow.external;
}