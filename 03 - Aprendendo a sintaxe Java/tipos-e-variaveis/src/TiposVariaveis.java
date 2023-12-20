public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.50
        // o valor acima reprefsenta 2500 reais e cinquenta centavos
        // O tipo long precisa ser encerrado com um L
        // float precisa terminar com um f, seja maiúsculo ou minúsculo;

        // fazendo o casting (conversão de tipo mais abrangente para tipo mais específico)
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // exemplo de constante

        final double VALOR_DE_PI = 3.14;
    }
}
