package com.tw;

import org.junit.jupiter.api.Test;

import static com.tw.Weight.gram;
import static com.tw.Weight.kilogram;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class WeightTest {

    @Test
    void shouldCheckEqualityWhenOneGramIsComparedWithAnotherOneGram() {
        Weight oneGram = gram(1);
        Weight anotherOneGram = gram(1);

        assertThat(oneGram, is(equalTo(anotherOneGram)));
    }

    @Test
    void shouldCheckEqualityWhenZeroPointOneKilogramIsComparedWithHundredGram() {
        Weight zeroPointOneKilogram = kilogram(0.1);
        Weight hundredGram = gram(100);

        assertThat(zeroPointOneKilogram, is(equalTo(hundredGram)));
    }


    @Test
    void shouldCheckEqualityWhenTenGramIsAddedToOneKilogramAndComparedToOneThousandTenGram() {
        Weight tenGram = gram(10);
        Weight oneKilogram = kilogram(1);
        Weight oneThousandTen = gram(1010);

        assertThat(tenGram.plus(oneKilogram), is(equalTo(oneThousandTen)));
    }

    @Test
    void shouldCheckEqualityWhenFiveHundredGramIsSubtractedFromOnePointFiveKilogramAndComparedToOneKilogram() {
        Weight onePointFiveKilogram = kilogram(1.5);
        Weight fiveHundredGram = gram(500);
        Weight oneKilogram = kilogram(1);

        assertThat(onePointFiveKilogram.minus(fiveHundredGram), is(equalTo(oneKilogram)));
    }

}


