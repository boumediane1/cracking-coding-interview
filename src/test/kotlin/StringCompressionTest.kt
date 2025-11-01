import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StringCompressionTest {
  @Test
  fun testStringCompressionTest() {
        assertEquals("a2b1c5a3", stringCompression("aabcccccaaa"))
        assertEquals("abcdef", stringCompression("abcdef"))
        assertEquals("aabb", stringCompression("aabb"))
        assertEquals("a3", stringCompression("aaa"))
        assertEquals("a", stringCompression("a"))
        assertEquals("", stringCompression(""))
  }
}
