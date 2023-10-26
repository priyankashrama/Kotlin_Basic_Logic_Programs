fun main() {
    val matrixA = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
    val matrixB = arrayOf(intArrayOf(9, 8, 7), intArrayOf(6, 5, 4), intArrayOf(3, 2, 1))
    val result = multiplyMatrices(matrixA, matrixB)

    // Displaying the result
    for (row in result) {
        for (element in row) {
            print("$element ")
        }
        println()
    }
}

fun multiplyMatrices(a: Array<IntArray>, b: Array<IntArray>): Array<IntArray> {
    val rowsA = a.size
    val colsA = a[0].size
    val colsB = b[0].size

    val result = Array(rowsA) { IntArray(colsB) }

    for (i in 0 until rowsA) {
        for (j in 0 until colsB) {
            for (k in 0 until colsA) {
                result[i][j] += a[i][k] * b[k][j]
            }
        }
    }

    return result
}
