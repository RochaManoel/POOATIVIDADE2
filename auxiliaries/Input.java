package auxiliaries;

import java.util.ArrayList;
import java.util.Scanner;

import entities.User;
import office.Bags;
import office.Tasks;

public class Input {
    private Scanner sc = new Scanner(System.in);
    
    /*---------------------------------------- 
    |                                        |
    |          LOGIN AREA - CLASS A          |      - Login.java 
    |                                        |
    ----------------------------------------*/
    
    // ----- Entrada de dados da escolha na Área ----- //
    public int optionLoginArea(){
        System.out.println("\nDigite a opção desejada:\n0 - Fechar o Programa\n1 - Criar Usuario\n2 - Realizar Login\n3 - Recuperar Senha");
        int option = sc.nextInt();
        return option;
    }

    /*---------------------------------------- 
    |                                        |
    |          LOGIN AREA - CLASS B          |      - Login.java
    |                                        |
    ----------------------------------------*/

    // ----- Entrada de dados da escolha na Área da função addUser ----- //
    public int getOffice(){
        System.out.println("\nDigite sua Classificação:");
        System.out.println("       [1] - Aluno de Graduação       |       [2] - Aluno de Mestrado        |       [3] - Aluno de Doutorado       ");
        System.out.println("           [4] - Professor            |          [5] - Pesquisador           |  [6] - Profissional (Desenvolvedor)  ");
        System.out.println("     [7] - Profissional (Testador)    |    [8] - Profissional (Analista)     |     [9] - Profissional (Técnico)     ");
        int option = sc.nextInt();
        return option;
    }

    // ----- Entrada de dados na Área da função addUser ----- //
    public String newName(){
        System.out.println("Digite o nome do usuário:");
        sc.nextLine();
        String name = sc.nextLine();
        return name;
    }
    public String newlastName(){
        System.out.println("Digite o Sobrenome do usuário:");
        String lastName = sc.nextLine();
        return lastName;
    }
    public String newEmail(){
        System.out.println("Digite o email do usuário:");
        String email = sc.nextLine();
        return email;
    }
    public String newPassword(){
        System.out.println("Digite a senha do usuário:");
        String password = sc.nextLine();
        return password;
    }

    // ----- Entrada de dados na Área da função loginUser ----- //
    public String getEmail(){
        System.out.println("\nDigite o email do usuário: ");
        String mail = sc.nextLine();
        return mail;
    }
    public String getPassword(){
        System.out.println("Digite a senha do Usuário: ");
        String password = sc.nextLine();
        return password;
    }

    // ----- Entrada de dados na Área da função redefinePassword ----- //
    public String searchName(){
        System.out.println("\nDigite o nome do usuário a redefinir a senha:");
        String name = sc.nextLine();
        return name;
    }
    public String searchEmail(){
        System.out.println("Digite o email do usuário a redefinir a senha:");
        String email = sc.nextLine();
        return email;
    }
    public String editPassword(){
        System.out.println("Digite a nova senha do usuário:");
        String password = sc.nextLine();
        return password;
    }

    /*---------------------------------------- 
    |                                        |
    |         PROJECT AREA - CLASS A         |      - Date.java
    |                                        |
    ----------------------------------------*/

