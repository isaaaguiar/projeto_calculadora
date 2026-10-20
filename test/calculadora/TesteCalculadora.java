package calculadora;

/**
 * Testes unitários da classe {@link Calculadora}.
 * Cada teste mostra a entrada utilizada, o resultado esperado e o resultado obtido.
 *
 * @author Isabelle Aguiar
 * @version 1.0
 */
public class TesteCalculadora {

    /** Instância da calculadora usada em todos os testes. */
    private static final Calculadora CALCULADORA = new Calculadora();

    /** Quantidade de testes que passaram. */
    private static int aprovados = 0;

    /** Quantidade de testes que falharam. */
    private static int reprovados = 0;

    /**
     * Executa um teste: chama a calculadora e compara com o resultado esperado.
     *
     * @param nome     nome do teste
     * @param a        primeiro operando
     * @param b        segundo operando
     * @param op       operação
     * @param esperado resultado esperado
     */
    private static void testar(String nome, int a, int b, String op, String esperado) {
        String obtido = CALCULADORA.calc(a, b, op);
        boolean passou = esperado.equals(obtido);

        System.out.println("[" + nome + "]");
        System.out.println("  Entrada:   a=" + a + ", b=" + b + ", op=" + op);
        System.out.println("  Esperado:  " + esperado);
        System.out.println("  Obtido:    " + obtido);
        System.out.println("  Resultado: " + (passou ? "PASSOU" : "FALHOU"));
        System.out.println();

        if (passou) {
            aprovados++;
        } else {
            reprovados++;
        }
    }

    /**
     * Executa todos os testes e mostra o resumo no final.
     *
     * @param args argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        System.out.println("===== TESTES DA CALCULADORA =====");
        System.out.println();

        testar("Soma", 10, 5, "+", "15");
        testar("Subtracao", 10, 5, "-", "5");
        testar("Multiplicacao", 10, 5, "*", "50");
        testar("Divisao", 10, 4, "/", "2.5");
        testar("Divisao por zero", 10, 0, "/", "Erro: divisão por zero não é permitida.");
        testar("Operacao invalida", 10, 5, "%", "Erro: operação inválida.");
        testar("Operacao nula", 10, 5, null, "Erro: operação inválida.");

        System.out.println("===== RESUMO =====");
        System.out.println("Aprovados:  " + aprovados);
        System.out.println("Reprovados: " + reprovados);

        if (reprovados > 0) {
            System.exit(1);
        }
    }
}
