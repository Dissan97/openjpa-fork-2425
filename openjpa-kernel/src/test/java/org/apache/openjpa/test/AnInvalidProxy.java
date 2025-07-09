package org.apache.openjpa.test;

public final class AnInvalidProxy {
    private boolean isFinal;
    public AnInvalidProxy() {
        this.isFinal = true;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }
}
