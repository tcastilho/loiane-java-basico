class Erro02 {
  public static void main (String [] args) {
    // 3: error: not a statement
    int cont = 0;
    // 5: error: variable cont might not have been initialized
    System.out.println("Voce digitou " + cont);
  }
}