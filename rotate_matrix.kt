fun rotateMatrix(matrix: Array<Array<Int>>): Array<Array<Int>> {
    val result = Array(3) { Array(3) { 0 } }

    for (i in 0 until matrix.size) {
        for (j in 0 until matrix.size) {
            result[j][matrix.size - 1 - i] = matrix[i][j]
        }
        println()
    }

    return result
}
