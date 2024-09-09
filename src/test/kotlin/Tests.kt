import org.example.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class Tests {

    @CsvSource(
        textBlock = """
        aretheyhere, yestheyarehere, aehrsty
        loopingisfunbutdangerous, lessdangerousthancoding, abcdefghilnoprstu
        inmanylanguages, theresapairoffunctions, acefghilmnoprstuy
        lordsofthefallen, gamekult, adefghklmnorstu
        codewars, codewars, acdeorsw
        agenerationmustconfrontthelooming, codewarrs, acdefghilmnorstuw"""
    )
    @ParameterizedTest
    fun twoToOneTest(s1: String, s2: String, result: String) {
        assertEquals(result, twoToOne(s1, s2))
    }

    @Test
    fun findSmallestIntTest() {
        assertEquals(-345, findSmallestInt(listOf(10, 20, 30, -345, -300)))
        assertEquals(10, findSmallestInt(listOf(10, 20, 30)))
        assertEquals(0, findSmallestInt(listOf(1, 2, 0, 4, 5)))
    }

    @CsvSource(
        textBlock = """
        This website is for losers LOL!, Ths wbst s fr lsrs LL!
        'No offense but,\nYour writing is among the worst I've ever read', 'N ffns bt,\nYr wrtng s mng th wrst 'v vr rd'
        'What are you, a communist?', 'Wht r y,  cmmnst?'"""
    )
    @ParameterizedTest
    fun disemvowelTrollsTest(str: String, result: String) {
        assertEquals(result, disemvowelTrolls(str))
    }

    @CsvSource(
        textBlock = """
        8 3 -5 42 -1 0 0 -9 4 7 4 -4, 42 -9
        1 2 3, 3 1"""
    )
    @ParameterizedTest
    fun highestAndLowestTest(str: String, result: String) {
        assertEquals(result, highestAndLowest(str))
    }

    @Test
    fun invertValuesTest() {
        assertArrayEquals(intArrayOf(-1, -2, -3, -4, -5), invertValues(intArrayOf(1, 2, 3, 4, 5)))
        assertArrayEquals(intArrayOf(-1, 2, -3, 4, -5), invertValues(intArrayOf(1, -2, 3, -4, 5)))
        assertArrayEquals(intArrayOf(), invertValues(intArrayOf()))
        assertArrayEquals(intArrayOf(0), invertValues(intArrayOf(0)))
    }

    @Test
    fun findMissingLetterTest() {
        assertEquals('e', findMissingLetter(charArrayOf('a', 'b', 'c', 'd', 'f')))
        assertEquals('P', findMissingLetter(charArrayOf('O', 'Q', 'R', 'S')))
    }

    @CsvSource(textBlock = """
        the_stealth_warrior, theStealthWarrior
        The-Stealth-Warrior, TheStealthWarrior
        '', ''""")
    @ParameterizedTest
    fun convertStringToCamelCaseTest(str: String, result: String) {
        assertEquals(result, convertStringToCamelCase(str))
    }

    @Test
    fun filterListTest() {
        assertEquals(listOf(1, 2), filterList(listOf(1, 2, 'a', 'b')))
        assertEquals(listOf(1, 0, 15), filterList(listOf(1, 'a', 'b', 0, 15)))
        assertEquals(listOf(1, 2, 123), filterList(listOf(1, 2, "aasf", '1', "123", 123)))
    }
}