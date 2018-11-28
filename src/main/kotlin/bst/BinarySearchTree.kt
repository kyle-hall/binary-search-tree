package bst

class BinarySearchTree(val root: Node? = null, val left: BinarySearchTree? = null, val right: BinarySearchTree? = null) {

    // This is just a comment to see if my ssh key still works

    fun insert(newKey: Int): BinarySearchTree {
        if (root == null) {
            return BinarySearchTree(Node(newKey))
        } else {
            return if (root.key > newKey) {
                if (left == null) {
                    BinarySearchTree(root, left = BinarySearchTree().insert(newKey), right = right)
                } else {
                    BinarySearchTree(root, left = left.insert(newKey), right = right)
                }
            } else if (root.key < newKey) {
                if (right == null) {
                    BinarySearchTree(root, right = BinarySearchTree().insert(newKey), left = left)
                } else {
                    BinarySearchTree(root, right = right.insert(newKey), left = left)
                }
            } else {
                this
            }
        }
    }

}
