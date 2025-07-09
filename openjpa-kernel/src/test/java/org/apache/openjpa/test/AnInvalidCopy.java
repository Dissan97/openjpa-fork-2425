package org.apache.openjpa.test;


/**
 * From documentation: The proxy must have one argument Constructor with parameter or without parameter
 */

public class AnInvalidCopy {

    private String invalid;
    private int anotherInvalid;

    public AnInvalidCopy(String invalid, int anotherInvalid) {
        this.invalid = invalid;
        this.anotherInvalid = anotherInvalid;
    }

    public String getInvalid() {
        return invalid;
    }

    public int getAnotherInvalid() {
        return anotherInvalid;
    }

    public void setInvalid(String invalid) {
        this.invalid = invalid;
    }

    public void setAnotherInvalid(int anotherInvalid) {
        this.anotherInvalid = anotherInvalid;
    }


}
