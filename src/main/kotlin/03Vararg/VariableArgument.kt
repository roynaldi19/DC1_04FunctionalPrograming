package `03Vararg`


//varag untukjumlah argument yang akan di proses tidak di ketahui di awal
//varag berfungsi seperti Array

fun sumNumbers(vararg number: Int): Int {
    return number.sum()

}

fun main() {
    val number = sumNumbers(10,20,30,40)
    println(number)
}