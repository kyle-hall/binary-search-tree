package bst

class BinarySearchTree(val root: Node? = null, val left: BinarySearchTree? = null, val right: BinarySearchTree? = null) {

    fun insert(newKey: Int): BinarySearchTree {
        if (root == null) {
            return BinarySearchTree(Node(newKey))
        } else if (left == null) {
            return BinarySearchTree(this.root, BinarySearchTree().insert(newKey))
        } else {
            return BinarySearchTree()
        }
    }

}