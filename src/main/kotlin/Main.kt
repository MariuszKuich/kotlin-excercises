package org.example

fun twoToOne(s1: String, s2: String): String {
//    return "$s1$s2".toCharArray().distinct().sorted().joinToString("")
    return "$s1$s2".toSortedSet().joinToString("")
}

fun findSmallestInt(nums: List<Int>): Int {
    return nums.min()
}

fun disemvowelTrolls(str: String): String {
    return str.filterNot { it.lowercase() in "aeiou" }
}

fun highestAndLowest(numbers: String): String {
    val numList = numbers.splitToSequence(" ").map { it.toInt() }.sorted().toList()
    return "${numList.last()} ${numList.first()}"
}

fun invertValues(arr: IntArray): IntArray {
    return arr.map { it * -1 }.toIntArray()
}

fun findMissingLetter(array: CharArray): Char {
//    generateSequence(array.first()) { it + 1 }.take(array.size + 1)
    return (array.first()..array.last()).first { it !in array }
}

fun convertStringToCamelCase(str: String): String {
    return str.splitToSequence("-", "_")
        .joinToString(separator = "", transform = { it.replaceFirstChar { c -> c.uppercase() } })
        .replaceFirstChar { str.first() }
}

fun filterList(l: List<Any>): List<Int> {
    return l.filterIsInstance<Int>()
}
