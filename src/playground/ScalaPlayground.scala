package playground

object ScalaPlayground extends App {
  class RangedInt() {
    private var intVal: Int = 0

    // Getter
    def value: Int = intVal

    // Setter
    def value_= (v: Int): Unit = {
      if(v > 5 && v < 30) intVal = v
      else println("Not in range")
    }

  }

  val rangedInt = new RangedInt

  println(rangedInt.value)
  rangedInt.value = 7
  println(rangedInt.value)
  rangedInt.value = 32
  println(rangedInt.value)
  rangedInt.value = 2
  println(rangedInt.value)
}
