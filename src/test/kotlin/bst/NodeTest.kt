package bst

import org.junit.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class NodeTests {

    @Test
    fun equalsShouldReturnFalseWhenKeysAreDifferent() {
        val n = Node(1)
        val otherNode = Node(2)

        assertFalse(n == otherNode)
    }

    @Test
    fun equalsShouldReturnTrueWhenKeysAreSame() {
        val n = Node(1)
        val otherNode = Node(1)

        assertTrue(n == otherNode)
    }

    @Test
    fun equalsShouldThrowExceptionWhenOtherObjectIsNotANode() {
        val n = Node(1)
        val other = 1

        assertFailsWith(
                exceptionClass = ClassCastException::class,
                block = { n.equals(other) }
        )
    }

}