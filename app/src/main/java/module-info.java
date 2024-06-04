module app {
    requires api;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.core;
    requires spring.web;
    requires spring.beans;
    requires jdk.unsupported;

    opens io.ravencrest.workflow.app to spring.core, spring.beans, spring.context;
    opens io.ravencrest.workflow.app.function to spring.beans, spring.context, spring.core;
}