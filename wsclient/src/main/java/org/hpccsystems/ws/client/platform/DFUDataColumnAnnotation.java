package org.hpccsystems.ws.client.platform;

import java.util.List;

public class DFUDataColumnAnnotation {

    private final String name;
    private final List<String> parameters;

    public DFUDataColumnAnnotation(final String name, final List<String> parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    public String getName() {
        return name;
    }

    public List<String> getParameters() {
        return parameters;
    }
}
