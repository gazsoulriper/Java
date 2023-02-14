public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTV = new SmartTv();

        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);
    
        smartTV.ligar();
        System.out.println("Novo status: TV ligada? " + smartTV.ligada);

        smartTV.aumentarVolume();
        System.out.println("Novo status volume: " + smartTV.volume);

        smartTV.mudarCanal(12);
        System.out.println("Novo canal: " + smartTV.canal);
    }
}
