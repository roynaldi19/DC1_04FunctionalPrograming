package `02NamedDefaultArgument`

fun getFullName2(first: String = "Kotlin", middle: String = " is ", last: String = "Awesome"): String {
    return "$first $middle $last"
}

fun main() {
    val fullName = getFullName2(middle = "Apakah")
    print(fullName)
}