fun main() {
  println("Qual sua idade?")
  var idade = readLine()!!
  println("Sua idade é: " + idade)

  val num = idade.toInt()

  if (num >= 18) {
    println("Voce é maior de idade")
  } else {
    println("Voce é menor de idade")
  }
}
