package bst

class BinarySearchTree(val root: Node) {

    fun insert(newKey: Int) {
        if (root.key > newKey) {
            root.left = Node(newKey, null)
        }
    }

}