package org.jenkinsci.plugins.vstest_runner;

public enum VsTestLogger {
    TRX("trx"),
    TFSPUBLISHER("tfspublisher");

    private final String name;


    VsTestLogger(String s) {
        name = s;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
