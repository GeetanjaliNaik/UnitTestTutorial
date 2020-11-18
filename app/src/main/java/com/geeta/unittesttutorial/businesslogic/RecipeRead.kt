package com.geeta.unittesttutorial.businesslogic

import com.geeta.unittesttutorial.data.Recipe
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader

class RecipeRead {
        private val ID_PREFIX = "id="
        private val TITLE_PREFIX = "title="
        fun readFromStream(stream: InputStream?): Recipe? {
            var id: String? = null
            var title: String? = null
            val descBuilder = StringBuilder()
            val reader = BufferedReader(InputStreamReader(stream))
            try {
                var line = reader.readLine()
                while (line != null) {
                    if (line.startsWith(ID_PREFIX)) {
                        id = line.substring(ID_PREFIX.length)
                        line = reader.readLine()
                        continue
                    }
                    if (line.startsWith(TITLE_PREFIX)) {
                        title = line.substring(TITLE_PREFIX.length)
                        line = reader.readLine()
                        continue
                    }
                    if (descBuilder.length > 0) {
                        descBuilder.append("\n")
                    }
                    descBuilder.append(line)
                    line = reader.readLine()
                }
            } catch (e: IOException) {
                return null
            }
            return Recipe(id, title, descBuilder.toString())
        }

}