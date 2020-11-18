package com.geeta.unittesttutorial.businesslogic

import com.geeta.unittesttutorial.data.UserDetail
import org.junit.*
import org.junit.Assert.assertEquals


class UserDetailBLTest{

    lateinit var userDetail:UserDetail
    lateinit var userDetailBL: UserDetailBL

    @Before
    fun init()
    {
        userDetail= UserDetail("Kishor", 30, 10000.00)
        userDetailBL= UserDetailBL()
    }
    @Test
    fun testCalculateYearlySalary()
    {
        val salary=userDetailBL.calculateYearlySalary(userDetail)

        assertEquals(120000.00, salary, 0.0)
    }
    @Test
    fun `Calculate Appraisal for equal to 10000`()
    {
        val appraisal=userDetailBL.calculateAppraisal(userDetail)
        assertEquals(1000.0, appraisal, 0.0)

    }
    @Test
    fun `Calculate Appraisal for less then 10000`()
    {
        userDetail.salary=8000.00
        val appraisal=userDetailBL.calculateAppraisal(userDetail)
        assertEquals(500.0, appraisal, 0.0)

    }
    @After
    fun clear()
    {
        println("clean after")

    }

}