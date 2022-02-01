import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Test {
    @Test
    fun testAdd() {
        val a = add(2, 5)
        assertEquals(7, a)
        val b = add(3, 8)
        assertEquals(13, b)
    }

    @Test
    fun testMultiply() {
        val a = multiply(3, 5)
        assertEquals(15, a)
        val b = multiply(0, 4)
        assertEquals(0, b)
    }

    @Test
    fun testPower() {
        val a = power(2, 5)
        assertEquals(32, a)
        val b = power(3, 3)
        assertEquals(27, b)
    }

    @Test
    fun testDigitSum() {
        val a = digitSum(999)
        assertEquals(27, a)
        val b = digitSum(108)
        assertEquals(9, b)
    }

    @Test
    fun testIsPalindrome() {
        val a = isPalindrome("poiuiop")
        assertTrue(a)
        val b = isPalindrome("lkjkkl")
        assertTrue(b)
    }
}