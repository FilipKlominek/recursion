fun main() {
    println(add(5, 2))
    println(multiply(3, 5))
    println(power(2, 4))
    println(digitSum(909))
    println(isPalindrome("lkjjkl"))
}


fun add(a: Int, b: Int): Int {
    if (a <= 0) return b
    return add(a - 1, b + 1)
}

fun multiply(a: Int, b: Int): Int {
    if (a <= 1) return b
    return b + (multiply(a - 1, b))
}

fun power(base: Int, exponent: Int): Int {
    if (exponent <= 1) return base
    return base * (power(base, exponent - 1))
}

fun digitSum(int: Int): Int {
    var string = int.toString()
    if (string.length <= 1) return string.toInt()
    val firstChar = string[0]
    string = string.substring(1)
    return firstChar.toString().toInt() + digitSum(string.toInt())
}

fun isPalindrome(string: String): Boolean {
    return when {
        string.length <= 1 -> true
        string[0] == string[string.length - 1] -> isPalindrome(string.substring(1, string.length - 1))
        else -> false
    }
}