import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String nomeUsuario = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        while (senha.equals(nomeUsuario)) {
            System.out.println("Senha não pode ser igual ao nome de usuário. Tente novamente.");
            System.out.print("Digite a senha: ");
            senha = sc.nextLine();
        }

        System.out.println("Nome de usuário: " + nomeUsuario);
        System.out.println("Senha: " + senha);

        sc.close();
    }
}