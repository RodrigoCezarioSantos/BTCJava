public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("A Tv está ligada? : " + smartTv.ligada);
        System.out.println("Qual é o canal? :" + smartTv.canal);
        System.out.println("Qual é o volume? : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV LIGADA ? :" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Stauts 3 - > TV LIGADA? :" + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Atualização do volume -> Volume atual é:  " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Atualização do volume 2 -> Volume atual é: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Atualização do canal -> Canal atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Atualização do canal 2 -> Canal Atual: " + smartTv.canal);

        smartTv.definirCanal(13);
        System.out.println("Atualização do canal 3 -> Canal atual: " + smartTv.canal);

    }
}
