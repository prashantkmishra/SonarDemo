package com.sonardemo.data;


import java.util.Objects;

public class Car {
    private String mName;
    private String mManufacturer;

    public Car(String name, String author) {
        mName = name;
        mManufacturer = author;
    }

    public String getName() {
        return mName;
    }

    public String getManufacturer() {
        return mManufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(mName, car.mName) &&
                Objects.equals(mManufacturer, car.mManufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mName, mManufacturer);
    }

}