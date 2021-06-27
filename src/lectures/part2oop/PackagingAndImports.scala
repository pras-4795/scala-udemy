package lectures.part2oop

import playground.{Cindrella => Princess, PrinceCharming}

import java.util.Date
import java.sql.{Date => SqlDate}

object PackagingAndImports extends App {

  // package members are accessible by their simple name
  val writer = new Writer("Daniel", "Rock the JVM", 2021)

  // import the package
  val princess = new Princess  // playground.Cinderella = fully qualified name

  // packages are in hierarchy
  // matching folder structure.

  // package object
  // But we might need to have some kind of universal constants or universal methods that reside outside
  // classes so we don't need to resort to classes to access them. So package objects were created for this purpose.
  // it is named package.scala
  sayHello
  println(SPEED_OF_LIGHT)

  // imports
  val prince = new PrinceCharming

  // 1. use FQ names
  val date = new Date
  val sqlDate = new SqlDate(2018, 5, 4)
  // 2. use aliasing

  // default imports
  // java.lang - String, Object, Exception
  // scala - Int, Nothing, Function
  // scala.Predef - println, ???
}