    // ----- Entrada de dados na Área da função addProject ----- //
    public String newIdProject(){
        System.out.println("Digite o Id do Projeto:");
        String idProject = sc.nextLine();
        return idProject;
    }
    public String newDescriptionProject(){
        System.out.println("Digite a Descrição do Projeto:");
        String descriptionProject = sc.nextLine();
        return descriptionProject;
    }
    public String newDateFirst(){
        System.out.println("Digite o Periodo Inicial do Projeto:\nDigite o Dia: [DD]");
        int day = sc.nextInt();
        System.out.println("Digite o Mês: [MM]");
        int month = sc.nextInt();
        System.out.println("Digite o Ano: [AAAA]");
        int year = sc.nextInt();
        System.out.println("Digite a Hora: [HH]");
        int hour = sc.nextInt();
        System.out.println("Digite os Minutos: [mm]");
        int minutes = sc.nextInt();
        String Date = String.valueOf(day)+"/"+String.valueOf(month)+"/"+String.valueOf(year)+" / "+String.valueOf(hour)+":"+String.valueOf(minutes);
        return Date;
    }
    public String newDateLast(){
        System.out.println("Digite o Periodo Final do Projeto:\nDigite o Dia: [DD]");
        int day = sc.nextInt();
        System.out.println("Digite o Mês: [MM]");
        int month = sc.nextInt();
        System.out.println("Digite o Ano: [AAAA]");
        int year = sc.nextInt();
        System.out.println("Digite a Hora: [HH]");
        int hour = sc.nextInt();
        System.out.println("Digite os Minutos: [mm]");
        int minutes = sc.nextInt();
        String Date = String.valueOf(day)+"/"+String.valueOf(month)+"/"+String.valueOf(year)+" / "+String.valueOf(hour)+":"+String.valueOf(minutes);
        return Date;
    }

    public int optionUsersProjects(){
        System.out.println("Inscrição dos Usuários no Projeto, por favor digite a opção desejada:\n0 - Finalizar Lista\n1 - Adicionar Usuário");
        int option = sc.nextInt();
        return option;
    }
    public ArrayList<User> listUsersProjects(ArrayList<User> userList){
        ArrayList<User> list = new ArrayList<>();
        boolean control = true;
        while (control){
            int option = this.optionUsersProjects();
            switch(option){
                case 0:
                    control = false;
                    System.out.println("Lista finalizada com Sucesso.");
                    break;
                case 1:
                    System.out.println("Digite o Nome do Usuário:");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Digite o Sobrenome do Usuário:");
                    String firstName = sc.nextLine();
                    boolean ctrl = true;
                    for(User user: userList){
                        if(user.getName().equals(name) && user.getLastName().equals(firstName)){
                            list.add(user);
                            ctrl = false;
                            System.out.println("Usuário adicionado com Sucesso.");
                            break;
                        }
                    }
                    if(ctrl){
                        System.out.println("Usuário Não Encontrado");
                    }
                    break;
                default:
                    System.out.println("Comando Invalido");
                    break;
            }
        }
        return list;
    }

    // ----- Entrada de dados na Área da função listActivities ----- //
    public int optionActivitiesProjects(){
        System.out.println("Inscrição de Atividades no Projeto, por favor digite a opção desejada:\n0 - Finalizar Lista\n1 - Adicionar Atividade");
        int option = sc.nextInt();
        return option;
    }

    // ----- Entrada de dados na Área da função addProject ----- //
    public ArrayList<Bags> listBags(ArrayList<User> listUsers){
        ArrayList<Bags> list = new ArrayList<>();
        for(User user: listUsers){
            System.out.println("Digite o Valor da Bolsa do Usuário "+user.getName()+" "+user.getLastName()+":");
            int value = sc.nextInt();
            String period = this.newDatePeriod();
            Bags bags = new Bags(user, value, period);
            list.add(bags);
        }
        return list;
}

    // ----- Entrada de dados na Área da função removeProject ----- //
    public String getIdProjectForDelete(){
        System.out.println("Digite o nome do Projeto:");
        String id = sc.nextLine();
        return id;
    }
    public String getPasswordProjectForDelete(){
        System.out.println("Digite a Senha de Perfil para concluir o Processo de Exclusão:");
        String password = sc.nextLine();
        return password;
    }

    /*---------------------------------------- 
    |                                        |
    |        ACTIVITY AREA - CLASS A         |      - Date.java
    |                                        |
    ----------------------------------------*/

