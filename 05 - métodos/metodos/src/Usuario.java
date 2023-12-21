public class Usuario {
    public static void main(String[] args) throws Exception {
        // public double somar(int num1, int num2){
        //     // LOGICA - FINALIDADE DO MÉTODO
        //     return ... ;
        // }

        // public void imprimir(String texto){
        //     // LOGICA - FINALIDADE DO MÉTODO
        //     // NÃO PRECISA DE RETURN
        // }

        // // CHECAR OS DEMAIS NO GITBOOK

            SmartTv smartTv = new SmartTv();

            System.out.println("TV Ligada?" + smartTv.ligada);
            System.out.println("Canal atual: " + smartTv.canal);
            System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status TV Ligada?" + smartTv.ligada);
        
        // smartTv.desligar();
        // System.out.println("Novo status TV Ligada?" + smartTv.ligada);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);
        
        smartTv.mudarCanal(13);

    }
}
