package com.hackerrank.sort.insert1

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
	// Complete the insertionSort1 function below.
	fun insertionSort1(n: Int, arr: Array<Int>): Unit {
	    for(i in 0..arr.size-1) {
	        var temp = arr[i]
	        var idx = i-1
	        var isSwaped = false
	        while(idx >= 0 && arr[idx] > temp) {
	            arr[idx+1] = arr[idx]
	            idx--
	            println(arr.joinToString(" "))
	            isSwaped = true
	        }
	        if(isSwaped) {
	            arr[idx+1] = temp
	            println(arr.joinToString(" "))
	        }
	    }
	}
	
	@JvmStatic
	fun main(args: Array<String>) {
	    val scan = Scanner(System.`in`)
	
	    val n = scan.nextLine().trim().toInt()
	
	    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
	
	    insertionSort1(n, arr)
	}
}