    // ----- Entrada de dados na Área da função addActivity ----- //
    public String newIdActivity(){
        System.out.println("Digite o Id da Atividade:");
        String idActivity = sc.nextLine();
        return idActivity;
    }
    public String newDescriptionActivity(){
        System.out.println("Digite a Descrição da Atividade:");
        String descriptionActivity = sc.nextLine();
        return descriptionActivity;
    }
    public String newDateFirstActivity(){
        System.out.println("Digite o Periodo Inicial da Atividade:\nDigite o Dia: [DD]");
        int day = sc.nextInt();
        System.out.println("Digite o Mês: [MM]");
        int month = sc.nextInt();
        System.out.println("Digite o Ano: [AAAA]");
        int year = sc.nextInt();
        System.out.println("Digite a Hora: [HH]");
        int hour = sc.nextInt();
        System.out.println("Digite os Minutos: [mm]");
        int minutes = sc.nextInt();
        String Date = String.valueOf(day)+"/"+String.valueOf(month)+"/"+String.valueOf(year)+" / "+String.valueOf(hour)+":"+String.valueOf(minutes);
        return Date;
    }
    public String newDateLastActivity(){
        System.out.println("Digite o Periodo Final da Atividade:\nDigite o Dia: [DD]");
        int day = sc.nextInt();
        System.out.println("Digite o Mês: [MM]");
        int month = sc.nextInt();
        System.out.println("Digite o Ano: [AAAA]");
        int year = sc.nextInt();
        System.out.println("Digite a Hora: [HH]");
        int hour = sc.nextInt();
        System.out.println("Digite os Minutos: [mm]");
        int minutes = sc.nextInt();
        String Date = String.valueOf(day)+"/"+String.valueOf(month)+"/"+String.valueOf(year)+" / "+String.valueOf(hour)+":"+String.valueOf(minutes);
        return Date;
    }
    public String newCoordinatorName(){
        System.out.println("Digite o Nome do Coordenador da Atividade:");
        sc.nextLine();
        String nameCoordinator = sc.nextLine();
        return nameCoordinator;
    }
    public String newCoordinatorLastName(){
        System.out.println("Digite o Sobrenome do Coordenador da Atividade:");
        String lastNameCoordinator = sc.nextLine();
        return lastNameCoordinator;
    }
    
    public int optionUsersActivities(){
        System.out.println("Inscrição de Usuários na Atividade, por favor digite a opção desejada:\n0 - Finalizar Lista\n1 - Adicionar Usuário");
        int option = sc.nextInt();
        return option;
    }
    public ArrayList<User> listUsersActivities(ArrayList<User> userList){
        ArrayList<User> list = new ArrayList<>();
        boolean control = true;
        while (control){
            int option = this.optionUsersActivities();
            switch(option){
                case 0:
                    control = false;
                    break;
                case 1:
                    sc.nextLine();
                    System.out.println("Digite o Nome do Usuário:");
                    String name = sc.nextLine();
                    System.out.println("Digite o Sobrenome do Usuário:");
                    String lastName = sc.nextLine();
                    boolean get = true;
                    for(User user: userList){
                        if(user.getName().equals(name) && user.getLastName().equals(lastName)){
                            list.add(user);
                            get = false;
                            System.out.println("Usuário adicionado com Sucesso.");
                            break;
                        }
                    }
                    if(get){
                        System.out.println("Usuário Não Encontrado");
                    }
                    break;
                default:
                    System.out.println("Comando Invalido");
                    break;
            }
        }
        return list;
    }
    
    public ArrayList<Tasks> listTasksActivities(ArrayList<User> listUsers){
        ArrayList<Tasks> list = new ArrayList<>();
        int count = 0;
        for(User user: listUsers){
            if(count == 0){
                sc.nextLine();
                count++;
            }
            System.out.println("Digite a Tarefa do Usuário "+user.getName()+" "+user.getLastName()+":");
            String task = sc.nextLine();
            Tasks taskadd = new Tasks(user, task);
            list.add(taskadd);
        }
        return list;
    }

