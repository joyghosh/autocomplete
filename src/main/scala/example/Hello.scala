package example

import joy.datastructures.Node

object Hello extends Greeting with App {
  println(greeting)
  val node = new Node;
  Node.insert(node, "Joy")
}

trait Greeting {
  lazy val greeting: String = "hello"
}
