package bst

class Node(val key: Int) {
    override fun equals(other: Any?): Boolean {
        other as Node
        return key == other.key
    }
}