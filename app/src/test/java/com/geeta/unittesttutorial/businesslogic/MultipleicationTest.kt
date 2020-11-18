package com.geeta.unittesttutorial.businesslogic

import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class MultipleicationTest(val m1: Int, val m2: Int,val result:Int){

    @Test
    fun testMultiplyException() {
        val tester = Multipleication()
        assertEquals("Result", result, tester.multiply(m1, m2))
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data() : Collection<Array<Any>> {
            return listOf(
                arrayOf<Any>(1, 2, 2), arrayOf<Any>(5, 3, 15), arrayOf<Any>(121, 4, 484)
            )
        }
    }
}