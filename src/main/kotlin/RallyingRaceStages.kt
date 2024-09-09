//https://alfonso-software.medium.com/kotlin-collections-challenges-part-i-b1269d75edb
package org.example

data class Measure (
    val number : Int,
    val secondsAcc : Int,
    val metersAcc : Int
)

val measures = mutableListOf (
    Measure(0, 0, 0),
    Measure(1, 302, 8090),
    Measure(2, 689, 17655),
    Measure(3, 1204, 32655),
    Measure(4, 1425, 39884)
)

fun main() {
    measures.asSequence()
        .zipWithNext { m1, m2 ->
            Measure(m1.number + 1, m2.secondsAcc - m1.secondsAcc, m2.metersAcc - m1.metersAcc) }
        .maxBy { it.metersAcc / it.secondsAcc }
        .also { println("Fastest stage: ${it.number}") }
}

