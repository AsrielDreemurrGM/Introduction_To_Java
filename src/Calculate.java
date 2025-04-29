public class Calculate {
    public static void main(String[] args) {
        String environment = args[0];
        if (environment.equalsIgnoreCase("DEV")) {
            System.out.print("Executando em DEV");
        } else if (environment.equalsIgnoreCase("TESTE")) {
            System.out.print("Executando em TESTE");
        } else {
            System.out.print(environment);
        }
    }
}
