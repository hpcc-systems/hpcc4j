package org.hpccsystems.ws.client.platform;

import org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ClusterQueryState;

public class ClusterInfo {

    String name;
    String errors;
    boolean mixedNodeStates;
    String state;

    public ClusterInfo() {
        
    }
    public ClusterInfo(ClusterQueryState raw) {
        this.name=raw.getCluster();
        this.state=raw.getState();
        this.errors=raw.getErrors();
        this.mixedNodeStates=raw.getMixedNodeStates();
    }

    public String getCluster() {
        return name;
    }

    public void setCluster(String name) {
        this.name = name;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }

    public boolean isMixedNodeStates() {
        return mixedNodeStates;
    }

    public void setMixedNodeStates(boolean mixedNodeStates) {
        this.mixedNodeStates = mixedNodeStates;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return "ClusterInfo [name=" + name + ", errors=" + errors + ", mixedNodeStates=" + mixedNodeStates + ", state="
                + state + "]";
    }
    
}
