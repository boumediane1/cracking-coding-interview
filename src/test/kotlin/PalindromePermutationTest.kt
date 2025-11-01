import kotlin.test.Test
import kotlin.test.assertEquals

class PalindromePermutation {
    @Test
    fun testPalindromePermutation() {
        assertEquals(true, palindromePermutation("aba"))
        assertEquals(true, palindromePermutation("aab"))
        assertEquals(true, palindromePermutation("abba"))
        assertEquals(true, palindromePermutation("aabb"))
        assertEquals(true, palindromePermutation("a-bba"))
        assertEquals(true, palindromePermutation("a-bba!"))
        assertEquals(true, palindromePermutation("Tact Coa"))
        assertEquals(true, palindromePermutation("jhsabckuj ahjsbckj"))
        assertEquals(true, palindromePermutation("Able was I ere I saw Elba"))
        assertEquals(false, palindromePermutation("So patient a nurse to nurse a patient so"))
        assertEquals(false, palindromePermutation("Random Words"))
        assertEquals(false, palindromePermutation("Not a Palindrome"))
        assertEquals(true, palindromePermutation("no x in nixon"))
        assertEquals(true, palindromePermutation("azAZ"))
    }
}
