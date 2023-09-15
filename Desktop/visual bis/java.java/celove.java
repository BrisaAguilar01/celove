import java.util.Scanner;

public class celove {


    public static void main (String[] args) {
        String nome;

        try (Scanner nomeUsuario = new Scanner (System.in)) {
            System.out.println("Bem vindo ao Celove! Qual o nome da sua celete? ");
            nome = nomeUsuario.nextLine();

            int opcao;
            System.out.println("Olá " + nome +"! Você já conhece o nosso sistema?\n");
            System.out.print("1: Não\n");
            System.out.print("2: Sim\n");
            opcao = nomeUsuario.nextInt();

            if (opcao == 1) {
                do {
                System.out.print("Então vamos lá...\n");
                 System.out.print("Para selecionar uma resposta, você digita o número que irá aparecer no início (como você já fez até aqui)\n");
                 System.out.print("Eu irei apresentar os paqueras e você irá escolher o que mais gostar, a partir disso será encaminhada para uma rota com o escolhido\n");
                 System.out.print("Cada rota contém dois finais, que será determinado pelas suas escolhas!\n");
                 System.out.println("Você entendeu ou quer que eu desenhe?\n");

                 System.out.print("Opção 1: Não entendi\n");
                 System.out.print("Opção 2: Sim, eu entendi\n");
                 opcao = nomeUsuario.nextInt();

                } while (opcao == 1 );

            } else {
                System.out.print("Ufa...Não terei que explicar novamente!\n"); }

                do {
                System.out.print("\nFinalmente, vamos para os paqueras!\n");
                System.out.print("O primeiro paquera chama-se Paulo. Ele é um não-binário gênero fluído, bissexual. É um amante de gatos, música melancólica e metal e é um gamer. ");
                System.out.print("Ele é calmo, carinhoso e reservado. Ele acha difícil se abrir e por isso pode ser mal interpretado. (Opção 1)\n");

                System.out.print("\nO segundo paquera é o Breno. Ele é um homem cisgênero e pansexual. Gosta de rap, jogar basquete e cachorros. ");
                System.out.print("Ele é inteirado em políticas sociais e domina o assunto.");
                System.out.print("Ele é brincalhão, extrovertido e galanteador. Por suas fortes convicções, pode ser um pouco insensível. (Opção 2)\n ");

                opcao = nomeUsuario.nextInt();
            
                switch (opcao) {
                    case 1:
                     System.out.print("\nVocê escolheu o Paulo.\n");
                     System.out.print("\n1. Finalizar o episódio e começar o próximo ");
                     opcao = nomeUsuario.nextInt();
                    
                     System.out.print("\nElsa: Bem vida ao Instituto Vanguarda, " + nome + "! Eu me chamo Elsa e sou a vice-diretora.");
                     System.out.print("\ninfelizmente, como você chegou agora, só temos vaga no clube de música. Vou te acompanhar até lá!");
                     System.out.println("\n1. (Acompanhei ela até a sala 12)\n");
                     opcao = nomeUsuario.nextInt();

                     System.out.println("\n1. (A Elsa chamou o líder do clube - que, por sinal, era bem bonitinho - e pediu para que me introduzisse ao clube.) ");
                     opcao = nomeUsuario.nextInt();

                     System.out.print("\n???: Gente, atenção aqui por favor...");
                     System.out.println("\n1. (Ele parecia tímido enquanto tentava chamar a atenção das pessoas no clube.)");
                     opcao = nomeUsuario.nextInt();

                     System.out.print("\n???: Essa é a aluna nova, se vocês puderem prestar atenção na apresentação dela...");
                     System.out.println("\n1. (Me apresentei tranquilamente, pois já estou acostumada a falar em público.)");
                     System.out.println("\n2.(Senti meu coração acelerar, falar em público não é o meu forte.)");
                     opcao = nomeUsuario.nextInt();

                     if (opcao == 1) {

                        System.out.println("\n 1. Oi gente, meu nome é " + nome + "e não tenho muita experiência com instrumentos.");
                        opcao = nomeUsuario.nextInt();

                        System.out.print("\n???: Isso está ótimo, seja bem vinda ao clube!");
                        System.out.println("\n1. (Me aproximei para conversar com o líder).");

                        } else {
                            System.out.print("\n 1. Oi... Meu nome é... " + nome + ", e...");
                            System.out.println("\n1. (Juntei minhas mãos e desviei o olhar para o líder, procurando alguma ajuda.)");
                            opcao = nomeUsuario.nextInt();

                            System.out.print("\n???: Tudo bem " + nome + "! não precisa dizer mais que isso, seja bem vinda!" );
                            System.out.println("\n1. (Concordei e me aproximei dele.)");
                            opcao = nomeUsuario.nextInt();

                        }

                        System.out.print("\n ???: Bom, meu nome é Paulo. O que você espera do clube?");
                        System.out.println("\n1. Eu não sei, não tive opção.");
                        System.out.println("\n2. Não tenho uma expectativa, mas estou disposta a aprender algo.");
                        opcao = nomeUsuario.nextInt();


                        if (opcao == 1) {
                        System.out.print("\n Paulo: Hm, é uma pena, mas você tem que fazer algo, clube não é aula vaga.");
                        System.out.println("\n1. (Nossa, mas pra que essa grosseria... )");
                        System.out.println("\n2. (Fico constrangida com sua resposta e encaro meus pés...)");
                        opcao = nomeUsuario.nextInt();
                        } else {

                            System.out.print("\nIsso é bom, nós não temos muitas opções porque a escola não fornece, mas alguns ainda trazem os que tem em casa.");
                            System.out.println("\n1. (Próximo).");
                            opcao = nomeUsuario.nextInt();
                        }
  
                        System.out.print("\nPaulo: A gente tem alguns instrumentos disponíveis. Como flauta, pandeiro e bumbo.");
                        System.out.println("\n1. Eu quero a flauta!");
                        System.out.println("\n2. Eu quero o pandeiro!");
                        System.out.println("\n3. Eu quero o bumbo!");
                        opcao = nomeUsuario.nextInt(); 

                        switch (opcao) {

                            case 1:

                            System.out.print("\nPaulo: Eu não recomendaria você escolher um instrumento que passa por várias bocas...");
                            System.out.println("\n1. (Eca.)");
                            System.out.println("\n2. (Oba.)");
                            opcao = nomeUsuario.nextInt();
                         

                            break;
 
                            case 2:
                        
                            System.out.print("\nPaulo: ");
                            System.out.println("\n1. ");
                            System.out.println("\n2. ");
                            System.out.println("\n3. ");
                            opcao = nomeUsuario.nextInt();

                            break;

                            case 3:

                            System.out.print("\nPaulo: ");
                            System.out.println("\n1. ");
                            System.out.println("\n2. ");
                            System.out.println("\n3. ");
                            opcao = nomeUsuario.nextInt();

                            break;


                            
                        } 
                        break;
                    case 2:
                     System.out.print("\nVocê escolheu o Breno.\n");
                     break;
                    
                    default:
                     System.out.print("\nVocê não serve para o amor... Você está solteira. Tente novamente.\n");
                     break;

                } } while (opcao < 1 || opcao > 2);
        }
      }
     }
    
        