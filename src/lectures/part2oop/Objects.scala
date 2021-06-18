package lectures.part2oop

object Objects extends App {

  // Scala does not have class level functionality or static
  // the equivalent would be object

  object Person {
    val N_EYES = 2
    def canFly: Boolean = false

    // factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  println(Person.N_EYES)
  println(Person.canFly)

  // scala object = SINGLETON INSTANCE

  class Person(val name: String) {
    // instance-level functionality
  }
  // COMPANIONS

  // Scala object = SINGLETON INSTANCE
  val mary = new Person("Mary")
  val john = new Person("John")
  println(mary == john)

  val person1 = Person
  val person2 = Person
  println(person1 == person2)

  val bobbie = Person(mary, john)
  // Scala Applications = Scala object with
  // def main(args: Array[String]): Unit // PSVM alternative for java
}
