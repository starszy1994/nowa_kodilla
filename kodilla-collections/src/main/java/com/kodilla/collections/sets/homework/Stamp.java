package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampWindth;
    private double stampLength;
    private boolean isMarked;

    public Stamp (String stampName, double stampWindth, double stampLength, boolean isMarked) {
        this.stampName = stampName;
        this.stampWindth = stampWindth;
        this.stampLength = stampLength;
        this.isMarked = isMarked;
    }
    public String getStampName() {
        return stampName;
    }
    public double getStampWindth() {
        return stampWindth;
    }
    public double getStampLength() {
        return stampLength;
    }
    public boolean getIsMarked() {
        return isMarked;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return stampWindth == stamp.stampWindth && stampLength == stamp.stampLength && isMarked == stamp.isMarked && Objects.equals(stampName, stamp.stampName);
    }
    @Override
    public String toString() {
        return "Stamp{" + "stampName='" + stampName + '\'' + ", stampWidth=" + stampWindth + ", stampLength=" + stampLength + ", isMarked=" + isMarked + '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampWindth, stampLength, isMarked);
    }
}