    /*---------------------------------------- 
    |                                        |
    |         MENU AREA - CLASS A            |      - Menu.java
    |                                        |
    ----------------------------------------*/

    // ----- Entrada de dados da escolha na Área da função menuArea ----- //
    public int optionAreaMenu(){
        System.out.println("\nDigite a opção desejada:\n0 - Encerrar Sessão\n1 - Área de Perfil\n2 - Área de Consultas e Relatórios");
        System.out.println("3 - Área de Pagamentos\n4 - Área de Projetos\n5 - Área de Atividades");
        int option = sc.nextInt();
        return option;
    }
    public int optionAreaMenu(int number){
        System.out.println("\nDigite a opção desejada:\n0 - Encerrar Sessão\n1 - Área de Perfil\n2 - Área de Consultas e Relatórios");
        int option = sc.nextInt();
        return option;
    }

    /*---------------------------------------- 
    |                                        |
    |        PROFILE AREA - CLASS A          |      - Menu.java
    |                                        |
    ----------------------------------------*/

    // ----- Entrada de dados da escolha na Área da função profileArea ----- //
    public int optionPerfil(){
        System.out.println("Digite a opção desejada:\n1 - Editar Informações\n2 - Obter Informações");
        int option = sc.nextInt();
        return option;
    }
    public int optionEditInformation(){
        System.out.println("Digite a opção desejada:\n1 - Editar Email\n2 - Editar Senha");
        int option = sc.nextInt();
        return option;
    }

    // ----- Entrada de dados na Área da função profileArea ----- //
    public String getEmail(boolean control){
        System.out.println("\nDigite o email do usuário: ");
        sc.nextLine();
        String mail = sc.nextLine();
        return mail;
    }
    public String getPassword(boolean control){
        System.out.println("Digite a senha do Usuário: ");
        sc.nextLine();
        String password = sc.nextLine();
        return password;
    }

    /*---------------------------------------- 
    |                                        |
    |        CONSULT AREA - CLASS A          |      - Menu.java
    |                                        |
    ----------------------------------------*/
    
    // ----- Entrada de dados da escolha na Área da função consultArea ----- //
    public int optionConsult(){
        System.out.println("\nDigite a opção desejada:\n1 - Consultar Usuário\n2 - Consultar Projeto\n3 - Consultar Atividade");
        int option = sc.nextInt();
        return option;
    }
    public int optionMoreInf(){
        System.out.println("\nDigite a opção desejada:\n0 - Retornar\n1 - Obter Relatórios");
        int option = sc.nextInt();
        return option;
    }

    // ----- Entrada de dados na Área da função consultArea ----- //
    public String nameUser(int number){
        System.out.println("Digite o Nome do Usuário:");
        String name = sc.nextLine();
        return name;
    }
    public String lastNameUser(){
        System.out.println("Digite o Sobrenome do Usuário:");
        String lastName = sc.nextLine();
        return lastName;
    }
    public String sourceProjects(int number){
        System.out.println("\nDigite o Id do Projeto Procurado:");
        String id = sc.nextLine();
        return id;
    }
    public String sourceActivities(int number){
        System.out.println("\nDigite o Id da Atividade Procurada:");
        String id = sc.nextLine();
        return id;
    }

    /*---------------------------------------- 
    |                                        |
    |        PAYMENT AREA - CLASS A          |      - Menu.java
    |                                        |
    ----------------------------------------*/

    // ----- Entrada de dados da escolha na Área da função paymentArea ----- //
    public int optionPayment(){
        System.out.println("\nDigite a opção desejada:\n1 - Realizar Pagamento");
        int option = sc.nextInt();
        return option;
    }

    // ----- Entrada de dados na Área da função paymentArea ----- //
    public String sourceProjects(){
        System.out.println("\nDigite o Id do Projeto Procurado:");
        sc.nextLine();
        String id = sc.nextLine();
        return id;
    }

