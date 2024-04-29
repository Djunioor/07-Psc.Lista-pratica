import java.util.Scanner;

public class questao1{
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            String[][] agenda = new String[30][24];
            int dia;
            int horas;

            System.out.print("Digite o dia: ");
            dia = input.nextInt();
            input.nextLine();

            System.out.print("Digite a hora: ");
            horas = input.nextInt();
            input.nextLine();

            if (agenda[dia][horas] == null) {
                System.out.print("Digite sua tarefa: ");
                agenda[dia][horas] = input.nextLine();

                System.out.print("Você selecionol essa tarefa no dia " + dia + " as " + horas + " horas: " + agenda[dia][horas]);
            } else{
                System.out.println("Esse horário ja tem um compromisso!");
            }

            input.close();
    }
}