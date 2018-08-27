package bst

import kotlin.test.assertEquals
import org.junit.Test

class BinarySearchTreeTests {

    @Test
    fun shouldSetRootFromConstructor() {
        val bst = BinarySearchTree()

        assertEquals(null, bst.root)
    }

    @Test
    fun insertShouldSetRootWhenRootIsNull() {
        val bst = BinarySearchTree()

        val bst2 = bst.insert(1)

        assertEquals(1, bst2.root?.key)
    }

    @Test
    fun insertShouldSetLeftChildWhenNewKeyIsLessThanRootKey() {
        val bst = BinarySearchTree().insert(5)

        val bst2 = bst.insert(2)

        assertEquals(2, bst2.left?.root?.key)
    }

}
