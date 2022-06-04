package `13MemberReferences`

fun isEvenNumber(number: Int) = number % 2 == 0

fun main() {
    val numbers = 1..10
    val evenNumbers = numbers.filter(::isEvenNumber)
    println(evenNumbers)
}