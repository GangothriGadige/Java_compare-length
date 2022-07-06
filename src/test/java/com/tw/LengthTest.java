package com.tw;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.IsNot.not;

public class LengthTest {

    @Test
    public void shouldCheckEqualityWhenOneCentimeterIsComparedWithAnotherOneCentimeter(){
        Length oneCentimeter = new Length(1);
        Length anotherOneCentimeter = new Length(1);

        assertThat(oneCentimeter,equalTo(anotherOneCentimeter));
    }

    @Test
    public void shouldCheckEqualityWhenTwoCentimeterIsComparedWithOneCentimeter(){
        Length twoCentimeter = new Length(2);
        Length oneCentimeter = new Length(1);

        assertThat(twoCentimeter, not(equalTo(oneCentimeter)));
    }
}
