import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class CheckPermutationTest {
    @Test
    fun testCheckPermutation() {
        assertEquals(true, checkPermutation("dog", "god"))
        assertEquals(true, checkPermutation("abcd", "bacd"))
        assertEquals(true, checkPermutation("3563476", "7334566"))
        assertEquals(true, checkPermutation("wef34f", "wffe34"))

        assertEquals(false, checkPermutation("dogx", "godz"))
        assertEquals(false, checkPermutation("abcd", "d2cba"))
        assertEquals(false, checkPermutation("2354", "1234"))
        assertEquals(false, checkPermutation("dcw4f", "dcw5f"))
        assertEquals(false, checkPermutation("DOG", "dog"))
        assertEquals(false, checkPermutation("dog ", "dog"))
        assertEquals(false, checkPermutation("aaab", "bbba"))
    }
}
