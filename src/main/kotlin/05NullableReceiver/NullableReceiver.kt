package `05NullableReceiver`

val Int?.slice: Int
    get() = this?.div(2) ?: 0

fun main() {
    val value: Int? = 3
    println(value.slice)
}