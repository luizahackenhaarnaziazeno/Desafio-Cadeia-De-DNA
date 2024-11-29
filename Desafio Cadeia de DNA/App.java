import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("\nMenu:");
            System.out.println("1. O MAIS RÁPIDO");
            System.out.println("2. O 2 MAIS RÁPIDO");
            System.out.println("3. O 3 MAIS RÁPIDO");
            System.out.println("4. O 2 MAIS DEMORADO");
            System.out.println("5. O PIOR DE TODOS");
            System.out.println("6. ENCERRAR O PROGRAMA");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // --MAIS RÁPIDO--
                    IProcessaDNA pDNA2 = new ProcessaDNA_LinkedListGet();
                    pDNA2.carregaDados("caso1.txt");
                    long t25 = System.currentTimeMillis();
                    String resp12 = pDNA2.degradaDNA();
                    long t26 = System.currentTimeMillis();
                    long tp12 = (t25 - t26);
                    System.out.println("");
                    System.out.println("A execução com LinkedListGet no caso 1 têm como:");
                    System.out.println("Resultado: " + resp12);
                    System.out.println("Tempo de processamento: " + tp12 + " milisegundos");
                    // Resposta: -1 milisegundos

                    pDNA2.carregaDados("caso2.txt");
                    long t27 = System.currentTimeMillis();
                    String resp13 = pDNA2.degradaDNA();
                    long t28 = System.currentTimeMillis();
                    long tp13 = (t27 - t28);
                    System.out.println("");
                    System.out.println("A execução com LinkedListGet no caso 2 têm como:");
                    System.out.println("Resultado: " + resp13);
                    System.out.println("Tempo de processamento: " + tp13 + " milisegundos");
                    // Resposta: 0 milisegundos

                    pDNA2.carregaDados("caso100.txt");
                    long t29 = System.currentTimeMillis();
                    String resp14 = pDNA2.degradaDNA();
                    long t30 = System.currentTimeMillis();
                    long tp14 = (t29 - t30);
                    System.out.println("");
                    System.out.println("A execução com LinkedListGet no caso 100 têm como:");
                    System.out.println("Resultado: " + resp14);
                    System.out.println("Tempo de processamento: " + tp14 + " milisegundos");
                    // Resposta: -36 milisegundos

                    pDNA2.carregaDados("caso200.txt");
                    long t31 = System.currentTimeMillis();
                    String resp15 = pDNA2.degradaDNA();
                    long t32 = System.currentTimeMillis();
                    long tp15 = (t31 - t32);
                    System.out.println("");
                    System.out.println("A execução com LinkedListGet no caso 200 têm como:");
                    System.out.println("Resultado: " + resp15);
                    System.out.println("Tempo de processamento: " + tp15 + " milisegundos");
                    // Resposta: -20 milisegundos

                    pDNA2.carregaDados("caso500.txt");
                    long t33 = System.currentTimeMillis();
                    String resp16 = pDNA2.degradaDNA();
                    long t34 = System.currentTimeMillis();
                    long tp16 = (t33 - t34);
                    System.out.println("");
                    System.out.println("A execução com Array List no caso 500 têm como:");
                    System.out.println("Resultado: " + resp16);
                    System.out.println("Tempo de processamento: " + tp16 + " milisegundos");
                    // Resposta: -65 milisegundos

                    pDNA2.carregaDados("caso1000.txt");
                    long t35 = System.currentTimeMillis();
                    String resp17 = pDNA2.degradaDNA();
                    long t36 = System.currentTimeMillis();
                    long tp17 = (t35 - t36);
                    System.out.println("");
                    System.out.println("A execução com LinkedListGet no caso 1000 têm como:");
                    System.out.println("Resultado: " + resp17);
                    System.out.println("Tempo de processamento: " + tp17 + " milisegundos");
                    // Resposta: -50 milisegundos

                    break;

                case 2:
                    // --2 MAIS RÁPIDO--
                    IProcessaDNA pDNA4 = new ProcessaDNA_ArrayListSemRemocao();

                    pDNA4.carregaDados("caso1.txt");
                    long t49 = System.currentTimeMillis();
                    String resp24 = pDNA4.degradaDNA();
                    long t50 = System.currentTimeMillis();
                    long tp24 = (t49 - t50);
                    System.out.println("");
                    System.out.println("A execução com ArrayListSemRemocao no caso 1 têm como:");
                    System.out.println("Resultado: " + resp24);
                    System.out.println("Tempo de processamento: " + tp24 + " milisegundos");
                    // Resposta: 0 milisegundos

                    pDNA4.carregaDados("caso2.txt");
                    long t51 = System.currentTimeMillis();
                    String resp25 = pDNA4.degradaDNA();
                    long t52 = System.currentTimeMillis();
                    long tp25 = (t51 - t52);
                    System.out.println("");
                    System.out.println("A execução com ArrayListSemRemocao no caso 2 têm como:");
                    System.out.println("Resultado: " + resp25);
                    System.out.println("Tempo de processamento: " + tp25 + " milisegundos");
                    // Resposta: 0 milisegundos

                    pDNA4.carregaDados("caso100.txt");
                    long t53 = System.currentTimeMillis();
                    String resp26 = pDNA4.degradaDNA();
                    long t54 = System.currentTimeMillis();
                    long tp26 = (t53 - t54);
                    System.out.println("");
                    System.out.println("A execução com ArrayListSemRemocao no caso 100 têm como:");
                    System.out.println("Resultado: " + resp26);
                    System.out.println("Tempo de processamento: " + tp26 + " milisegundos");
                    // Resposta: -499 milisegundos

                    pDNA4.carregaDados("caso200.txt");
                    long t55 = System.currentTimeMillis();
                    String resp27 = pDNA4.degradaDNA();
                    long t56 = System.currentTimeMillis();
                    long tp27 = (t55 - t56);
                    System.out.println("");
                    System.out.println("A execução com ArrayListSemRemocao no caso 200 têm como:");
                    System.out.println("Resultado: " + resp27);
                    System.out.println("Tempo de processamento: " + tp27 + " milisegundos");
                    // Resposta: milisegundos

                    pDNA4.carregaDados("caso500.txt");
                    long t57 = System.currentTimeMillis();
                    String resp28 = pDNA4.degradaDNA();
                    long t58 = System.currentTimeMillis();
                    long tp28 = (t57 - t58);
                    System.out.println("");
                    System.out.println("A execução com ArrayListSemRemocao no caso 500 têm como:");
                    System.out.println("Resultado: " + resp28);
                    System.out.println("Tempo de processamento: " + tp28 + " milisegundos");
                    // Resposta: -1665 milisegundos

                    pDNA4.carregaDados("caso1000.txt");
                    long t59 = System.currentTimeMillis();
                    String resp29 = pDNA4.degradaDNA();
                    long t60 = System.currentTimeMillis();
                    long tp29 = (t59 - t60);
                    System.out.println("");
                    System.out.println("A execução com ArrayListSemRemocao no caso 1000 têm como:");
                    System.out.println("Resultado: " + resp29);
                    System.out.println("Tempo de processamento: " + tp29 + " milisegundos");
                    // Resposta: -58920 milisegundos

                    break;
                case 3:

                    // --3 MAIS RÁPIDO--
                    IProcessaDNA pDNA1 = new ProcessaDNA_ArrayList();

                    pDNA1.carregaDados("caso1.txt");
                    long t13 = System.currentTimeMillis();
                    String resp6 = pDNA1.degradaDNA();
                    long t14 = System.currentTimeMillis();
                    long tp6 = (t13 - t14);
                    System.out.println("");
                    System.out.println("A execução com Array List no caso 1 têm como:");
                    System.out.println("Resultado: " + resp6);
                    System.out.println("Tempo de processamento: " + tp6 + " milisegundos");
                    // Resposta: 0 milisegundos

                    pDNA1.carregaDados("caso2.txt");
                    long t15 = System.currentTimeMillis();
                    String resp7 = pDNA1.degradaDNA();
                    long t16 = System.currentTimeMillis();
                    long tp7 = (t15 - t16);
                    System.out.println("");
                    System.out.println("A execução com Array List no caso 2 têm como:");
                    System.out.println("Resultado: " + resp7);
                    System.out.println("Tempo de processamento: " + tp7 + " milisegundos");
                    // Resposta: 0 milisegundos

                    pDNA1.carregaDados("caso100.txt");
                    long t17 = System.currentTimeMillis();
                    String resp8 = pDNA1.degradaDNA();
                    long t18 = System.currentTimeMillis();
                    long tp8 = (t17 - t18);
                    System.out.println("");
                    System.out.println("A execução com Strings no caso 100 têm como:");
                    System.out.println("Resultado: " + resp8);
                    System.out.println("Tempo de processamento: " + tp8 + " milisegundos");
                    // Resposta: -1063 milisegundos

                    pDNA1.carregaDados("caso200.txt");
                    long t19 = System.currentTimeMillis();
                    String resp9 = pDNA1.degradaDNA();
                    long t20 = System.currentTimeMillis();
                    long tp9 = (t19 - t20);
                    System.out.println("");
                    System.out.println("A execução com Array List no caso 200 têm como:");
                    System.out.println("Resultado: " + resp9);
                    System.out.println("Tempo de processamento: " + tp9 + " milisegundos");
                    // Resposta: -4293 milisegundos

                    pDNA1.carregaDados("caso500.txt");
                    long t21 = System.currentTimeMillis();
                    String resp10 = pDNA1.degradaDNA();
                    long t22 = System.currentTimeMillis();
                    long tp10 = (t21 - t22);
                    System.out.println("");
                    System.out.println("A execução com Array List no caso 500 têm como:");
                    System.out.println("Resultado: " + resp10);
                    System.out.println("Tempo de processamento: " + tp10 + " milisegundos");
                    // Resposta: -33846 milisegundos

                    pDNA1.carregaDados("caso1000.txt");
                    long t23 = System.currentTimeMillis();
                    String resp11 = pDNA1.degradaDNA();
                    long t24 = System.currentTimeMillis();
                    long tp11 = (t23 - t24);
                    System.out.println("");
                    System.out.println("A execução com Array List no caso 1000 têm como:");
                    System.out.println("Resultado: " + resp11);
                    System.out.println("Tempo de processamento: " + tp11 + " milisegundos");
                    // Resposta: -154226 milisegundos

                    break;
                case 4:
                    // -- O 2 MAIS DEMORADO--
                    IProcessaDNA pDNA = new ProcessaDNA_String();

                    pDNA.carregaDados("caso1.txt");
                    long t1 = System.currentTimeMillis();
                    String resp = pDNA.degradaDNA();
                    long t2 = System.currentTimeMillis();
                    long tp = (t2 - t1);
                    System.out.println("");
                    System.out.println("A execução com Strings no caso 1 têm como:");
                    System.out.println("Resultado: " + resp);
                    System.out.println("Tempo de processamento: " + tp + " milisegundos");
                    // Resposta: 9 milisegundos

                    pDNA.carregaDados("caso2.txt");
                    long t3 = System.currentTimeMillis();
                    String resp1 = pDNA.degradaDNA();
                    long t4 = System.currentTimeMillis();
                    long tp1 = (t3 - t4);
                    System.out.println("");
                    System.out.println("A execução com Strings no caso 2 têm como:");
                    System.out.println("Resultado: " + resp1);
                    System.out.println("Tempo de processamento: " + tp1 + " milisegundos");
                    // Resposta: 0 milisegundos

                    pDNA.carregaDados("caso100.txt");
                    long t5 = System.currentTimeMillis();
                    String resp2 = pDNA.degradaDNA();
                    long t6 = System.currentTimeMillis();
                    long tp2 = (t5 - t6);
                    System.out.println("");
                    System.out.println("A execução com Strings no caso 100 têm como:");
                    System.out.println("Resultado: " + resp2);
                    System.out.println("Tempo de processamento: " + tp2 + " milisegundos");
                    // Resposta: -1740 milisegundos

                    pDNA.carregaDados("caso200.txt");
                    long t7 = System.currentTimeMillis();
                    String resp3 = pDNA.degradaDNA();
                    long t8 = System.currentTimeMillis();
                    long tp3 = (t7 - t8);
                    System.out.println("");
                    System.out.println("A execução com Strings no caso 200 têm como:");
                    System.out.println("Resultado: " + resp3);
                    System.out.println("Tempo de processamento: " + tp3 + " milisegundos");
                    // Resposta: -6048 milisegundos

                    pDNA.carregaDados("caso500.txt");
                    long t9 = System.currentTimeMillis();
                    String resp4 = pDNA.degradaDNA();
                    long t10 = System.currentTimeMillis();
                    long tp4 = (t9 - t10);
                    System.out.println("");
                    System.out.println("A execução com Strings no caso 500 têm como:");
                    System.out.println("Resultado: " + resp4);
                    System.out.println("Tempo de processamento: " + tp4 + " milisegundos");
                    // Resposta: -38808 milisegundos

                    pDNA.carregaDados("caso1000.txt");
                    long t11 = System.currentTimeMillis();
                    String resp5 = pDNA.degradaDNA();
                    long t12 = System.currentTimeMillis();
                    long tp5 = (t11 - t12);
                    System.out.println("");
                    System.out.println("A execução com Strings no caso 1000 têm como:");
                    System.out.println("Resultado: " + resp5);
                    System.out.println("Tempo de processamento: " + tp5 + " milisegundos");
                    // Resposta: -166337 milisegundos

                    break;

                case 5:
                    // --PIOR DE TODOS--
                    // Não consegui ter uma resposta de milisegundos
                    IProcessaDNA pDNA3 = new ProcessaDNA_LinkedListIterator();
                    pDNA3.carregaDados("caso1.txt");
                    long t37 = System.currentTimeMillis();
                    String resp18 = pDNA3.degradaDNA();
                    long t38 = System.currentTimeMillis();
                    long tp18 = (t37 - t38);
                    System.out.println("");
                    System.out.println("A execução com LinkedListIterator no caso 1 têm como:");
                    System.out.println("Resultado: " + resp18);
                    System.out.println("Tempo de processamento: " + tp18 + " milisegundos");
                    // Resposta: milisegundos

                    pDNA3.carregaDados("caso2.txt");
                    long t39 = System.currentTimeMillis();
                    String resp19 = pDNA3.degradaDNA();
                    long t40 = System.currentTimeMillis();
                    long tp19 = (t39 - t40);
                    System.out.println("");
                    System.out.println("A execução com LinkedListIterator no caso 2 têm como:");
                    System.out.println("Resultado: " + resp19);
                    System.out.println("Tempo de processamento: " + tp19 + " milisegundos");
                    // Resposta: milisegundos

                    pDNA3.carregaDados("caso100.txt");
                    long t41 = System.currentTimeMillis();
                    String resp20 = pDNA3.degradaDNA();
                    long t42 = System.currentTimeMillis();
                    long tp20 = (t41 - t42);
                    System.out.println("");
                    System.out.println("A execução com LinkedListIterator no caso 100 têm como:");
                    System.out.println("Resultado: " + resp20);
                    System.out.println("Tempo de processamento: " + tp20 + " milisegundos");
                    // Resposta: milisegundos

                    pDNA3.carregaDados("caso200.txt");
                    long t43 = System.currentTimeMillis();
                    String resp21 = pDNA3.degradaDNA();
                    long t44 = System.currentTimeMillis();
                    long tp21 = (t43 - t44);
                    System.out.println("");
                    System.out.println("A execução com LinkedListIterator no caso 200 têm como:");
                    System.out.println("Resultado: " + resp21);
                    System.out.println("Tempo de processamento: " + tp21 + " milisegundos");
                    // Resposta: milisegundos

                    pDNA3.carregaDados("caso500.txt");
                    long t45 = System.currentTimeMillis();
                    String resp22 = pDNA3.degradaDNA();
                    long t46 = System.currentTimeMillis();
                    long tp22 = (t45 - t46);
                    System.out.println("");
                    System.out.println("A execução com LinkedListIterator no caso 500 têm como:");
                    System.out.println("Resultado: " + resp22);
                    System.out.println("Tempo de processamento: " + tp22 + " milisegundos");
                    // Resposta: milisegundos

                    pDNA3.carregaDados("caso1000.txt");
                    long t47 = System.currentTimeMillis();
                    String resp23 = pDNA3.degradaDNA();
                    long t48 = System.currentTimeMillis();
                    long tp23 = (t47 - t48);
                    System.out.println("");
                    System.out.println("A execução com LinkedListIterator no caso 1000 têm como:");
                    System.out.println("Resultado: " + resp23);
                    System.out.println("Tempo de processamento: " + tp23 + " milisegundos");
                    // Resposta: milisegundos

                    break;
                    
                    case 6:
                    sair = true;
                    System.out.println("Saindo do programa...");
                    break;
                    default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");

            }
        }
    }
}
