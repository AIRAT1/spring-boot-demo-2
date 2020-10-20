package de;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DumbPasswordEncoderTest {

    @Test
    void encode() {
        DumbPasswordEncoder encoder = new DumbPasswordEncoder();
        Assert.assertEquals("secret: qwerty", encoder.encode("qwerty"));
        Assert.assertThat(encoder.encode("qwerty"), Matchers.containsString("qwerty"));
    }
}