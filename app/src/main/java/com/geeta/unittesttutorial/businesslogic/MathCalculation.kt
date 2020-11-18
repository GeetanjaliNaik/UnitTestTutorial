package com.geeta.unittesttutorial.businesslogic

class MathCalculation {

    fun findMax(arr: IntArray): Int {
        var max = arr[0]
        for (i in 1 until arr.size) {
            if (max < arr[i]) max = arr[i]
        }
        return max
    }

   /* fun findMaxError(arr: IntArray): Int{
        var max=0
        for( item in arr)
        {
            if(max < item)
                max=item
        }
        return max;
    }*/
    fun cube(n: Int): Int {
        return n * n * n
    }

}