    /*---------------------------------------- 
    |                                        |
    |        PROJECTS AREA - CLASS A         |      - Menu.java
    |                                        |
    ----------------------------------------*/

    // ----- Entrada de dados da escolha na Área da função projectsArea ----- //
    public int optionAreaProjects(){
        System.out.println("\nDigite a opção desejada:\n0 - Retornar Menu\n1 - Criar Projeto\n2 - Editar Projeto\n3 - Excluir Projeto\n4 - Alterar Status");
        int option = sc.nextInt();
        return option;
    }
    public int optionAreaEditProjets(){
        System.out.println("\nDigite a opção desejada:\n1 - Editar Id do Projeto\n2 - Editar Descrição do Projeto\n3 - Editar Periodo Inicial do Projeto");
        System.out.println("4 - Editar Periodo Final do Projeto\n5 - Adicionar Usuário do Projeto\n6 - Remover Usuário do Projeto\n7 - Editar Bolsa\nObs: Para editar atividades dirija-se a área de Atividades.");
        int option = sc.nextInt();
        return option;
    }
    public int optionEditStatus(){
        System.out.println("Digite a opção desejada:\n0 - Não Alterar Status\n1 - Alterar Status");
        int option = sc.nextInt();
        return option;
    }

    // ----- Entrada de dados na Área da função projectsArea ----- //
    public String newDatePeriod(){
        System.out.println("Digite o Periodo de Vigência da Bolsa:\nDigite o Dia: [DD]");
        int day = sc.nextInt();
        System.out.println("Digite o Mês: [MM]");
        int month = sc.nextInt();
        System.out.println("Digite o Ano: [AAAA]");
        int year = sc.nextInt();
        System.out.println("Digite a Hora: [HH]");
        int hour = sc.nextInt();
        System.out.println("Digite os Minutos: [mm]");
        int minutes = sc.nextInt();
        String Date = String.valueOf(day)+"/"+String.valueOf(month)+"/"+String.valueOf(year)+" / "+String.valueOf(hour)+":"+String.valueOf(minutes);
        return Date;
    }
    public int getBagValue(){
        System.out.println("Digite o Valor da Bolsa:");
        int value = sc.nextInt();
        return value;
    }

    /*---------------------------------------- 
    |                                        |
    |       ACTIVITIES AREA - CLASS A        |      - Menu.java
    |                                        |
    ----------------------------------------*/

    // ----- Entrada de dados da escolha na Área da função activitiesArea ----- //
    public int optionAreaActivities(){
        System.out.println("\nDigite a opção desejada:\n0 - Retornar Menu\n1 - Criar Atividades\n2 - Editar Atividades\n3 - Excluir Atividades");
        int option = sc.nextInt();
        return option;
    }
    public int optionEditActivity(){
        System.out.println("\nDigite a opção desejada:\n1 - Editar Id da Atividade\n2 - Editar Descrição da Atividade\n3 - Editar Periodo de Inicio da Atividade\n4 - Editar Periodo Final da Atividade");
        System.out.println("5 - Editar Coordenador da Atividade\n6 - Adicionar Usuário a Atividade\n7 - Remover Usuário\n8 - Editar Tarefa");
        int option = sc.nextInt();
        return option;
    }

    // ----- Entrada de dados na Área da função activitiesArea ----- //
    public String sourceActivities(){
        System.out.println("\nDigite o Id da Atividade Procurada:");
        sc.nextLine();
        String id = sc.nextLine();
        return id;
    }
    public String nameUser(){
        System.out.println("Digite o Nome do Usuário:");
        sc.nextLine();
        String name = sc.nextLine();
        return name;
    }
    public String taskUser(){
        System.out.println("Digite a tarefa do usuário:");
        String task = sc.nextLine();
        return task;
    }
    public void inputNextLine(){
        sc.nextLine();
    }
}
