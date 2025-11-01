import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StringRotationTest {
    @Test
    fun testStringRotation() {
        assertEquals(true, stringRotation("waterbottle", "erbottlewat"))
        assertEquals(false, stringRotation("foo", "bar"))
        assertEquals(false, stringRotation("foo", "foofoo"))
    }
}
