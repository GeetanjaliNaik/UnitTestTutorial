package com.geeta.unittesttutorial.businesslogic

import com.geeta.unittesttutorial.data.Recipe
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.mock
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader


class RecipeReadTest {
    var recipeRead:RecipeRead?=null
    @Before
    fun setUp()
    {
        recipeRead= RecipeRead()
    }
    @Test
    fun water()
    {
        val stream: InputStream? = RecipeReadTest::class.java.getResourceAsStream("/recipes/water.txt")
        val recipe: Recipe? = stream?.let { recipeRead?.readFromStream(stream) }
        assertNotNull(recipe)
        recipe?.let {
            assertEquals("water", recipe.id)
            assertEquals("Water", recipe.title)
            assertEquals("Put glass under tap. Open tap. Close tap. Drink.", recipe.description)
        }

    }
    @Test
    fun mixed() {
        val stream: InputStream? = RecipeReadTest::class.java.getResourceAsStream("/recipes/mixed.txt")
        val recipe: Recipe? = stream?.let { recipeRead?.readFromStream(stream) }
        assertNotNull(recipe)
        recipe?.let {
            assertEquals("punch", recipe.id)
            assertEquals("Punch", recipe.title)
            assertEquals(
                    """
                        Juice of 3 lemons
                        1 orange
                        1 pint grape juice
                        1 cup sugar
                        1 cup water
                        1 pine apple juice
                        Mix all together and strain. Add large piece of ice.
                        """.trimIndent(), recipe.description)
        }
    }

  @Test(expected = NullPointerException::class)
    fun testRecipeRead() {
        println("Inside testPrintMessage()")
        val stream: InputStream = RecipeReadTest::class.java.getResourceAsStream("/recipes/test.txt")
        val recipe: Recipe= recipeRead?.readFromStream(stream)!!
    }
  /*  @Test(expected = IOException::class)
    fun `throw IOException`()
    {
        val stream: InputStream? = mock(InputStream::class.java)
        val reader = BufferedReader(InputStreamReader(stream))
        Mockito.`when`(reader.readLine()).thenThrow(IOException())
        val recipe: Recipe? = recipeRead?.readFromStream(stream)

    }*/
    @After
    fun clean()
    {
        recipeRead=null
    }

}