package playground

object HelloScala extends App {
//  val name = scala.io.StdIn.readLine()
//  println(s"Hello $name")

  class WelcomeUser(name: String) {
    if(name.isEmpty) println(s"Welcome Optum User") else println(s"Welcome $name")
  }

  val welcomeUser = new WelcomeUser("df")

  class RangedIntP() {
    var intVal: Int = 0

    // Getter
    def value: Int = intVal

    // Setter
    def value_=(num: Int): Unit = {
      if (num < 5 || num > 30)
        println("Out of range")
      else intVal = num
    }
  }

  val rangedInt = new RangedIntP

  println(rangedInt.value)
  rangedInt.value = 7
  println(rangedInt.value)
  rangedInt.value = 32
  println(rangedInt.value)
  rangedInt.value = 2
  println(rangedInt.value)

}
