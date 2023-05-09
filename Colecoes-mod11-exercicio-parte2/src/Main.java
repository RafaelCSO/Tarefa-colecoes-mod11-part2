import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();
        boolean continuar = true;

        while(continuar){
            System.out.print("Digite o nome e sexo separado por hifen: ");
            String entradaNome = s.nextLine();
            String[] entradaArray = entradaNome.split("-");
            entradaArray[1] = entradaArray[1].toUpperCase().trim();

            if(entradaArray[1].equalsIgnoreCase("M")){
                masculino.add(entradaArray[0]);

            }
            else if (entradaArray[1].equalsIgnoreCase("F")){
                feminino.add(entradaArray[0]);

            }


            System.out.println("Continuar ? Y/N");
            String novoNome = s.nextLine();
            if (novoNome.equalsIgnoreCase("Y")){
                continuar = true;
            }
            else {
                continuar = false;
            }

        }
        
        Collections.sort(masculino);
        Collections.sort(feminino);
        System.out.println("Nomes Masculinos Ordenados: " + Arrays.toString(masculino.toArray()));
        System.out.println("Nomes Femininos Ordenados: " + Arrays.toString(feminino.toArray()));
    }
}
