package DesafioControleFluxo;

public class ControlandoFluxo {

    public static void main(String[] args) {
        try {
            // Verifica se foram passados 2 argumentos
            if (args.length < 2) {
                throw new IllegalArgumentException("É necessário passar 2 números como argumentos.");
            }

            // Converte os argumentos para inteiros
            int parametroUm = Integer.parseInt(args[0]);
            int parametroDois = Integer.parseInt(args[1]);

            // Chama o metodo que realiza a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (NumberFormatException e) {
            // Captura erros de conversão de String para número
            System.err.println("Erro: Certifique-se de passar números válidos como argumentos.");
        } catch (ParametrosInvalidosException e) {
            // Captura a exceção personalizada
            System.err.println(e.getMessage());
        } catch (Exception e) {
            // Captura qualquer outra exceção
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            // Lança exceção caso o primeiro número seja maior ou igual ao segundo
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        // Realiza a contagem e imprime os números
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo número: " + i);
        }
    }
}

// Exceção personalizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}