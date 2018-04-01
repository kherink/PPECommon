package com.viator.ppecommon.changetravellername

import org.junit.Test

class TravellerTest {

    @Test
    fun test_ToString() {
        val t = Traveller("bob")
        assert(t.name.equals("bob"))
    }

    @Test
    fun test_GetName() {
    }
}