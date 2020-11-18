package com.geeta.unittesttutorial.data

import org.junit.Assert.*
import org.junit.Test

class RecipeTest{
    @Test
    fun `set recipe and check`()
    {
        val recipe= Recipe("water","water","put water")

        assertNotNull(recipe)
        assertEquals(recipe.id,"water")
        assertEquals(recipe.title,"water")
        assertEquals(recipe.description,"put water")
    }
}