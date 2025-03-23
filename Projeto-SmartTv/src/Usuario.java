public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("CONFIGURAÇÕES INICIAIS DA TV");
        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual: "  + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("-----------------------------------");
        
        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada ? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status -> TV desligada ? " + smartTv.ligada);
        System.out.println("");
        
        System.out.println("Canal atual: "  + smartTv.canal);
        smartTv.mudarCanal(14);
        System.out.println("Novo Status -> Canal atual: "  + smartTv.canal);
        System.out.println("");
        
        
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
    }
}
