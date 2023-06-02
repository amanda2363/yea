class Main {
  static void impPrime(){
    System.out.println("Só imprime isso");
  }
  static void myMethod(String nome) {
    System.out.println("O nome é: "+ nome);
  }

  static void nomeEidade(String nome,int ano) {
    System.out.println(nome + " tem " + ano + " anos ");
  }
  
   public static void main(String[] args){

  impPrime();
  myMethod("Jefersson");
  myMethod("Juliana");
  myMethod("Marcos");

  nomeEidade("Jefersson", 73 );
  nomeEidade("Juliana", 36 );
  nomeEidade("Marcos", 26 );  
   } 
}