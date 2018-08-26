package bst

import kotlin.test.assertEquals
import org.junit.Test

class BinarySearchTreeTests {

    @Test
    fun shouldHaveNullRootWhenEmpty() {
        val bst = BinarySearchTree()

        assertEquals(null, bst.root)
    }

    @Test
    fun shouldSetRootToFirstNodeAppended() {
        val bst = BinarySearchTree()
        bst.insert(1)

        assertEquals(1, bst.root?.key)
    }
//
//    @Test
//    fun shouldSetAppendedNodeToLeftChildIfLessThanRootKey() {
//        val bst = BinarySearchTree(null)
//        val bst2 = bst.insert(Node(5, null, null)).insert(Node(2, null, null))
//
//        assertEquals(2, bst2.root?.left?.key)
//    }
//
//    @Test
//    fun shouldSetAppendedNodeToRightChildIfGreaterThanRootKey() {
//        val bst = BinarySearchTree(null)
//        val bst2 = bst.insert(Node(5, null, null)).insert(Node(8, null, null))
//
//        assertEquals(8, bst2.root?.right?.key)
//    }
//
//    @Test
//    fun shouldSetAppendedNodeToLeftChildOfLeftChildIfLessThanLeftChildKey() {
//        val bst = BinarySearchTree(null)
//        val bst2 = bst
//                .insert(Node(5, null, null))
//                .insert(Node(2, null, null))
//                .insert(Node(1, null, null))
//
//        assertEquals(1, bst2.root?.left?.left?.key)
//    }

}