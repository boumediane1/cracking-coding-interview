import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class OneAwayTest {
    @Test
    fun testOneAwayTest() {
        // no changes
        assertEquals(true, oneAway("pale", "pale"))
        assertEquals(true, oneAway("", ""))
        // one insert
        assertEquals(true, oneAway("pale", "ple"))
        assertEquals(true, oneAway("ple", "pale"))
        assertEquals(true, oneAway("pales", "pale"))
        assertEquals(true, oneAway("ples", "pales"))
        assertEquals(true, oneAway("pale", "pkle"))
        assertEquals(true, oneAway("paleabc", "pleabc"))
        assertEquals(true, oneAway("", "d"))
        assertEquals(true, oneAway("d", "de"))
        // one replace
        assertEquals(true, oneAway("pale", "bale"))
        assertEquals(true, oneAway("a", "b"))
        assertEquals(false, oneAway("pale", "ble"))
        // multiple replace
        assertEquals(false, oneAway("pale", "bake"))
        // insert and replace
        assertEquals(false, oneAway("pale", "pse"))
        assertEquals(false, oneAway("pale", "pas"))
        assertEquals(false, oneAway("pas", "pale"))
        assertEquals(false, oneAway("pkle", "pable"))
        assertEquals(false, oneAway("pal", "palks"))
        assertEquals(false, oneAway("palks", "pal"))
        // permutation with insert shouldn't match
        assertEquals(false, oneAway("ale", "elas"))
    }
}
