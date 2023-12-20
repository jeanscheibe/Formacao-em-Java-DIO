1 ----- Introdução -----

Objetivo - Apresentar as regras essenciais para a construção de códigos com base da linguagem java

Pré-requisitos

- JDK
- IDE
- Diretório definido

Estrutura inicial
Padrão de nomenclatura
Declarando Variáveis e métodos
Identação
Organizando arquivos
Java Beans

2 ----- Anatomia de classes 1 -----

É comum escrever em inglês

<!-- Esse é o padrão de inicialização de um arquivo .java -->

public class Minha Class { <!-- o nome da classe precisa estar de acordo com o nome do arquivo -->
//código aqui
}

Criação de um projeto java

Conveção de nomes Java - Primeira palavra com letra maiúscula e a primeira de cada palavra adicional também maiúscula

Para escrever o codigo, se a classe for executável ela precisa conter o método main, conforme o exemplo abaixo

<!-- Classe executável - que inicializa o projeto -->

public static void main(String [] args){

}

public - arquivo público, que pode ser acessado
static -
void - não retorna nada
(String [] args) - espera receber o tipo string, determina um parâmetro array que se chama args

<!-- método de impressão com o parâmetro que se deseja imprimir -->

        System.out.println("Olá turma, sejam bem-vindos!");

3 ----- Anatomia de classes 2 -----

Padrão de nomenclatura

    Arquivo .java - deve começar com a letra Maiúscula. Se a palavra for composta, a segunda palavra também começa assim. Ex.:
    Calculadora.java CaulculadoraCientifica.java

    Nome da classe no arquivo - deve correponder ao nome do arquivo

    nome das variáveis - camelCase - primeira palavra com letra minúscula e as restantes com letra Maiúscula

    Variável com nome todo maiúsculo é a que não poder ser alterada após declarada, para garantir isso podemos usar a palavra final ex.:

    final String BR = "Brasil";

        <!-- troca -->
        int ESTADOS_BRASILEIRO = 27;
        ESTADOS_BRASILEIRO = 30;

        <!-- não troca -->
        final int ESTADOS_BRASILEIRO = 27;
        ESTADOS_BRASILEIRO = 30;

    os únicos símbolos permitidos são $ e _

4 ----- Anatomia de classes 3 -----

Declarando variáveis e métodos

Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)

Declarando métodos

TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

Exemplo

<!-- dentro do parêmtro vemos que ele leva o tipoe  o nome -->

int somar (int numeroUm, int numero2)
String formatarCep (long cep)

Código:
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

5 ----- Anatomia das classes 4 -----

Identação

Exercício no projeto BoletimEstudantil

6 ----- Anatomia das classes 5 -----

Organização por pacotes

Empresa - HyperTech

com.hypertch.notification.service
com.hypertch.notification.util
com.hypertch.notification.model

Exemplo, Jean quer organizar seua materiais de estudo

<!-- por tema -->

edu.jean.tema.logica
edu.jean.tema.controledefluxo

ou

<!-- por periodo -->

edu.jean.primeirasemana
edu.jean.segundasemana

<!-- dentro da pasta src criar uma pasta e mover o arquivo dentro dela -->

<!-- Será necessário criar uma classe package dentro do projeto, agora que ele não está mais dentro da pasta src -->

<!-- Exercício será realizado no projeto boletim estudantil -->

Isso tudo dará um erro, já que o diretório não foi criado da forma correta

Como criar um pacote no VS Code

Cria uma nova pasta e chama edu
Dentro desta cria uma nova pasta chamada jean
Dentro desta cria uma novapasta chamada primeira semana

7 ----- Anatomia das classes 6 -----

Java Beans

Sugestões de nomenclatura em Java

Sempre no singular
Usar sempre o mesmo idioma dentro do código

    Exemplos do que NÃO usar

        double salMedio - deveria ser salarioMedio
        String emails - deixar no singular
        Stryng myName - mistura de idiomas dentro do mesmo código

Pode-se usar a variável com plural, caso seja um array

Métodos

Os métodos deverão sernomeados como verbos

    exemplo

        somar() {}

        abrirXonexao() {}

        concluirProcessamento() {}

        findById() {}

8 ----- Tipos e variáveis 1 -----

Objetivo: Explorar os tipos de dados e sua aplicabilidade

Numéwricos inteiros e decimais
Tipos lógicos
Caracteres
Objetos
Diferença entre variável e constante

9 ----- Tipos e variáveis 2 -----

Tipos primitivos

int, byte, short, long, float, double, boolean e char

informações sobre os tipos no gitbook

11 ----- Tipos e variáveis 4 -----

constantes - Não podem ser alteradas depois de declaradas
deve ser declaradas em caixa alta

Para escrever uma constante em Java usamos o final

exemplo

final double VALOR_DE_PI = 3.14;
