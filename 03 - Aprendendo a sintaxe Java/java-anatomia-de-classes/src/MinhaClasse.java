public class MinhaClasse {
    public static void main(String [] args){

        // System.out.println("Olá turma, sejam bem-vindos!");

        // int ESTADOS_BRASILEIRO = 27;
        // ESTADOS_BRASILEIRO = 30;

        // declarando variáveis

        // String meuNome = "Jean";
        // int anoFabricacao = 2022;
        // boolean verdadeira = false;
        // anoFabricacao = 2018; // reatribuição

        String primeiroNome = "Gleyson";
        String segundoNome = "Sampaio";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }
        // declarando métodos 1º forma de concatenação
        // public static String nomeCompleto (String primeiroNome, String segundoNome) {
        //    return primeiroNome.concat(" ").concat(segundoNome);

        // declarando métodos 2º forma de concatenação
        public static String nomeCompleto (String primeiroNome, String segundoNome) {
            return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);

        }
}
