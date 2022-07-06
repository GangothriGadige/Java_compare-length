package com.tw;

import org.junit.jupiter.api.Test;

import static com.tw.Length.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class LengthTest {

    @Test
    public void shouldCheckEqualityWhenOneCentimeterIsComparedWithAnotherOneCentimeter() {
        Length oneCentimeter = centimeter(1);
        Length anotherOneCentimeter = centimeter(1);

        assertThat(oneCentimeter, is(equalTo(anotherOneCentimeter)));
    }

    @Test
    public void shouldCheckInequalityWhenOneCentimeterIsComparedWithTwoCentimeters() {
        Length oneCentimeter = centimeter(1);
        Length twoCentimeters = centimeter(2);

        assertThat(oneCentimeter, is(not(equalTo(twoCentimeters))));
    }

    @Test
    public void shouldCheckEqualityWhenOneMeterIsComparedWithHundredCentimeter() {
        Length oneMeter = meter(1);
        Length hundredCentimeter = centimeter(100);

        assertThat(oneMeter, is(equalTo(hundredCentimeter)));
    }

    @Test
    public void shouldCheckEqualityWhenHundredCentimeterIsComparedWithPointZeroZeroOneKilometer() {
        Length hundredCentimeter = centimeter(100);
        Length pointZeroZeroOneKilometer = kilometer(0.001);

        assertThat(hundredCentimeter, is(equalTo(pointZeroZeroOneKilometer)));
    }


}



