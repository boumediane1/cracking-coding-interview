fun zeroMatrix(matrix: Array<Array<Int>>): Array<Array<Int>> {
    val positions = mutableListOf<Array<Int>>()

    for (i in 0 until matrix.size) {
        for (j in 0 until matrix.size) {
            if (matrix[i][j] == 0) {
                positions.add(arrayOf(i, j))
            }
        }
    }

    for (position in positions) {
        for (i in 0 until matrix.size) {
            matrix[position[0]][i]= 0
            matrix[i][position[1]] = 0
        }
    }

    return matrix
}
