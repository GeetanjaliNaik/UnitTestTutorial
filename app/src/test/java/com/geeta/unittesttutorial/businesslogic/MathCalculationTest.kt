package com.geeta.unittesttutorial.businesslogic

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MathCalculationTest{
    var methCalculation:MathCalculation?=null
    @Before
    fun setUp()
    {
        methCalculation= MathCalculation()
    }

    @Test
    fun testFindMax() {
        println("test case find max")

        assertEquals(4, methCalculation?.findMax(intArrayOf(1, 3, 4, 2)))
        assertEquals(-2, methCalculation?.findMax(intArrayOf(-12, -3, -4, -2)))
    }

   /* @Test
    fun testFindMaxError() {
        println("test case find max")

        assertEquals(4, methCalculation?.findMaxError(intArrayOf(1, 3, 4, 2)))
        assertEquals(-2, methCalculation?.findMaxError(intArrayOf(-12, -3, -4, -2)))
    }*/
    @Test
    fun testCube() {
        println("test case cube")
        assertEquals(27, methCalculation?.cube(3))
    }
    @After
    fun cleanUp()
    {
        methCalculation=null
    }
}