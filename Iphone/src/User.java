import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Iphone myIphone = new Iphone();
        int MainOption = 0;

        do {
            System.out.println("\n==== Iphone - Home ====");
            System.out.println("1. Reprodutor Musical");
            System.out.println("2. Aparelho Telefônico");
            System.out.println("3. Navegador Internet");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            MainOption = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (MainOption) {
                case 1:
                    menuReprodutorMusical(scanner, myIphone);
                    break;
                case 2:
                    menuAparelhoTelefonico(scanner, myIphone);
                    break;
                case 3:
                    menuNavegadorInternet(scanner, myIphone);
                    break;
                case 0:
                    System.out.println("Desligando o iPhone... Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (MainOption != 0);

        scanner.close();
    }

    // Menu Music Player
    private static void menuReprodutorMusical(Scanner scanner, Iphone iphone) {
        int option;
        do {
            System.out.println("\n--- Reprodutor Musical ---");
            System.out.println("1. Selecionar Música");
            System.out.println("2. Tocar Música");
            System.out.println("3. Pausar Música");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.print("Digite o nome da música: ");
                    String music = scanner.nextLine();
                    iphone.chooseMusic(music);
                    break;
                case 2:
                    iphone.startMusic();
                    break;
                case 3:
                    iphone.pauseMusic();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (option != 0);
    }

    // Menu Telephone Device
    private static void menuAparelhoTelefonico(Scanner scanner, Iphone iphone) {
        int option;
        do {
            System.out.println("\n--- Aparelho Telefônico ---");
            System.out.println("1. Ligar");
            System.out.println("2. Atender");
            System.out.println("3. Iniciar Correio de Voz");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.print("Digite o número para ligar: ");
                    String number = scanner.nextLine();
                    iphone.call(number);
                    break;
                case 2:
                    iphone.aswerCall();
                    break;
                case 3:
                    iphone.startVoiceMail();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (option != 0);
    }

    // Menu Internet Browser
    private static void menuNavegadorInternet(Scanner scanner, Iphone iphone) {
        int option;
        do {
            System.out.println("\n--- Navegador Internet ---");
            System.out.println("1. Exibir Página");
            System.out.println("2. Adicionar Nova Aba");
            System.out.println("3. Atualizar Página");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.print("Digite a URL: ");
                    String url = scanner.nextLine();
                    iphone.displayPage(url);
                    break;
                case 2:
                    iphone.addNewTab();
                    break;
                case 3:
                    iphone.updatePage();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (option != 0);
    }
}
