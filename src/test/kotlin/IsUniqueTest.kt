import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class IsUniqueTest {
    @Test
    fun testIsUnique() {
        assertEquals(true, isUnique("abcd"))
        assertEquals(true, isUnique("s4fad"))
        assertEquals(true, isUnique(""))
        assertEquals(true, isUnique(CharArray(128) { it.toChar() }.joinToString("")))

        assertEquals(false, isUnique("23ds2"))
        assertEquals(false, isUnique("hb 627jh=j ()"))
        assertEquals(false, isUnique(CharArray(129) { (it / 2).toChar() }.joinToString("")))
    }
}
