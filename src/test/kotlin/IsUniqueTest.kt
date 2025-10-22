import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class IsUniqueTest {
    @Test
    fun testIsUnique() {
        assertEquals(true, isUnique("abcd"))
        assertEquals(true, isUnique("s4fad"))
        assertEquals(true, isUnique(""))

        assertEquals(false, isUnique("23ds2"))
        assertEquals(false, isUnique("hb 627jh=j ()"))
    }
}
