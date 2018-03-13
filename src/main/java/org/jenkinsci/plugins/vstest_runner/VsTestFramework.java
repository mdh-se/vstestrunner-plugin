package org.jenkinsci.plugins.vstest_runner;

public enum VsTestFramework {
    FRAMEWORK_35("framework35"),
    FRAMEWORK_40("framework40"),
    FRAMEWORK_45("framework45");

    private final String name;

    VsTestFramework(String s) {
        name = s;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
