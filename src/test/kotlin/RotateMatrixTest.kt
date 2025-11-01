import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class RotateMatrixTest {
    @Test
    fun testRotateMatrix() {
        assertArrayEquals(
            rotateMatrix(
                arrayOf(
                    arrayOf(1, 2, 3),
                    arrayOf(4, 5, 6),
                    arrayOf(7, 8, 9)
                )
            ),
            arrayOf(
                arrayOf(7, 4, 1), arrayOf(8, 5, 2), arrayOf(9, 6, 3)
            )
        )

        assertArrayEquals(
            rotateMatrix(
                arrayOf(
                    arrayOf(1, 2, 3, 4, 5),
                    arrayOf(6, 7, 8, 9, 10),
                    arrayOf(11, 12, 13, 14, 15),
                    arrayOf(16, 17, 18, 19, 20),
                    arrayOf(21, 22, 23, 24, 25)
                )
            ),
            arrayOf(
                arrayOf(21, 16, 11, 6, 1),
                arrayOf(22, 17, 12, 7, 2),
                arrayOf(23, 18, 13, 8, 3),
                arrayOf(24, 19, 14, 9, 4),
                arrayOf(25, 20, 15, 10, 5),
            ),
        )
    }
}

