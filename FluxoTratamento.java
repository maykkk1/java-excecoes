
public class FluxoTratamento {
    public static void main(String[] args) throws Exception{
        System.out.println("Ini do main");
        try {
        	metodo1();
        } catch(MinhaExcecao ex) {
        	ex.getMessage();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws Exception{
        System.out.println("Ini do metodo1");
        try {
        	metodo2();
        } catch(ArithmeticException | NullPointerException ex) {
        	ex.printStackTrace();
        }
        System.out.println("Fim do metodo1");
        throw new MinhaExcecao("Deu muito errado");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        throw new ArithmeticException("Deu errado"); 
        
        //System.out.println("Fim do metodo2");
    }
}
