package org.apache.openjpa.test;

import java.io.Serializable;
import java.util.Objects;

import static org.apache.openjpa.util.BAProxyManagerImplUtil.*;

public class AValidProxy implements Serializable {
    private String name;
    private String surname;
    private long age;

    public AValidProxy(){
        this.name = DEFAULT_NAME;
        this.surname = DEFAULT_SURNAME;
        this.age = DEFAULT_AGE;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(long age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        AValidProxy that = (AValidProxy) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}

