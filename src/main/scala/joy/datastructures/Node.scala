package joy.datastructures

/**
  * Created by joyghosh on 15/07/17.
  *
  * Trie node
  */
class Node {
  //child nodes of a node.
  private var _children = new Array[Node](Node.ALPHABET_SIZE)

  //is leaf node.
  private var _isLeaf = false

  //get all child nodes.
  def children = _children

  //get isLeaf node.
  def isLeaf = _isLeaf

  //set isLeaf node.
  def isLeaf_= (isLeaf : Boolean) : Unit = {
    _isLeaf = isLeaf
  }
}

object Node{

  //constant alphabet size.
  val ALPHABET_SIZE = 26;

  //char to index.
  def charToIndex(c: Char) : Int = {
    c.toInt - 'a'.toInt
  }

  //insert Trie node.
  def insert(root: Node, key: String) : Unit = {
    var node: Node = root
    val k = key.toLowerCase()
    for(level <- 0 to k.length()){
      var index = charToIndex(k.charAt(level))
      println(index)
      if(node.children(level) != null){
        node.children(level) = new Node()
      }

      node = node.children(level);
    }

    //mark as leaf node.
    node.isLeaf = true
  }

  //remove/delete Trie node.
//  def delete = (word : Array[Char]) : Boolean = {
//    false
//  }
}
