fun rotateMatrix(matrix: Array<Array<Int>>): Array<Array<Int>> {
    for (i in 0 until matrix.size / 2) {
        for (j in i until matrix.size - 1 - i) {
            val temp = matrix[i][j]
            matrix[i][j] = matrix[j][matrix.size - 1 - i]
            matrix[j][matrix.size - 1 - i] = temp
        }

        for (j in i until matrix.size - 1 - i) {
            val temp = matrix[i][j]
            matrix[i][j] = matrix[matrix.size - 1 - i][matrix.size - 1 - j]
            matrix[matrix.size - 1 - i][matrix.size - 1 - j] = temp
        }

        for (j in i until matrix.size - 1 - i) {
            val temp = matrix[i][j]
            matrix[i][j] = matrix[matrix.size - 1 - j][i]
            matrix[matrix.size - 1 - j][i] = temp
        }
    }

    return matrix
}
