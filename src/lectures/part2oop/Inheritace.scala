package lectures.part2oop

object Inheritace extends App {

  //scala supports single class inheritance
  sealed class Animal {
    val creatureType = "Wild"
    def eat(): Unit = println("nom nom")
  }

  class Cat extends Animal {
    def crunch(): Unit = {
      eat()
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch()

  // constructors
  class Person(name: String, age: Int)
  class Adult(name: String, age: Int, idCard: String) extends  Person(name, age)

  // overriding
  class Dog(override val creatureType: String) extends Animal {
    // override val creatureType: String = "Domestic"
    override def eat(): Unit = {
      super.eat()
      println("Crunch, crunch")
    }
  }
  val dog = new Dog("K9")
  dog.eat()
  println(dog.creatureType)

  // type substitution (broad: polymorphism)
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat()

  // overRIDING vs overLOADING

  // super

  // preventing overrides
  // 1 - use final on member
  // 2 - use final on the entire class
  // 3 - seal the class = extend classes in THIS FILE, prevent extension in other files
}
