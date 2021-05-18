import java.util.Scanner;

public class Game {

    private final Parser parser;
    private Room currentRoom;
    private String surrender;
    private Player player ;
    private Item chaveFinal, chaveUm;
    private boolean temChaveFinal = false, temChaveAniversario = false;
    private Scanner sc;
    //quartos com interações diferenciadas
    private Room portaFinal, salaAniversario, salaMedica, salaCasaFerramentas, salaVazia3, salaAvenida,
    sacada, salaCaveira, quartoQuebrado, portaLuz, quartoFoto;
    


    /**
     * Create the game and initialise its internal map.
     */
    public Game() {
        createRooms();
        parser = new Parser();
    }
    

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms() {

        Room inicio, refeitorio,  saladeTV, arvoreLivre, clinicaMedica, salaYoga, saladeAula, salaVazia,
                salaPortaMae,  salaVazia1, salaVazia2, salaRoupa, corredor, tunel, cinema;

        // create the rooms
        inicio = new Room("Hospital. Um lugar confortavel, estou deitado e eu poderia so desistir, mas parece que algo que não é do meu " +
                "controle quer continuar. Não entendo bem, mas parece que estou sendo controlado por fora");

        refeitorio = new Room("na cafeteria. Um lugar confortavel e com boa comida, me lembra epocas distantes, onde era mais novo e sempre " +
                "sentia aquele cheiro bom de café quando passava por la. consigo sentir até por aqui.");

        arvoreLivre = new Room("Arvore ao ar livre. Realmente estou assustado com alguem controlando minhas ações... você pode controlar quando eu morro?" +
                " Bom, me sinto meio refém, essa arvore foi de um dia feliz com minha familia, antes de tudo dar errado.");

        clinicaMedica = new Room("Clinica medica. Aqui me vejo entre duas salas e não recomendo entrar na sala leste, mas ao mesmo tempo acho que vai ser bom? não entendo bem é algo muito estranho." +
                " Essa clinica acredito que seja do dia que levei minha ex mulher para ter nosso filho...");

        salaMedica = new Room("Sala de parto. É aqui estou eu, dentro da sala onde meu filho não nasceu, onde ele não teve a chance de viver, por conta de erro medico. é algo dificil de ser engolido," +
                " mas eu aprendi algo nesse dia, eu colocava muito da minha vida nele, e nesse dia entendi que tenho que viver por mim e por ela...");

        salaYoga = new Room(" Uma sala de yoga. Lembro daqui como uma calmaria depois da tempestade e acho que representa bem esse momento.");

        salaAvenida = new Room(" - Avenia 982. O momento que me leva até essa situação, ela me largou, eu surtei e corri, talvez eu tenha matado outra pessoa? foi tudo muito rapido isso não me deixa bem. " +
                " Um homem muito alto com uma cartola aparece no canto da sala, você se sente extremamente mal, ele te encara e tudo treme.");

        saladeAula = new Room(" Sala de aula. Aqui passei bastante tempo da minha vida aqui, mesmo que tenha sofrido algum bullying eu sinceramente não consigo ver algo negativo daqui.");


        quartoQuebrado = new Room("Quarto quebrado e destruido. O dia que apanhei do meu tio por apenas ter quebrado o seu copo de cerveja, apanhei tanto que quebrei 3 costelas. Começa a ouvir os propios gritos na epoca e algo aparece na parede como " +
                "um rosto sorrindo para mim e uma dor nas costelas que foram quebradas fica muito aguda e tudo novamente treme e a sala começa a parece que vai desabar!");

        saladeTV = new Room("Sala de TV. Onde passava muito do meu tempo maratonando filmes, sabe," +
                " meio que vendo que tem alguem me controlando que talvez esteja vendo oque está acontecendo, fico feliz de ver coisas antigas... Você está ai se puder me responder. Além disso" +
                "me sinto estremamente mal olhando para a porta da esquerda.");
        salaVazia = new Room("Sala sem nada. Não sei exatamente porque não tem nada aqui, apenas vejo uma porta a seguir e sinto algo estranho vindo dali.");

        salaAniversario = new Room(" Sala de casa com um bolo de 18 anos. " +
                "Acredito que isso representa uma mudança de vida, como uma chave de uma vida presa para uma livre e feliz... nesse dia eu realmente sai de casa e fui viver minha vida");

        salaPortaMae = new Room(" Porta da casa da minha mãe. Caminhando por esse lugar, começo a pensar em quem é você que está ai do outro lado. Na entendi que não sou eu que estou no controle aqui, eu so revivo momentos..." +
                " Quem sou eu? porque isso está acontecendo, você é uma especie de Deus? me sinto está sendo escrito num bloco de notas por um aluno de uma faculdade.");

        salaCasaFerramentas = new Room("Casa de ferramentas. Aqui que minha mãe guardava a chave para quando chegarmos a pegar e abrir a casa. Olho para a porta e sinto uma sensação muito ruim vindo da da mesma. ");

        salaCaveira = new Room(" Vejo a minha propia morte na minha frente e sinceramente so quero sair dali logo eu apenas tenho pensamentos negativos e penso seriamente em não lutar mais pela minha vida e desistir");

        salaVazia1 = new Room("Em sala vazia. Não tem nada aqui por algum motivo? so vejo uma porta");

        salaVazia2 = new Room("Sala vazia. Outra sala vazia? seria isso as lembraças que ainda vou viver? o espaço delas? pra ser sincero, qual realmente meu nome? eu não lembro bem");

        salaRoupa = new Room("Uma roupa rasgada no chão da sala. eu não estou mais entendendo nada e qual minha idade? quem sou eu? quem está fazendo isso é você? uma especie de Deus que quer me fazer passar por a... ");

        corredor = new Room("Corredor com portas. Respiro um pouco e essa sala parece muito estranha não consigo entender algo. existe uma  porta que sinto que é ali que devo ir a porta que está acima de mim, meu corpo meio que quer ir pra la?");

        portaLuz = new Room(" Uma luz ofuscante apenas ficando fraca perto de portas. Oque seria isso? seria você? um Deus? você está me dando um sopro? " +
                "eu não entendo me ajude se me ouve... presto a atenção e vejo que não deveria seguir para a proxima porta não sei parece algo maligno e ruim a vibração não é boa. A luz te tras conforto.");

        quartoFoto = new Room(" Um quarto com uma foto no chão. Entro e me sento perto da foto e a seguro, é uma foto minha com minha mãe, acho que meu nome é Jesse?" +
                " consigo pensar nesse nome como se fosse meu e sinto saudade desse momento abraçando minha mãe queria poder revive-lo.");

        tunel = new Room(" Um tunel com uma luz forte. Esse tunel é muito estranho para onde olho vejo uma luz no fim, mesmo que eu volto por onde eu vim, não me lembro de la ser tão claro quanto aqui. ");

        cinema = new Room(" O cinema do meu primeiro beijo, essas lembranças realmente ficam na mente, hein... parece que agora você conhece um pouco da minha vida, " +
                "seria isso o meu juizo final? você está vendo minhas ações ruins e julgando elas comigo mesmo vendo?");

        sacada = new Room(" Uma sacada de um predio. Está chovendo... Isso é exatamente como no dia em que eu pensei em fazer aquilo... perdi o meu filho e esse pensamento me consumiu quase realmente fiz, você vai me julgar por isso? você vai me levar para o inferno por isso? Eu so pensei não fiz nada." +
                " Uma sensação de peso nas costas toma conta de você e uma voz vem ao seu ouvido dizendo: 'Você acha que vai sair disso? aqui é seu fim. Não há esperança para você apenas sofrimento e morte. você ira perecer aqui e viver comigo' "); //parte de perder vida

        salaVazia3 = new Room(" Sala vazia. EU NÃO SEI OQUE ESTÁ ACONTECENDO. EU DEVERIA DESISTIR DEPOIS DISSO? EU NÃO QUERO MAIS EU DEVERIA NÃO continuar... Calma..." +
                " essa sala parece não ter nada mesmo, olha consigo ver como se fosse o fim do meu cerebro. acredito que deva voltar. mas talvez desistir não seja a pior opção.");

        portaFinal = new Room("Porta de casa. A porta se abre e tudo fica escuro não vejo mais nada apenas calmaria");


//         initialise room exits
        inicio.setExit("leste", refeitorio);
        inicio.setExit("cima", saladeTV);
//        inicio.setExit("teste", salaAniversario);
//        salaAniversario.setExit("teste", portaFinal);

        refeitorio.setExit("oeste", inicio);
        refeitorio.setExit("baixo", quartoQuebrado);
        refeitorio.setExit("leste", saladeAula);
        refeitorio.setExit("cima", salaYoga);


        quartoQuebrado.setExit("cima", refeitorio);


        saladeTV.setExit("baixo", inicio);
        saladeTV.setExit("cima", arvoreLivre);
        saladeTV.setExit("leste", salaAvenida);

        salaAvenida.setExit("oeste", saladeTV);

        arvoreLivre.setExit("leste", clinicaMedica);
        arvoreLivre.setExit("baixo", saladeTV);

        clinicaMedica.setExit("leste", salaMedica);
        clinicaMedica.setExit("baixo", salaYoga);

        salaMedica.setExit("oeste", clinicaMedica);

        salaYoga.setExit("baixo", refeitorio);
        salaYoga.setExit("cima", clinicaMedica);

        saladeAula.setExit("oeste", refeitorio);
        saladeAula.setExit("baixo", salaVazia);

        salaVazia.setExit("cima", saladeAula);
        salaVazia.setExit("leste", salaAniversario);

        salaAniversario.setExit("oeste", salaVazia);
        salaAniversario.setExit("leste", salaPortaMae);

        salaPortaMae.setExit("oeste", salaAniversario);
        salaPortaMae.setExit("baixo", salaCasaFerramentas);
        salaPortaMae.setExit("cima", salaVazia1);

        salaCasaFerramentas.setExit("cima", salaPortaMae);
        salaCasaFerramentas.setExit("leste", salaCaveira);

        salaCaveira.setExit("oeste", salaCasaFerramentas);

        salaVazia1.setExit("baixo", salaPortaMae);
        salaVazia1.setExit("oeste", salaVazia2);

        salaVazia2.setExit("leste", salaVazia1);
        salaVazia2.setExit("cima", salaRoupa);

        salaRoupa.setExit("baixo", salaVazia2);
        salaRoupa.setExit("cima", corredor);

        corredor.setExit("baixo", salaRoupa);
        corredor.setExit("leste", portaLuz);
        corredor.setExit("oeste", tunel);
        corredor.setExit("cima", portaFinal);


        portaLuz.setExit("oeste", corredor);
        portaLuz.setExit("baixo", quartoFoto);

        quartoFoto.setExit("cima", portaLuz);

        tunel.setExit("baixo", cinema);
        tunel.setExit("cima", corredor);

        cinema.setExit("cima", tunel);
        cinema.setExit("leste", sacada);

        sacada.setExit("oeste", cinema);
        sacada.setExit("cima", salaVazia3);

        salaVazia3.setExit("baixo", sacada);


        currentRoom = inicio;  // começar no inicio

        Item wine = new Item();
        wine.setItemName("Vinho");
        wine.setItemDescription("Meia garrafa de vinho");

        chaveFinal = new Item();
        chaveFinal.setItemName("Chave de porta final");
        chaveFinal.setItemDescription("Uma chave que abre a porta final");

        chaveUm = new Item();
        chaveUm.setItemDescription("Uma chave que abre algo...");
        chaveUm.setItemName("Chave de porta");

        quartoQuebrado.addItems(wine);
        salaCasaFerramentas.addItems(chaveFinal);
        salaMedica.addItems(chaveUm);
    }

