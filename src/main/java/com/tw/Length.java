package com.tw;

import java.util.Objects;

public class Length {
    private final int length;

    Length(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length1 = (Length) o;
        return length == length1.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }
}
