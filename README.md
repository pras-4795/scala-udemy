# scala-udemy

1. vals are immutable
2. compiler can infer types
3. var is mutable
4. side effects are the expressions which change a value or which return a Unit ().  // side effects: println(), whiles, reassigning

#### Types
1. Int
2. String
3. Boolean
4. Char
5. Short
6. Long
7. Float

#### Tail Recursion

```
def anotherFactorial(n: Int): Int = {
    @tailrec
    def factHelper(n:Int, acc: Int): Int = {
      if ( n<=1 ) acc
      else factHelper(n-1, n * acc) // TAIL RECURSION = use recursive call as the LAST expression
    }

    factHelper(n, 1)
  }
```

#### Call by name vs Value
```
def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
}

def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
}
```

If you perform call by name, the value will not be passed instead it will pass expression, and it will execute eveytime the value is passed.<br>
It can be used for lazy execution. <br><br>
Default value for a method can be passed as below.
`def trFact(n: Int, acc: Int = 1): Int =`<br>
But if we set any arg as default then we need to set default values for all the args till the last arg, as compiler will not be able to recognize.<br>
Else name the args while calling the method.

