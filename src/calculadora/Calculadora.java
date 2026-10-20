package calculadora;

public class Calculadora {

    // Versão inicial (Etapa 2) - commit na branch main
    public String calc(int a, int b, String op) {
        if (op == null) {
            return "Erro: operação inválida.";
        }
        if (op.equals("+")) {
            return String.valueOf((long) a + b);
        } else if (op.equals("-")) {
            return String.valueOf((long) a - b);
        } else if (op.equals("*")) {
            return String.valueOf((long) a * b);
        } else if (op.equals("/")) {
            if (b == 0) {
                return "Erro: divisão por zero não é permitida.";
            }
            return String.valueOf((double) a / b);
        } else {
            return "Erro: operação inválida.";
        }
    }
}
