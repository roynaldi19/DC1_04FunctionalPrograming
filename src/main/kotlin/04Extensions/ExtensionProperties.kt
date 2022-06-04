package `04Extensions`

val Int.slice: Int
    get() = this / 2

fun main() {
    println(10.slice)
}