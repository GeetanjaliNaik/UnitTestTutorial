package com.geeta.unittesttutorial.businesslogic

import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(value = Suite::class)
@Suite.SuiteClasses(RecipeReadTest::class,UserDetailBLTest::class)
class RunAllTest