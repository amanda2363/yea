fun main(args: Array<String>) {
  println("Qual seu nome?")
  var texto = readLine()!!
  println("Seja bem vindo " + texto)

  println("Digite um numero: ")
  var num1 = readLine()!!
  var numero1 = num1.toInt()
  println("Ok, digite outro numero: ")
  var num2 = readLine()!!
  var numero2 = num2.toInt()
  var soma = numero1 + numero2
  println("A soma é: " + soma)
}
