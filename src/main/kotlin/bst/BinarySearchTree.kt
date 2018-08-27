package bst

class BinarySearchTree(val root: Node? = null, val left: BinarySearchTree? = null, val right: BinarySearchTree? = null) {

    fun insert(newKey: Int): BinarySearchTree {
        if (root == null) {
            return BinarySearchTree(Node(newKey))
        } else {
            if (root.key > newKey) {
                return BinarySearchTree(root, left = BinarySearchTree().insert(newKey), right = right)
            } else if (root.key < newKey) {
                return BinarySearchTree(root, right = BinarySearchTree().insert(newKey), left = left)
            } else {
                return BinarySearchTree()
            }
        }
    }

}