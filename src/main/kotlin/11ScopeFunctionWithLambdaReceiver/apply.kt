package `11ScopeFunctionWithLambdaReceiver`

fun main() {
    val message = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message.toString())
}