import java.util.Scanner;

public class ativ03 {
    public static void main(String args[]){
        String nome []=new String[5];
        int idades[]=new int[5];
        double estatura[]=new double[5];
        double peso[]=new double[5];
        double imc[]=new double[5];
        Scanner sc=new Scanner(System.in);


        for (int i=0;i<=4;i++){
            System.out.print("Digite o nome da "+(i+1)+ "o. pessoa ");
            nome[i]=sc.nextLine();
            System.out.print("Digite o idade da "+(i+1)+ "o. pessoa ");
            idades[i]=sc.nextInt();
            System.out.print("Digite a estatura da "+(i+1)+ "o. pessoa ");
            estatura[i]=sc.nextDouble();
            System.out.print("Digite o peso da "+(i+1)+ "o. pessoa ");
            peso[i]=sc.nextDouble();
            sc.nextLine();

            imc[i]= peso[i]/estatura[i]*estatura[i];
            
        }

        

        System.out.print("Valores Digitados: ");
        for (int i=0;i<=4;i++){
            System.out.print("Nome: \n  "+nome[i]+"\n idade: "+ idades[i]+"\n Estatura: "+estatura[i]+"\n Peso: "+peso[i]+ "\n IMC: "+imc[i]+"\n" );
        }
    }
}