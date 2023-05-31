fun main(args: Array<String>) {
  class Carro {
    var marca = ""
    var modelo = ""
    var ano = 0
  }
  // Criar um objeto(instanciar)
  val fusca = Carro()

  fusca.marca = "Wolks"
  fusca.modelo = "Fusca"
  fusca.ano = 1969

  println(fusca.marca)
  println(fusca.modelo)
  println(fusca.ano)

  val goul = Carro()

  goul.marca = "Toyota"
  goul.modelo = "Goul"
  goul.ano = 1988

  println(goul.marca)
  println(goul.modelo)
  println(goul.ano)


  
}
