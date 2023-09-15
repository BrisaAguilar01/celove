
   import java.util.Scanner;

public class celoverealoficial {
    
        public static void main (String[] args) {
        String nome;

        Scanner nomeUsuario = new Scanner (System.in);
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
             System.out.print("Eu irei apresentar os paqueras e você irá escolher o que mais gostar, a partir disso será encaminhada para uma rota com o escolhido.\n");
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
            System.out.print("\nO primeiro paquera chama-se Paulo. Ele é um não-binário gênero fluído, bissexual. É um amante de gatos, música melancólica e metal e é um gamer. ");
            System.out.print("Ele é calmo, carinhoso e reservado. Ele acha difícil se abrir e por isso pode ser mal interpretado. (Opção 1)\n");

            System.out.print("\nO segundo paquera é o Breno. Ele é um homem cisgênero e pansexual. Gosta de rap, jogar basquete e cachorros. ");
            System.out.print("Ele é inteirado em políticas sociais e domina o assunto.");
            System.out.print("Ele é brincalhão, extrovertido e galanteador. Por suas fortes convicções, pode ser um pouco insensível. (Opção 2)\n ");

            opcao = nomeUsuario.nextInt();
        
            switch (opcao) {
                case 1:
                 System.out.print("\nVocê escolheu o Paulo.\n");
                 System.out.print("\n1. Finalizar o episódio e começar o próximo\n");
                 opcao = nomeUsuario.nextInt();
                
                 System.out.print("\nElsa: Bem vinda ao Instituto Vanguarda, " + nome + "! Eu me chamo Elsa e sou a vice-diretora.");
                 System.out.print("\ninfelizmente, como você chegou agora, só temos vaga no clube de música. Vou te acompanhar até lá!");
                 System.out.println("\n1. (Acompanhei ela até a sala 12)");
                 opcao = nomeUsuario.nextInt();

                 System.out.println("\n1. (A Elsa chamou o líder do clube e pediu para que me introduzisse ao clube.) ");
                 opcao = nomeUsuario.nextInt();

                 System.out.print("\n???: Gente, atenção aqui por favor...");
                 System.out.println("\n1. (Ele parecia tímido enquanto tentava chamar a atenção das pessoas no clube.)");
                 opcao = nomeUsuario.nextInt();

                 System.out.print("\n???: Essa é a aluna nova, se vocês puderem prestar atenção na apresentação dela, por favor...");
                 System.out.println("\n1. (Me apresentei tranquilamente, já estou acostumada a falar em público.)");
                 System.out.println("\n2. (Senti meu coração batendo forte, não gosto de falar em público) ");
                 opcao = nomeUsuario.nextInt();

                 if (opcao == 1) {
                    
                  System.out.println("1. Olá. Eu me chamo " + nome + "! Ainda não sei tocar nenhum instrumento, mas adoraria aprender com vocês!\n");
                  opcao = nomeUsuario.nextInt();

                  System.out.print("???: Bem-vinda, " + nome + ". Meu nome é Paulo, eu sou o líder do clube. Se quiser aprender a tocar guitarra, pode falar comigo.\n");
                  System.out.println("1. Obrigada. (Dei um sorriso e fui me sentar ao lado dele para pedir alguma ajuda.)\n");
                  opcao = nomeUsuario.nextInt();

                  System.out.print("()");

                } else {

                    System.out.println("\n1. Oi... ehm, eu sou a " + nome + ". E-eu ainda não sei tocar nada, mas é... (Eu não sei o que dizer...");
                    System.out.println("Olhei para o rosto do garoto em busca de algum auxílio e em seguida encarei meus pés.)");
                    opcao = nomeUsuario.nextInt();

                    System.out.print("\n???: É... Você pode sentar comigo, se você quiser! Eu me chamo Paulo posso te ajudar. Se você quiser tocar guitarra, pode falar comigo.");
                    System.out.println("\n1. (Olhei para ele e segui sua sugestão, me sentando ao seu lado.)");
                    opcao = nomeUsuario.nextInt();
                }
                System.out.print("\nPaulo: Então " + nome + "...A escola não tem instrumentros e por isso nós trazemos os nossos. Por conta disso não temos muita opção");
                System.out.print("\nMas talvez você se interesse por algum.");
                System.out.println("\n1. Não tem problema, você pode me mostrar alguma coisa.");
                System.out.println("\n2. Isso é obrigatório?");
                opcao = nomeUsuario.nextInt();

                if  (opcao == 2) {
                    System.out.print("\nPaulo: É claro, o clube não é aula livre você tem que fazer alguma coisa!");
                    System.out.println("\n1. (Nossa...Que lapada seca, perguntei na moral...)");
                    opcao = nomeUsuario.nextInt();

                    System.out.println("\n1. Então quais são as opções?");
                    opcao = nomeUsuario.nextInt();

                } else {
                    System.out.print("\nPaulo: Que bom que você se interessou!");
                    System.out.print("\n1. (Sorri) Quais são as opções?");
                    opcao = nomeUsuario.nextInt();
                }
                   System.out.print("\nPaulo: Temos flauta, pandeiro e bumbo.\n");
                   System.out.println("\n1. Eu quero a flauta!");
                   opcao = nomeUsuario.nextInt();

                   System.out.print("\nPaulo: Eu aconselharia a não pegar algo que passa na boca de todos...\n");
                   System.out.println("\n1. Eca... Então eu escolho... ");
                   opcao = nomeUsuario.nextInt();

                    System.out.println("\n1. Pandeiro");
                    System.out.println("\n2. Bumbo");
                    System.out.println("\n3. Você disse que tocava guitarra, pode me ensinar?");
                   opcao = nomeUsuario.nextInt();

                   switch (opcao) {
                    case 1:
                    System.out.println("\n1. Eu quero o pandeiro.\n");
                    System.out.print("Paulo: Ótimo! Pode ir falar com o Diogo. Ele está ali no canto da sala.(Ele apontou para um garoto que estava conversando com algumas pessoas e sorrindo.)\n");
                    System.out.println("\n1.(Fui até lá e esperei, não queria interromper a conversa.) ");
                    opcao = nomeUsuario.nextInt();

                    System.out.print("\nDiogo: E aí, menina! Tranquilo? (Ele falou, ainda sorrindo, após o grupo se dissipar)");
                    System.out.println("\n1. Tudo sim, e você? Eu queria aprender a tocar pandeiro e me disse para falar com você! ");
                    System.out.println("2. Menina? Meu nome é " + nome + "!\n");
                    opcao = nomeUsuario.nextInt();

                    if (opcao == 1) {

                    System.out.print("\nDiogo: Que massa! Você sabe alguma coisa? ");
                    System.out.println("1. Bom... Meu tio tocava pandeiro nos churrascos, mas nunca aprendi, apesar de ter tentado.\n");
                    opcao = nomeUsuario.nextInt();

                    System.out.print("\nDiogo: Hoje é seu dia de sorte! Eu sou o melhor professor dessa escola! (Ele brincou, sorrindo.)");
                    System.out.println("\n1. (Ele de fato era um ótimo professor, eu entendi algumas coisas)");
                    opcao = nomeUsuario.nextInt();

                    
                    System.out.print("\nParabéns! Você ganhou a imagem!");
                    opcao = nomeUsuario.nextInt();


                    } else {

                        System.out.print("\nDiogo: UI, tá bom! Desculpa dona menina!");
                        System.out.println("\n1. (Revirei os olhos, já de saco cheio desse mala.)");
                        System.out.println("\n2. (Ignorei o debochh de milhoes do gato pq fui muleka)");
                        opcao = nomeUsuario.nextInt();

                        System.out.println("\n1. E você vai ensinar ou não, dono menino?");
                        opcao = nomeUsuario.nextInt();

                        System.out.print("\nDiogo: Apesar da sua atitude, eu sou um cavalheiro, então vou sim.");
                        System.out.println("\n1. (Ficou um climão estranho, mas consegui aprender um pouco.)");

                        System.out.print("\nOh não! Você perdeu a imagem!");
                        opcao = nomeUsuario.nextInt();
                    
                    }


                    case 2:
                    System.out.println("\n2. Eu escolho o Bumbo.");
                    System.out.print("\nPaulo: Legal! Pode ir falar com a Kiara. Ela está ali. (Ele apontou para uma garota que estava ajeitando o bumbo.)");
                    System.out.println("\n1.(Cheguei perto de Kiara)");
                    opcao = nomeUsuario.nextInt();

                    System.out.print("\nKiara: Olá! Seu nome é " + nome + " certo? Tudo na paz?");
                    System.out.println("\n1. To bem e você? Eu queria aprender a tocar bumbo e o Paulo disse que eu poderia falar com você!");
                    opcao = nomeUsuario.nextInt();

                    System.out.print("\nKiara: Que daora!! Eu já te ajudo a colocar o bumbo.");
                    System.out.println("\n1. (Tentei pegar o bumbo que estava no chão)");
                    System.out.println("\n2. (Esperei Kiara me ajudar)");
                    opcao = nomeUsuario.nextInt();

                    if (opcao == 1) {
                    System.out.print("\n1. (Quase derrubei o instrumento, mas Kiara pegou bem na hora.)");
                    System.out.print("\nKiara: Opa! Toma cuidado que ele parece leve, mas é pesadinho (Ela deu uma risadinha, me ajudando a levantar o bumbo)");
                    opcao = nomeUsuario.nextInt();

                    System.out.print("\nParabéns! Você ganhou a imagem!");
                    opcao = nomeUsuario.nextInt();

                    } else {

                    System.out.print("\n1. (Fiquei olhando para o bumbo e para ela, enquanto esperava)");
                    opcao = nomeUsuario.nextInt(); 
                    }

                    System.out.print("\n1. (Assim que ela terminou, me ajudou a colocar o bumbo.)");
                    opcao = nomeUsuario.nextInt(); 

                    System.out.print("\n1. (Kiara me ensinou alguns ritmos e até que ela é uma boa professora.)");
                    opcao = nomeUsuario.nextInt();

                    System.out.print("\nOh não! Você perdeu a imagem!");
                    opcao = nomeUsuario.nextInt();
                    break;



                    case 3:

                    System.out.print("\nPaulo: Que legal! Você tem interesse?");
                    System.out.println("\n1. Se eu perguntei, né!");
                    System.out.println("\n2. Sim, eu adoraria aprender!");
                    opcao = nomeUsuario.nextInt();

                    if (opcao == 1) {

                        System.out.print("\nPaulo: Então eu não empresto a minha guitarra");
                        System.out.println("\n1. Mas você disse que me ensinaria.");
                        opcao = nomeUsuario.nextInt();

                        System.out.print("\nPaulo: Só que agora eu não posso, tenho mais coisa pra fazer!");
                        System.out.println("\n1. Ah ta...");
                        opcao = nomeUsuario.nextInt();

                        System.out.println("\n1. Fui me sentar no canto");
                        opcao = nomeUsuario.nextInt();

                        System.out.print("\nOh não! Você perdeu a imagem!");
                        opcao = nomeUsuario.nextInt();

                    } else {

                        System.out.print("\nPaulo: Fico feliz que você tenha interesse, guitarra é uma das minhas paixões!");
                        System.out.println("\n1. Que legal! quero ver você tocando algum dia!");
                        opcao = nomeUsuario.nextInt();

                        System.out.print("\n1. (Vi suas bochechas corarem discretamente e ele soltou uma risadinha tímida.)");
                        opcao = nomeUsuario.nextInt();

                        System.out.print("\n1. (E enfim começamos a tocar.)");
                        opcao = nomeUsuario.nextInt();

                        System.out.print("\n1. (Ele tocou os primeiros acordes que pareciam simples, ele parecia concentrado)");
                        opcao = nomeUsuario.nextInt();

                        System.out.print("\n1. (Ele me passou a guitarra com cuidado e me ajudou a coloca-lá)");
                        opcao = nomeUsuario.nextInt();

                        System.out.print("\n1. (Tentei tocar seguindo os acordes que ele havia me mostrado, mas alguma coisa deu errado e ele deu uma risadinha)");
                        opcao = nomeUsuario.nextInt();

                        System.out.print("\nPaulo: " + nome + " você errou a corda!");
                        System.out.println("\n(Ele segurou minha mão, quebrando a distância entre nós e a ajeitou na guitarra.)");
                        opcao = nomeUsuario.nextInt();

                        System.out.print("\n1. (nós tocamos até o sinal bater, indicando o intervalo)");
                        opcao = nomeUsuario.nextInt();

                        System.out.print("\nParabéns! Você ganhou a imagem!");
                        opcao = nomeUsuario.nextInt();
                        
                    }
                    break;
                }
                    System.out.print("\nFim do primeiro episódio");
                    opcao = nomeUsuario.nextInt();



                break;
                case 2:
                 System.out.print("\nVocê escolheu o Breno.\n");
                 System.out.print("1. Finalizar o episódio e começar o outro.");
                 opcao = nomeUsuario.nextInt();

                 System.out.print("\nElsa: Bem vinda ao Instituto Vanguarda, " + nome + "! Eu me chamo Elsa e sou a vice-diretora.");
                 System.out.print("\nO sinal já bateu, vou te acompanhar até sua sala de aula.");
                 System.out.println("\n1. (Ela me acompanhou até a sala 24.)");
                 opcao = nomeUsuario.nextInt();

                 System.out.println("\nElsa chamou a líder de classe, pois o professor não estava na sala. Com a chegada da vice-diretora, a sala ficou em silêncio. ");
                 System.out.println("\n1. (A Elsa  me apresentou para a líder e a pediu para que me introduzisse na sala e saiu da sala.)");
                 opcao = nomeUsuario.nextInt();


                 System.out.print("\n???: Oi! Meu nome é Kiara! Tudo bem? Você vai querer se apresentar?");
                 System.out.println("\n1. Sim! Pode deixar.");
                 System.out.println("\n2. N-não... Você pode me apresentar?");
                 opcao = nomeUsuario.nextInt();

                 if (opcao == 1){

                 System.out.print("\nKiara: Ok!");
                 System.out.println("\n1. (Ela chamou a atenção da sala para ela e indicou para que eu me apresentasse)");
                 opcao = nomeUsuario.nextInt();
                 
                 System.out.println("\n1. Oi, gente! Boa tarde! Meu nome é " + nome + "! Espero me enturmar.");
                 opcao = nomeUsuario.nextInt();

                 System.out.print("\nKiara: Beleza, " + nome + "! Pode se sentar do meu lado.");
                 System.out.println("\n1. (Segui sua sugestâo e me sentei ao seu lado.)");
                 opcao = nomeUsuario.nextInt();

                 } else {

                    System.out.print("\nKiara: Tranquilo! Eu te apresento então, pode ser?");
                    System.out.println("\n1. Ok! Obrigada. (Ela chamou a atenção da sala para ela.)");
                    opcao = nomeUsuario.nextInt();

                    System.out.print("\nKiara: Gente! Essa daqui é a " + nome + ". Ela é nova, a recebam bem!");
                    System.out.println("\n1. (Olhei em volta e acenei para a sala, timída)");
                    opcao = nomeUsuario.nextInt();

                    System.out.print("\nKiara: Pode sentar ali do meu lado.");
                    System.out.println("\n1. (Segui sua instrução e fui me sentar na cadeira vazia.)");
                    opcao = nomeUsuario.nextInt();
                 }

                 System.out.println("\n1. (O professor chegou e a aula passou rápido.)");
                 opcao = nomeUsuario.nextInt();

                 System.out.println("\n1. (A Kiara conversou algumas vezes comigo durante a aula.)");
                 opcao = nomeUsuario.nextInt();

                 System.out.println("\n1. (O sinal soou e todos se levantaram para ir para o intervalo.)");
                 opcao = nomeUsuario.nextInt();

                 System.out.println("\n1. (Arrumei o meu material e sai da sala.)");
                 opcao = nomeUsuario.nextInt();

                 System.out.println("\n1. (Passeei pela escola até achar algum lugar legal.)");
                 opcao = nomeUsuario.nextInt();

                 System.out.println("\n1. (Acabei parando na quadra. Algumas pessoas estavam jogando basquete, vôlei... Outros estavam conversando.)");
                 opcao = nomeUsuario.nextInt();

                 System.out.println("\n1. (Vi um lugar vazio e fui até lá, com medo de levar uma bolada.)");
                 opcao = nomeUsuario.nextInt();

                 System.out.println("\n1. (Me agachei no chão, encostada na parede e fiquei observando as pessoas em volta.)");
                 opcao = nomeUsuario.nextInt();
                 
                 System.out.println("\n1. (Assisti alguns garotos jogarem basquete e notei um bem bonito...)");
                 opcao = nomeUsuario.nextInt();

                 System.out.println("\n1. (Ele era alto, bem charmoso, tinha o cabelo cacheado.)");
                 opcao = nomeUsuario.nextInt();

                 System.out.println("\n1. (Desviei meu olhar para um menino vindo em minha direção. Ele parecia nerd.)");
                 opcao = nomeUsuario.nextInt();


                 System.out.print("\n???: Oi! Você é nova, né?");
                 System.out.println("\n1. (Era o menino da minha sala. Loyr, eu acho...)");
                 opcao = nomeUsuario.nextInt();

                 System.out.println("\n1. (Não quero conversar com ele...)");
                 System.out.println("\n2. (Ele parece legal.)");
                 opcao = nomeUsuario.nextInt();

                 if (opcao == 1) {
                    

                    System.out.println("\n1. Sim. (Olhei para frente, ignorando-o)");
                    opcao = nomeUsuario.nextInt();

                    System.out.print("\nLoyr: Ah, tá... Desculpa incomodar.");
                    System.out.println("\n1. (Ele saiu e foi se encontrar com seus amigos.) Finalmente.");
                    opcao = nomeUsuario.nextInt();

                    System.out.print("\nOh não! Você perdeu a imagem!");
                    System.out.println("\n1. :(");
                    opcao = nomeUsuario.nextInt();

                    System.out.println("1. (Estava muito chato, então decidi dar uma volta na escola. Me levantei para sair da quadra.)");
                    opcao = nomeUsuario.nextInt();
                    
                    System.out.println("\n1. (No entanto, meu percurso foi interrompido por uma BOLADA. E não qualquer bolada, foi uma bola de basquete!)");
                    opcao = nomeUsuario.nextInt();

                    System.out.println("\n1. (Me senti tonta e coloquei a mão na cabeça, tentando raciocinar o que havia acontecido.)");
                    opcao = nomeUsuario.nextInt();

                    System.out.println("\n1. (Me virei para ver quem foi a causa do meu óbito.)");
                    opcao = nomeUsuario.nextInt();

                    System.out.println("\n1. (Vi um garoto indo atrás da bola, era o mesmo bonitinho de antes! Ele nem olhou na minha cara e não falou nada. Ouvi algumas pessoas rindo.)");
                    opcao = nomeUsuario.nextInt();

                    System.out.println("\n1. (Lembrei de ter visto uma enfermaria enquanto passeava. Fui até lá.)");
                    opcao = nomeUsuario.nextInt();

                    System.out.println("1. (A tia me deitou em uma das macas e colocou gelo na minha cabeça.)");
                    opcao = nomeUsuario.nextInt();


                 } else {

                    System.out.println("\n1. Sim, sou eu. Você é da minha sala, né?\n");
                    opcao = nomeUsuario.nextInt();

                    System.out.print("\nLoyr: Sim! Eu sou o Loyr. Muito prazer. (Ele se sentou do meu lado)");
                    System.out.println("\n1. Prazer, me chamo " + nome + " !");
                    opcao = nomeUsuario.nextInt();

                    System.out.print("\nLoyr: E aí o que está achando do presí- digo, escola?");
                    System.out.println("\n1. To achando chato, né?");
                    System.out.println("\n2. To achando ok.");
                    opcao = nomeUsuario.nextInt();

                    System.out.print("\nLoyr: Posso te apresentar a escola? ");
                    System.out.println("\n1. Claro.");
                    opcao = nomeUsuario.nextInt();

                    System.out.print("\nLoyr: Aqui é onde a gente tem direito a tomar nosso banho de sol, a quadra. ");
                    System.out.println("\n1. (Levantamos e começamos a andar para fora da quadra.)");
                    opcao = nomeUsuario.nextInt();


                    System.out.println("\n1. (No entanto, meu percurso foi interrompido por uma BOLADA. E não qualquer bolada, foi uma bola de basquete!)");
                    opcao = nomeUsuario.nextInt();

                    System.out.println("\n1. (Me senti tonta e coloquei a mão na cabeça, tentando raciocinar o que havia acontecido.)");
                    opcao = nomeUsuario.nextInt();
        
                    System.out.print("\nLoyr: Meu Deus! Você tá bem?");
                    System.out.println("\n1. (Ele falou preocupado, se aproximando de mim. Não consigo pensar direito.) Eu... eu tô...");
                    opcao = nomeUsuario.nextInt();

                    System.out.println("\n1. (Me virei para ver quem foi a causa do meu óbito.)");
                    opcao = nomeUsuario.nextInt();

                    System.out.println("\n1. (Vi um garoto indo atrás da bola. Ele nem olhou na minha cara.)\n");
                    opcao = nomeUsuario.nextInt();


                    System.out.println("\nLoyr: Vem. Vamos para a enfermaria.");
                    System.out.println("\n1. (O Loyr me acompanhou até a enfermaria, em seguida voltou para a sala pois o sinal já tinha tocado.)\n");
                    opcao = nomeUsuario.nextInt();

                    System.out.println("\n1. (A tia me deitou em uma das macas e colocou gelo na minha cabeça.)\n");
                    opcao = nomeUsuario.nextInt();                 
                 }

                    System.out.println("\n1. (Passado algum tempo, ouvi a porta da enfermaria abrindo. A tia havia saído, então achei que era ela.)\n");
                    opcao = nomeUsuario.nextInt();

                    System.out.println("\n1. (Murmurei reclamações sobre o garoto, quase falando sozinha.)\n");
                    opcao = nomeUsuario.nextInt();

                    System.out.println("\n1. Aquele cabeção nem pediu desculpas! Quando eu ver ele, vou fazer ele engolir aquela bola.\n");
                    opcao = nomeUsuario.nextInt();

                    System.out.print("\n???: Ah, é?\n");
                    System.out.println("\n1. (Ouvi uma voz grossa e me levantei bruscamente, assustada. Olhei para o dono da voz).\n");
                    opcao = nomeUsuario.nextInt();

                    System.out.println("\n1. (Era ele! Era o cabeçudo!)\n");
                    opcao = nomeUsuario.nextInt();

                    System.out.println("\n1. (Não me intimidei e fiquei ainda mais irritada com sua presença).\n");
                    System.out.println("\n2. (Me senti envergonhada, não era para ele ter ouvido!).\n");                    
                    opcao = nomeUsuario.nextInt();

                    if (opcao == 1) {

                    System.out.println("\n1. É isso mesmo que você ouviu! Sua cabeça é enorme e você ainda é mal educado. Não tem nenhum ponto positivo. (Ele parecia desacreditado).\n");
                    opcao = nomeUsuario.nextInt();

                    System.out.print("\nCabeção: O quê?\n");
                    System.out.println("\n1. Cabeça de satélite. Cabeça de bacia. Megamente. Cabeça de nós todos. Gravidez psicológica.\n");
                    opcao = nomeUsuario.nextInt();

                    
                    System.out.print("\nCabeção: Minha cabeça é normal comparada a sua, cabeça de balão.\n");

                    } else {

                        System.out.println("\n1. É que... É...\n");
                        opcao = nomeUsuario.nextInt();

                        System.out.print("\nCabeção: Pois saiba que se não fosse essa sua cabeça gigantesca a bola não teria te acertado.\n");
                        System.out.println("\n1. O quê?? Minha cabeça tem um tamanho normal!\n");
                        opcao = nomeUsuario.nextInt();


                        System.out.print("\nCabeção: Percebi que você nunca se olhou no espelho então.\n");
                        System.out.println("\n1. Você que nunca deve ter se olhado! Se os portugueses vissem sua cabeça em 1500, eles gritariam terra à vista.\n");
                        opcao = nomeUsuario.nextInt();

                    }

                    System.out.println("\n1. E o que você veio fazer aqui, Pink e o Cérebro?\n");
                    opcao = nomeUsuario.nextInt();

                    System.out.print("\nCabeção: O professor me mandou vir aqui ver se você tava bem.\n");
                    System.out.println("\n1. Ai, não, você é da minha sala??\n");
                    opcao = nomeUsuario.nextInt();

                    System.out.print("Cabecão: Você não me viu na sala?");
                    System.out.println("\n1. Não. Por quê eu deveria?\n");
                    opcao = nomeUsuario.nextInt();
                

                    System.out.print("\nCabecão: Não achei que você era cega assim.\n");
                    System.out.println("\n1. (Comecei a fazer o que eu deveria ter come;ado há muito tempo: o ignorar.)\n");
                    opcao = nomeUsuario.nextInt();

                    System.out.print("Cabeçudo: Bom, eu vou voltar pra sala e falar que você tá cabulando, já que aparentemente você já tá boa.");
                 break;
                
                default:

                 System.out.print("\nVocê não serve para o amor... Você está solteira. Tente novamente.\n");
                opcao = nomeUsuario.nextInt();

                 break;

             } } while (opcao < 1 || opcao > 2);

            nomeUsuario.close();
            
          }
        }
            
        

