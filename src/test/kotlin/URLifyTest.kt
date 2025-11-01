import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class URLifyTest {
    @Test
    fun testUrlify() {
        assertEquals("much%20ado%20about%20nothing", urlify("much ado about nothing      ", 22))
        assertEquals("Mr%20John%20Smith", urlify("Mr John Smith       ", 13))
        assertEquals("%20a%20b", urlify(" a b    ", 4))
        assertEquals("%20a%20b%20", urlify(" a b       ", 5))
    }
}
