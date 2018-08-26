package bst

class BinarySearchTree(val root: Node) {

    fun insert(newKey: Int) {
        if (root.key > newKey) {
            root.left = Node(newKey, null, null)
        } else if (root.key < newKey) {
            root.right = Node(newKey, null, null)
        }
    }

}