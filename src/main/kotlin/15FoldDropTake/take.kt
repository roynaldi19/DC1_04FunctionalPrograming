package `15FoldDropTake`

fun main() {
    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.take(3)
    val takelast = total.takeLast(3)

    println(take)
    println(takelast)
}