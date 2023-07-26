class Calculadora(var num1: Int, var num2: Int) {

  fun soma() {
    println(num1 + num2)
  }

  fun sub() {
    println(num1 - num2)
  }

  fun mult() {
    println(num1 * num2)
  }

  fun div() {
    println(num1 / num2)
  }
}

fun main() {

  var calcsoma = Calculadora(2, 4)
  calcsoma.soma()

  var calcmenos = Calculadora(2, 4)
  calcmenos.sub()

  var calcmult = Calculadora(2, 4)
  calcmult.mult()

  var calcdi = Calculadora(2, 4)
  calcdi.div()
}
