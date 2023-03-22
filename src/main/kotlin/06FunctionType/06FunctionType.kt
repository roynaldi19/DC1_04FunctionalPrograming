package `06FunctionType`

typealias Arithmetic = (Int, Int) -> Int

val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

val sumResult = sum(10, 10)
val multiplyResult = multiply(20, 20)