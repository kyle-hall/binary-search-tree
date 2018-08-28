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

    @Test
    fun insertShouldSetRightChildWhenNewKeyIsGreaterThanRootKey() {
        val bst = BinarySearchTree().insert(5)
        val bst2 = bst.insert(8)

        assertEquals(8, bst2.right?.root?.key)
    }

    @Test
    fun insertShouldSetLeftOfLeftChildWhenNewKeyLessThanLeftChild() {
        val bst = BinarySearchTree().insert(5).insert(2)
        val bst2 = bst.insert(1)

        assertEquals(1, bst2.left?.left?.root?.key)
    }

    @Test
    fun insertShouldSetRightOfLeftChildWhenNewKeyGreaterThanLeftChild() {
        val bst = BinarySearchTree().insert(5).insert(2)
        val bst2 = bst.insert(3)

        assertEquals(3, bst2.left?.right?.root?.key)
    }

}
