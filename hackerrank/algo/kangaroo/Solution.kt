package com.hackerrank.algo.kangaroo

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

object Solution {
	// Complete the kangaroo function below.
	fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
	    if(v1 < v2) {
	        return "NO"
	    }
	    else {
	        var x1pos = x1
	        var x2pos = x2
	        while(x1pos < x2pos) {
	            x1pos += v1
	            x2pos += v2
	            if(x1pos == x2pos) return "YES"
	        }
	        return "NO"
	    }
	}
	
	@JvmStatic
	fun main(args: Array<String>) {
	    val scan = Scanner(System.`in`)
	
	    val x1V1X2V2 = scan.nextLine().split(" ")
	
	    val x1 = x1V1X2V2[0].trim().toInt()
	
	    val v1 = x1V1X2V2[1].trim().toInt()
	
	    val x2 = x1V1X2V2[2].trim().toInt()
	
	    val v2 = x1V1X2V2[3].trim().toInt()
	
	    val result = kangaroo(x1, v1, x2, v2)
	
	    println(result)
	}
}