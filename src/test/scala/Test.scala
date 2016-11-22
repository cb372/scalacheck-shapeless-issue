import org.scalacheck.Prop.forAll
import org.scalacheck._
import org.scalacheck.Shapeless._

sealed trait Tree
case object A extends Tree
case object B extends Tree // Note: comment out this line and everything works as expected
case class Node(children: Map[String, Tree]) extends Tree

object Test extends Properties("whatevs") {

  property("successful prop") = forAll { (x: Tree) =>
    true
  }

  property("failing prop") = forAll { (x: Tree) =>
    false
  }

}
