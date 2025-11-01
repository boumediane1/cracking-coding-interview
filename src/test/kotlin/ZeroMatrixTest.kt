import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class ZeroMatrixTest {
    @Test
    fun testRotateMatrix() {
        assertArrayEquals(
            zeroMatrix(
                arrayOf(
                    arrayOf(1, 2, 3, 4, 0),
                    arrayOf(6, 0, 8, 9, 10),
                    arrayOf(11, 12, 13, 14, 15),
                    arrayOf(16, 0, 18, 19, 20),
                    arrayOf(21, 22, 23, 24, 25),
                )
            ),
            arrayOf(
                arrayOf(0, 0, 0, 0, 0),
                arrayOf(0, 0, 0, 0, 0),
                arrayOf(11, 0, 13, 14, 0),
                arrayOf(0, 0, 0, 0, 0),
                arrayOf(21, 0, 23, 24, 0),
            )
        )
    }
}

