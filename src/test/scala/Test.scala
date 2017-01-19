import org.scalacheck.Prop._
import org.scalacheck._
import org.scalacheck.Shapeless._

sealed trait Foo
case object A extends Foo
case object B extends Foo

object Test extends Properties("whatevs") {

  property("successful prop") = forAll { (x: Foo) =>
    true
  }

  property("failing prop without shrinking") = forAllNoShrink { (x: Foo) =>
    false
  }

  property("failing prop with shrinking") = forAll { (x: Foo) =>
    println(x)
    false
  }


}
