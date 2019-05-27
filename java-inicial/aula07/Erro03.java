class Erro03 {
  // Erro: o método main não foi encontrado na classe Erro03; defina o método main como:
  public static void main (String [] args) {
    // Exception in thread "main" java.lang.ArithmeticException: / by zero
    System.out.println("Voce digitou: " + 1/0);
  }
}