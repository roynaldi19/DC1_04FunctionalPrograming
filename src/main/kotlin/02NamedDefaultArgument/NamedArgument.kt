package `02NamedDefaultArgument`

fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}

fun main() {
    val fullName = getFullName(middle = "Naldi", last = "Kiid", first = "Roy")
    println(fullName)
}