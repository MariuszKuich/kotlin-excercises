//https://alfonso-software.medium.com/kotlin-collections-challenges-part-i-b1269d75edb
package org.example

val altitudes = listOf(
    800, 805, 804, 800, 803, 806, 809, 805, 800, 798, 796, 799,
    803, 805, 808, 812, 815, 816, 819, 822, 826, 830, 832, 835, 837
)

fun main() {
    altitudes.asSequence()
        .zipWithNext { a, b -> b - a }
        .sumOf { if (it > 0) it else 0 }
        .apply { println("Cumulative elevation gain: $this m") }
}