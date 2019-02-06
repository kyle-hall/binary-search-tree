package bst

import org.junit.Test
import kotlin.test.*

class NodeTests {

    @Test
    fun equalsShouldReturnFalseWhenKeysAreDifferent() {
        val n = Node(1)
        val otherNode = Node(2)

        assertNotEquals(n, otherNode)
    }

    @Test
    fun equalsShouldReturnTrueWhenKeysAreSame() {
        val n = Node(1)
        val otherNode = Node(1)

        assertEquals(n, otherNode)
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