package com.geeta.unittesttutorial.data

import org.junit.Assert.*
import org.junit.Test

class UserDetailTest{
    @Test
    fun `set userdatil and check`()
    {
        val userDetail= UserDetail("Kishor",30,10000.00)

        assertNotNull(userDetail)
        assertEquals(userDetail.name,"Kishor")
        assertEquals(userDetail.age,30)
        assertEquals(userDetail.salary,10000.00,0.0)
    }

}