    /**
     * Main play routine.  Loops until end of play.
     */
    public void play() {
        player = new Player();
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.

        boolean finished = false;
        while (!finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome() {
        System.out.println();
        System.out.println("Bem vindo ao seu subconsciente...");
        System.out.println("Onde você enfrentará seus maiores medos");

        //opção de desistencia
        willSurrender();

        System.out.println("Você inicia sua jornada com 100 pontos de vida(hp), não deixe que eles cheguem a 0...");
        System.out.println("Digite 'help' se precisar de ajuda.\n");
        currentRoom.getLongDescription();

    }

    /**
     * Given a command, process (that is: execute) the command.
     *
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) {
        boolean wantToQuit = false;

        if (command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help")) {
            printHelp();
        } else if (commandWord.equals("go")) {
            goRoom(command);
        } else if (commandWord.equals("look")) {
            look();
        } else if (commandWord.equals("quit")) {
            wantToQuit = quit(command);
        }
        // else command not recognised.
        return wantToQuit;
    }

    // implementations of user commands:
    private void look() {
        currentRoom.getLongDescription();
    }

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the
     * command words.
     */
    private void printHelp() {
        System.out.println("Você esta dentro da sua propia mente");
        System.out.println("Tera que tentar sair ou pode so desistir... Os maiores detalhes sobre a historia você terá que explorara para descobrir");
        System.out.println("\nOs comandos são:");
        System.out.println(parser.listCommands());
    }

    /**
     * Try to go to one direction. If there is an exit, enter the new
     * room, otherwise print an error message.
     */
    private void goRoom(Command command) {
        if (!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);

        //opção de desistencia pro jogador na sala vazia 3.
        if (nextRoom.equals(salaVazia3)) {
            willSurrender();
        }

        //verifica se existe alguma chave no quarto.
        chaveDisponivel();

        //verifica se é uma porta que precisa de uma chave.
        checarPortaFinal(nextRoom);
        checarPortaAniversario(nextRoom);

        //altera o hp do player dependendo do quarto.
        quartoGanhaVida(nextRoom);
        quartoPerdeVida(nextRoom);

        if (!(nextRoom.equals(portaFinal))){
            if (nextRoom == null) {
                System.out.println("There is no door!");
            } else {
                currentRoom = nextRoom;
                currentRoom.getLongDescription();
            }
        }
    }

    /**
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit (Command command){
            if (command.hasSecondWord()) {
                System.out.println("Quit what?");
                return false;
            } else {
                return true;  // signal that we want to quit
            }
        }

    // metodo de desistencia do jogo
    private void willSurrender() {
        sc = new Scanner(System.in);

        System.out.println("Se quiser desistir digite 'surrender' ");
        System.out.println("Ou digite 'live' para jogar");
        // recebe opção do jogador
        surrender = sc.next();
        if (surrender.equalsIgnoreCase("surrender")) {     // compara palavra digitada
            System.err.println("Você olha pras profundesas de seus pensamentos e percebe... não há esperança");
            System.err.println("YOU ARE DEAD!");
            System.exit(666);       // saída por desistencia
        } else if (surrender.equalsIgnoreCase("live")) {
            System.out.println("Então... você gosta de um desafio né?!\nBoa sorte com sua jornada...");
        } else {
            System.out.println("Unknown command, exit and try again!");     // palavra nao compativel
            System.exit(12);
        }
    }

    // metodo que checa se é a porta final e se a chave foi encontrada
    private void checarPortaFinal(Room nextRoom) {
        if (nextRoom.equals(portaFinal)) {
            if (temChaveFinal == false) {
                System.err.println("Você tenta abrir a porta porem não tem a chave da mesma.");
                currentRoom.getLongDescription();
            } else {
                System.err.println("Tudo fica escuro, mas você sente uma paz enorme...");
                System.out.println("Depois de 7 dias você acorda.");
                System.exit(40028922);
            }
        }
    }

    // metodo que checa se é a porta da sala aniversario e se a chave foi encontrada
    private void checarPortaAniversario(Room nextRoom){
        if (nextRoom.isTheSame(salaAniversario)) {
            if (temChaveAniversario == false) {
                System.err.println("Você tenta abrir a porta porem não tem a chave da mesma.");
                currentRoom.getLongDescription();
            } else {
                System.err.println("Você usou uma chave aqui");
            }
        }
    }

    // metodo que verifica se há uma chave para ser recolhida na sala
    private void chaveDisponivel() {
        if (currentRoom.isTheSame(salaMedica)){
            temChaveAniversario = true;
            System.out.println("Você encontrou uma chave. Ela foi adicionada ao seu inventário.");
        }

        if (currentRoom.equals(salaCasaFerramentas)) {
            temChaveFinal = true;
            System.out.println("Você encontrou uma chave final. Ela foi adicionada ao seu inventário.");
        }
    }

    // metodo que verifica e tira vida do player
    private void quartoPerdeVida(Room nextRoom){
        if (nextRoom.isTheSame(salaCaveira)){
            player.removeHp((byte) 50);
            System.out.println("Você vê sua morte chegando... perdendo -50 pontos de vida.");
            if (player.getHp() <= 0){
                System.err.println("VOCÊ MORREU");
            }else System.out.println("Pontos de vida restantes: " + player.getHp());
        }
        if (nextRoom.isTheSame(salaAvenida) || nextRoom.isTheSame(sacada) || nextRoom.isTheSame(quartoQuebrado)) {
            player.removeHp((byte) 30);
            System.out.println("Com essa situação todo seu cerebro parece deteriorar perdendo -30 pontos de vida.");
            if (player.getHp() <= 0){
                System.err.println("VOCÊ MORREU");
            }else System.out.println("Pontos de vida restantes: " + player.getHp());
        }
    }

    // metodo que verifica e adiciona vida ao player
    private void quartoGanhaVida (Room nextRoom){
        if (nextRoom.isTheSame(portaLuz)){
            System.out.println("A luz te tras conforto regenerando 20 pontos de vida");
            player.addHp((byte)20);
            System.out.println("Pontos de vida agora: " + player.getHp());
        }else if (nextRoom.isTheSame(quartoFoto)){
            System.out.println("A foto te tras alegria +20 de vida.");
            player.addHp((byte)20);
        }
    }
}