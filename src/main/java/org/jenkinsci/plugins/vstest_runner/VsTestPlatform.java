package org.jenkinsci.plugins.vstest_runner;

public enum VsTestPlatform {
    ARM("ARM"),
    X86("x86"),
    X64("x64");

    private final String name;


    VsTestPlatform(String s) {
        name = s;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
