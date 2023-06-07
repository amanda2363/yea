fun meuNome(nome: String) {
  println("Seu nome é: " + nome)
}

fun veroufalso(x: Boolean) {
  println(x)
}

fun seramaior(y: Int) {
  if (y >= 18) {
    println("É maior de idade: " + y)
  } else {
    println("É menor de idade: " + y)
  }
}

fun soma(a: Int, b: Int): Int {
  return (a + b)
}

fun main() {
  meuNome("Amanda")
  veroufalso(true)
  veroufalso(false)

  seramaior(15)
  seramaior(19)

  var resultado = soma(3, 5)
  println(resultado)
}
