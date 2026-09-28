class Matrix(
    private val data: Array<IntArray>,
    private val noOfRow: Int,
    private val noOfCol: Int
) {

    operator fun plus(other: Matrix): Matrix {
        val result = Array(noOfRow) { IntArray(noOfCol) }

        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                result[i][j] = data[i][j] + other.data[i][j]
            }
        }

        return Matrix(result, noOfRow, noOfCol)
    }

    operator fun minus(other: Matrix): Matrix {
        val result = Array(noOfRow) { IntArray(noOfCol) }

        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                result[i][j] = data[i][j] - other.data[i][j]
            }
        }

        return Matrix(result, noOfRow, noOfCol)
    }

    operator fun times(other: Matrix): Matrix {
        val result = Array(noOfRow) { IntArray(other.noOfCol) }

        for (i in 0 until noOfRow) {
            for (j in 0 until other.noOfCol) {
                for (k in 0 until noOfCol) {
                    result[i][j] += data[i][k] * other.data[k][j]
                }
            }
        }

        return Matrix(result, noOfRow, other.noOfCol)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("($noOfRow x $noOfCol Matrix):\n")

        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                sb.append(data[i][j]).append("    ")
            }
            sb.append("\n")
        }

        return sb.toString()
    }
}

fun main() {

    val firstMatrix = Matrix(
        arrayOf(
            intArrayOf(3, -2, 5),
            intArrayOf(3, 0, 4)
        ), 2, 3
    )

    val secondMatrix = Matrix(
        arrayOf(
            intArrayOf(2, 3),
            intArrayOf(-9, 0),
            intArrayOf(0, 4)
        ), 3, 2
    )

    val secondMatrix1 = Matrix(
        arrayOf(
            intArrayOf(6, 3),
            intArrayOf(9, 0),
            intArrayOf(5, 4)
        ), 3, 2
    )

    println("***************Addition***************")
    print("Matrix:1 ")
    print(secondMatrix1)
    print("Matrix:2 ")
    print(secondMatrix)

    val thirdMatrix = secondMatrix1 + secondMatrix
    println("Addition: $thirdMatrix")

    println("***************Subtraction***************")
    print("Matrix:1 ")
    print(secondMatrix1)
    print("Matrix:2 ")
    print(secondMatrix)

    val subtractMatrix = secondMatrix1 - secondMatrix
    println("Subtraction: $subtractMatrix")

    println("***************Multiplication***************")
    print("Matrix:1 ")
    print(firstMatrix)
    print("Matrix:2 ")
    print(secondMatrix)

    val multiplication = firstMatrix * secondMatrix
    println("Multiplication: $multiplication")
}