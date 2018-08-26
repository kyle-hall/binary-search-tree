package bst

class BinarySearchTree {

    var root: Node? = null

    fun insert(newKey: Int) {
        root = Node(newKey)
    }

}