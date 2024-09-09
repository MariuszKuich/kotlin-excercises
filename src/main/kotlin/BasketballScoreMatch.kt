//https://alfonso-software.medium.com/kotlin-collections-challenges-part-i-b1269d75edb
package org.example

enum class Team {
    YELLOW, BLUE
}

data class PlayerGame(
    val player: String,
    val team: Team,
    val points: Int
)

val match = listOf(
    PlayerGame("13", Team.YELLOW, 12),
    PlayerGame("7", Team.YELLOW, 7),
    PlayerGame("3", Team.YELLOW, 20),
    PlayerGame("22", Team.YELLOW, 16),
    PlayerGame("33", Team.YELLOW, 4),
    PlayerGame("45", Team.YELLOW, 26),
    PlayerGame("8", Team.BLUE, 17),
    PlayerGame("3", Team.BLUE, 15),
    PlayerGame("21", Team.BLUE, 16),
    PlayerGame("30", Team.BLUE, 12),
    PlayerGame("45", Team.BLUE, 24)
)

fun main() {
    match.groupingBy { it.team }
        .fold(0) { sum, player -> sum + player.points }
        .apply { println(this) }
}