package lojaMelhorGrupo.console;

import lojaMelhorGrupo.principal.Estoque;
import lojaMelhorGrupo.principal.Fornecedor;
import lojaMelhorGrupo.principal.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lobby {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int escolhaMenu;
        int escolhaSubMenu;


        System.out.println("\n\nSejam bem vindos ao estoque Melhor Grupo!");

        do {
            // Menu Principal
            System.out.println("\n******************************************");
            System.out.println("\nEscolha:");
            System.out.println("\n1- Opções para Fornecedor.");
            System.out.println("2- Gerenciar Produto.");
            System.out.println("3- Gerenciar Estoque.");
            System.out.println("4- Sobre Nós.");
            System.out.println("0- Sair.");
            System.out.println("\n******************************************");

            escolhaMenu = scanner.nextInt();

            switch (escolhaMenu){

                // Menu do Fornecedor
                case 1:
                 do {

                    System.out.println("\n ***********");
                    System.out.println("\n1- Cadastrar Fornecedor.");
                    System.out.println("2- Buscar Fornecedor por Nome.");
                    System.out.println("3- Listar Fornecedor.");
                    System.out.println("4- Deletar Fornecedor.");
                    System.out.println("0- Voltar.");
                    System.out.println("\n ***********");
                    escolhaSubMenu = scanner.nextInt();

                    switch (escolhaSubMenu){
                        case 1:cadastrarFornecedor();
                            break;
                        case 2: buscarFornecedor();
                            break;
                        case 3: listarFornecedor();
                            break;
                        case 4: deletarForncedor();
                            break;
                        case 0:
                            System.out.println("Voltando...");
                            break;
                        default:
                            System.out.println("Número inválido!");
                    }
                }while (escolhaSubMenu != 0);
                    break;
                // Menu do Produto1
                case 2:
                    do {
                        System.out.println("\n ***********");
                        System.out.println("\n1- Cadastrar Produto.");
                        System.out.println("2- Buscar Produto por nome.");
                        System.out.println("3- Listar Produtos.");
                        System.out.println("4- Deletar Produtos.");
                        System.out.println("0- Voltar.");
                        System.out.println("\n ***********");
                        escolhaSubMenu = scanner.nextInt();

                        switch (escolhaSubMenu){
                            case 1:
                                cadastrarProduto();
                                break;
                            case 2: buscarProduto();
                                break;
                            case 3: listarProdutos();
                                break;
                            case 4: deletarProduto();
                                break;
                            case 0:
                                System.out.println("Voltando...");
                                break;
                            default:
                                System.out.println("Número inválido!");
                        }
                    }while (escolhaSubMenu !=0);
                    break;

                // Menu do Estoque
                case 3:
                    do {

                    System.out.println("\n ***********");
                    System.out.println("\n1- Adicionar Estoque de Produtos.");
                    System.out.println("2- Atualizar Estoque de produtos.");
                    System.out.println("3- Listar Produtos disponiveis.");
                    System.out.println("4- Remover Estoque de produtos.");
                    System.out.println("0- Voltar.");
                    System.out.println("\n ***********");
                    escolhaSubMenu = scanner.nextInt();

                    switch (escolhaSubMenu){
                        case 1: adicionarEstoqueDeProdutos();
                            break;
                        case 2: atualizarEstoqueDeProdutos();
                            break;
                        case 3: listarProdutosDisponiveis();
                            break;
                        case 4: removerEstoqueDeProdutos();
                            break;
                        case 0:
                            System.out.println("Voltando...");
                            break;
                        default:
                            System.out.println("Número inválido!");
                            break;
                    }
                }while (escolhaSubMenu != 0);
                break;

                // Menu dos integrantes
                case 4:
                    do {
                        System.out.println("\n**********************");
                        System.out.println("\nSócios:");
                        System.out.println("\nVictor Silva");
                        System.out.println("Pedro Luiz");
                        System.out.println("Elton Vinicius");
                        System.out.println("Melanni Eduarda");
                        System.out.println("Guilherme Antonino");
                        System.out.println("\n**********************");
                        System.out.println("\n 0- Voltar.");
                        escolhaSubMenu = scanner.nextInt();

                    } while (escolhaSubMenu !=0);
                break;
                case 0: System.out.println("Obrigado e volte sempre!");
                    break;
                default: System.out.println("Número inválido!");
                    break;
            }

        }while (escolhaMenu != 0);
    }


    // Area das Listas

    static List<Fornecedor> fornecedores = new ArrayList<>();
    static List<Produto> produtos = new ArrayList<>();
    static List<Estoque> estoques = new ArrayList<>();

    // AREA DOS METODOS PARA FORNECEDOR

    public static void cadastrarFornecedor() {
        boolean continuarCadastro = true;
        Scanner pegaDados = new Scanner(System.in);

        do {
            Fornecedor fornecedor= new Fornecedor();
            System.out.println("Digite o id(6 números): ");
            fornecedor.setId(pegaDados.nextLine());
            System.out.println("Digite o nome do fornecedor: ");
            fornecedor.setNomePessoal(pegaDados.nextLine());
            System.out.println("Digite o cnpj do fornecedor: ");
            fornecedor.setCnpj(pegaDados.nextLine());
            System.out.println("Digite o logradouro do fornecedor: ");
            fornecedor.setLogradouro(pegaDados.nextLine());
            System.out.println("Digite o bairro do fornecedor: ");
            fornecedor.setBairro(pegaDados.nextLine());
            System.out.println("Digite a cidade do fornecedor: ");
            fornecedor.setCidade(pegaDados.nextLine());
            System.out.println("Digite o estado do fornecedor: ");
            fornecedor.setEstado(pegaDados.nextLine());
            System.out.println("Digite o cep do fornecedor: ");
            fornecedor.setCep(pegaDados.nextLine());
            System.out.println("Digite o cpf do fornecedor: ");
            fornecedor.setCpf(pegaDados.nextLine());
            System.out.println("Digite o rg do fornecedor: ");
            fornecedor.setRg(pegaDados.nextLine());
            System.out.println("Digite o telefone do fornecedor: ");
            fornecedor.setTelefone(pegaDados.nextLine());
            System.out.println("Digite o email do fornecedor: ");
            fornecedor.setEmail(pegaDados.nextLine());
            System.out.println("Digite a data de nascimento do fornecedor: ");
            fornecedor.setDataNascimento(pegaDados.nextLine());

            fornecedores.add(fornecedor);
            System.out.println("\nFornecedor cadastrado com sucesso.");
            System.out.println("\nDeseja criar outro Fornecedor?(S/N)");
            String resposta = pegaDados.nextLine().toLowerCase();


            if (resposta.equals("n")) {
                continuarCadastro = false;
            }

        } while (continuarCadastro);

    }

    public static void listarFornecedor() {
        Scanner escolha = new Scanner(System.in);
        boolean confirmacao = true;
        System.out.println("Deseja a lista: \n\n1- Simplificada. \n2- Detalhada. ");
        int facilidade = escolha.nextInt();

        do {
            if (facilidade == 1) {
                System.out.println("Fornecedores registrados: ");
                for (Fornecedor criaFornecedor: fornecedores) {
                    System.out.println("\n*********************");
                    System.out.println("Id:" + criaFornecedor.getId());
                    System.out.println("Nome do fornecedor: " + criaFornecedor.getNomePessoal());
                    System.out.println("CPF: " + criaFornecedor.getCpf());
                    System.out.println("Email: " + criaFornecedor.getEmail());
                    System.out.println("*********************");
                }
            } else if (facilidade == 2) {
                System.out.println("Fornecedores registrados: ");
                for (Fornecedor criaFornecedor: fornecedores) {
                    System.out.println("\n*********************");
                    System.out.println("Nome do fornecedor: " + criaFornecedor.getNomePessoal());
                    System.out.println("Id:" + criaFornecedor.getId());
                    System.out.println("CNPJ:" + criaFornecedor.getCnpj());
                    System.out.println("Logradouro:" + criaFornecedor.getLogradouro());
                    System.out.println("Bairro:" + criaFornecedor.getBairro());
                    System.out.println("Cidade: " + criaFornecedor.getCidade());
                    System.out.println("Estado: " + criaFornecedor.getEstado());
                    System.out.println("CEP: " + criaFornecedor.getCep());
                    System.out.println("CPF: " + criaFornecedor.getCpf());
                    System.out.println("RG: " + criaFornecedor.getRg());
                    System.out.println("Telefone: " + criaFornecedor.getTelefone());
                    System.out.println("Email: " + criaFornecedor.getEmail());
                    System.out.println("Data de nascimento: " + criaFornecedor.getDataNascimento());
                    System.out.println("Data de cadastro: " + criaFornecedor.getDataCadastroFornecedor());
                    System.out.println("*********************");
                }
            }
            System.out.println("\n0-sair");
            int resposta = escolha.nextInt();

            if (resposta == 0){
                confirmacao = false;
            }
        }while (confirmacao);

    }

    public static void buscarFornecedor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do fornecedor: ");
        String nomeProcurado = scanner.nextLine();


        for (Fornecedor fornecedor : fornecedores) {

                if (fornecedor.getNomePessoal().equals(nomeProcurado)) {
                    System.out.println("\nFornecedor encontrado: " + fornecedor.getNomePessoal());
                    System.out.println("\n*********************");
                    System.out.println("Id: " + fornecedor.getId());
                    System.out.println("CNPJ: " + fornecedor.getCnpj());
                    System.out.println("Logradouro: " + fornecedor.getLogradouro());
                    System.out.println("Bairro: " + fornecedor.getBairro());
                    System.out.println("Cidade: " + fornecedor.getCidade());
                    System.out.println("Estado: " + fornecedor.getEstado());
                    System.out.println("CEP: " + fornecedor.getCep());
                    System.out.println("CPF: " + fornecedor.getCpf());
                    System.out.println("RG: " + fornecedor.getRg());
                    System.out.println("Telefone: " + fornecedor.getTelefone());
                    System.out.println("Email: " + fornecedor.getEmail());
                    System.out.println("Data de nascimento: " + fornecedor.getDataNascimento());
                    System.out.println("Data de cadastro: " + fornecedor.getDataCadastroFornecedor());
                    System.out.println("*********************");

                } else {
                System.out.println("\nFornecedor com nome '" + nomeProcurado + "' não encontrado.");
            }
        }

    }

    public static void deletarForncedor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do fornecedor: ");
        String nomeDelete = scanner.nextLine();

            for (Fornecedor f : fornecedores) {
                if (f.getNomePessoal().equals(nomeDelete)) {
                    System.out.println("\nFornecedor encontrado: ");
                    System.out.println("\n*********************");
                    System.out.println("Nome do fornecedor: " + f.getNomePessoal());
                    System.out.println("Id: " + f.getId());
                    System.out.println("CNPJ: " + f.getCnpj());
                    System.out.println("Logradouro: " + f.getLogradouro());
                    System.out.println("Bairro: " + f.getBairro());
                    System.out.println("Cidade: " + f.getCidade());
                    System.out.println("Estado: " + f.getEstado());
                    System.out.println("CEP: " + f.getCep());
                    System.out.println("CPF: " + f.getCpf());
                    System.out.println("RG: " + f.getRg());
                    System.out.println("Telefone: " + f.getTelefone());
                    System.out.println("Email: " + f.getEmail());
                    System.out.println("Data de nascimento: " + f.getDataNascimento());
                    System.out.println("Data de cadastro: " + f.getDataCadastroFornecedor());
                    System.out.println("*********************");
                    System.out.println("\nTem certeza que deseja deletar este fornecedor? (S/N)");
                    String certeza = scanner.nextLine().toLowerCase();

                    if (certeza.equals("s")) {
                        fornecedores.remove(f);
                        System.out.println("\nFornecedor deletado com sucesso.");
                        return;
                    }

                } else {
                    System.out.println("\nFornecedor com nome '" + nomeDelete + "' não encontrado.");
                }

            }

    }

    // AREA DOS METODOS PARA PRODUTO!

    public static void cadastrarProduto() {

        boolean continuarCadastro = true;
        Scanner pegaDados = new Scanner(System.in);


        do {
            Produto produto = new Produto();


            System.out.println("Lista de fornecedores cadastrados:");
            for (Fornecedor listaDefornecedores: fornecedores){
                System.out.println("\nNome: " + listaDefornecedores.getNomePessoal() +".");
            }

            System.out.println("\nDigite o nome do forncedor que está na lista:");
            produto.setNomeFornecedor(pegaDados.nextLine());


            System.out.println("Digite o nome do produto: ");
            produto.setNomeProduto(pegaDados.nextLine());
            System.out.println("Digite o id(6 números): ");
            produto.setIdProduto(pegaDados.nextLine());
            System.out.println("Digite o preço do produto: ");
            produto.setPreco(pegaDados.nextDouble());
            pegaDados.nextLine();
            System.out.println("Digite o código(4 números: ");
            produto.setCodigo(pegaDados.nextLine());
            System.out.println("Descrição do produto: ");
            produto.setDescricao(pegaDados.nextLine());


            produtos.add(produto);
            System.out.println("Produto gerado com sucesso!");
            System.out.println("\nDeseja criar outro protudo?(S/N)");
            String resposta = pegaDados.nextLine().toLowerCase();

            if (resposta.equals("n")) {
                continuarCadastro = false;
            }
        } while (continuarCadastro);
    }

    public static void listarProdutos() {
        Scanner escolha = new Scanner(System.in);
        System.out.println("Deseja a lista:\n\n1-Simplificada.\n2-Detalhada. ");
        int facilidade = escolha.nextInt();
        boolean confirmacao = true;

        do {
            if (facilidade ==1){
                System.out.println("Produtos registrados:");
                for (Produto listaProdutos1: produtos) {
                    System.out.println("\n*********************");
                    System.out.println("Nome do produto: " + listaProdutos1.getNomeProduto());
                    System.out.println("Id:" + listaProdutos1.getIdProduto());
                    System.out.println("Preço: " + listaProdutos1.getPreco());
                    System.out.println("Fornecedor: "+ listaProdutos1.getNomeFornecedor());
                    System.out.println("Data: "+ listaProdutos1.getDataFormatadaProduto());
                    System.out.println("*********************");
                }

            } else if (facilidade == 2){
                System.out.println("Produtos registrados:");
                for (Produto listaProdutos2: produtos) {
                    System.out.println("\n*********************");
                    System.out.println("Nome do produto: " + listaProdutos2.getNomeProduto());
                    System.out.println("Id:" + listaProdutos2.getIdProduto());
                    System.out.println("Código: " + listaProdutos2.getCodigo());
                    System.out.println("Preço: " + listaProdutos2.getPreco());
                    System.out.println("Descrição: "+ listaProdutos2.getDescricao());
                    System.out.println("Fornecedor: "+ listaProdutos2.getNomeFornecedor());
                    System.out.println("Data: "+ listaProdutos2.getDataFormatadaProduto());
                    System.out.println("*********************");
                }
            }

            System.out.println("\n0-sair");
            int resposta = escolha.nextInt();

            if (resposta == 0){
                confirmacao = false;
            }
        } while (confirmacao);


    }

    public static void buscarProduto(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nomeProcurado = scanner.nextLine();

            for (Produto procuraProduto : produtos) {
                if (procuraProduto.getNomeProduto().equals(nomeProcurado)) {
                    System.out.println("\nProduto encontrado: " + procuraProduto.getNomeProduto());
                    System.out.println("\n*********************");
                    System.out.println("Id:" + procuraProduto.getIdProduto());
                    System.out.println("Código: " + procuraProduto.getCodigo());
                    System.out.println("Preço: " + procuraProduto.getPreco());
                    System.out.println("Descrição: "+ procuraProduto.getDescricao());
                    System.out.println("Fornecedor: "+ procuraProduto.getNomeFornecedor());
                    System.out.println("Data: "+ procuraProduto.getDataFormatadaProduto());
                    System.out.println("*********************");
                    return;
                } else {
                    System.out.println("\nProduto com o nome '" + nomeProcurado + "' não foi encontrado.");

                }
            }

    }

    public static void deletarProduto() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nomeDelete = scanner.nextLine();

        for (Produto produtoParaDeletar : produtos) {

            if (produtoParaDeletar.getNomeProduto().equals(nomeDelete)) {
                    System.out.println("\nProduto encontrado: ");
                    System.out.println("\n*********************");
                    System.out.println("Nome do produto: " + produtoParaDeletar.getNomeProduto());
                    System.out.println("Id:" + produtoParaDeletar.getIdProduto());
                    System.out.println("Código: " + produtoParaDeletar.getCodigo());
                    System.out.println("Descrição: "+ produtoParaDeletar.getDescricao());
                    System.out.println("Fornecedor: "+ produtoParaDeletar.getNomeFornecedor());
                    System.out.println("Data: "+ produtoParaDeletar.getDataFormatadaProduto());
                    System.out.println("*********************");
                    System.out.println("\nTem certeza que deseja deletar este produto?(S/N)");
                    String certeza = scanner.nextLine().toLowerCase();

                    if (certeza.equals("s")) {
                        produtos.remove(produtoParaDeletar);
                        System.out.println("Produto deletado com sucesso.");
                        return;
                    } else {
                        break;
                    }

            } else {
                System.out.println("\nProduto com o ID '" + nomeDelete + "' não encontrado.");
            }
        }
    }

    // AREA DOS METODOS PARA ESTOQUE!

    public static void adicionarEstoqueDeProdutos() {

        boolean continuarCadastros = true;
        Scanner pegaDados = new Scanner(System.in);


        do {
            Estoque estoque = new Estoque();

            System.out.println("Lista de produtos registrados: ");
            for(Produto listaDeProdutos: produtos){
                System.out.println("Nome: " + listaDeProdutos.getNomeProduto());
            }
            System.out.println("Digite o nome do produto disponivel na lista: ");
            estoque.setNomeDoProduto(pegaDados.nextLine());

            for (Produto listaDePRodutosPreco: produtos){
                if (listaDePRodutosPreco.getNomeProduto().equalsIgnoreCase(estoque.getNomeDoProduto())){
                    estoque.setPrecoNoEstoque(listaDePRodutosPreco.getPreco());
                }
            }

            System.out.println("Digite o nome do Armazem: ");
            estoque.setArmazem(pegaDados.nextLine());
            System.out.println("Digite o número da prateleira: ");
            estoque.setNumeroDaPrateleira(pegaDados.nextLine());
            System.out.println("Digite a quantidade do Produto: ");
            estoque.setQuantidade(pegaDados.nextInt());
            pegaDados.nextLine();

            estoques.add(estoque);
            System.out.println("Deseja adicionar outro produto ao estoque?(S/N)");
            String resposta = pegaDados.nextLine().toLowerCase();

            if (resposta.equals("n")){
                continuarCadastros = false;
            }
        }while (continuarCadastros);
    }
    public static void listarProdutosDisponiveis(){
        Scanner scanner = new Scanner(System.in);
        boolean confirmacao = true;
        System.out.println("************* Estoque Melhor Grupo ***********************");

        do {
            for (Estoque listaDoEstoque: estoques){
                System.out.println("\n*********************");
                System.out.println("Nome do produto: " + listaDoEstoque.getNomeDoProduto());
                System.out.println("Armazem: " + listaDoEstoque.getArmazem());
                System.out.println("quantidade: " + listaDoEstoque.getQuantidade());
                System.out.println("Preço: " + listaDoEstoque.getPrecoNoEstoque());
                System.out.println("Prateleira: " + listaDoEstoque.getNumeroDaPrateleira());
                System.out.println("*********************");
            }

            System.out.println("\n0-sair");
            int resposta = scanner.nextInt();

            if (resposta == 0){
                confirmacao = false;
            }

        }while (confirmacao);

    }

    public static void atualizarEstoqueDeProdutos() {

        Scanner pegaDados = new Scanner(System.in);
        System.out.println("Digite o nome do produto que deseja atualizar no estoque: ");
        String nomeProcurado = pegaDados.nextLine();
        int opcao;

        for (Estoque atualizaEstoque: estoques){
                if (atualizaEstoque.getNomeDoProduto().equalsIgnoreCase(nomeProcurado)){
                    System.out.println("Produto encontrado. Escolha o que quer atualizar: ");
                    System.out.println("\n*********************");
                    System.out.println("\n1- Preço.");
                    System.out.println("2- Armazem.");
                    System.out.println("3- prateleira.");
                    System.out.println("4- Quantidade");
                    System.out.println("0- tudo");
                    System.out.println("\n*********************");
                    opcao = pegaDados.nextInt();
                    switch (opcao){

                        case 1:System.out.println("Preço: ");
                            atualizaEstoque.setPrecoNoEstoque(pegaDados.nextDouble());
                            break;
                        case 2:  System.out.println("Armazem: ");
                            atualizaEstoque.setArmazem(pegaDados.nextLine());
                            break;
                        case 3: System.out.println("prateleira: ");
                            atualizaEstoque.setNumeroDaPrateleira(pegaDados.nextLine());
                            break;
                        case 4: System.out.println("Quantiade: ");
                            atualizaEstoque.setQuantidade(pegaDados.nextInt());
                            break;
                        case 0:
                            System.out.println("Preço: ");
                            atualizaEstoque.setPrecoNoEstoque(pegaDados.nextDouble());
                            System.out.println("Armazem: ");
                            atualizaEstoque.setArmazem(pegaDados.nextLine());
                            pegaDados.nextLine();
                            System.out.println("prateleira: ");
                            atualizaEstoque.setNumeroDaPrateleira(pegaDados.nextLine());

                            System.out.println("Quantiade: ");
                            atualizaEstoque.setQuantidade(pegaDados.nextInt());
                        break;

                        default:
                            System.out.println("Número inválido!");
                        break;
                    }

                    System.out.println("Produto no estoque atualizado com sucesso!");

                } else {
                    System.out.println("Produto não encontrado.");
                }
        }

    }

    public static void removerEstoqueDeProdutos() {

        Scanner pegaDados = new Scanner(System.in);
        System.out.println("Digite o nome do produto que deseja remover do estoque: ");
        String nomeProcurado = pegaDados.nextLine();
        int novoValor;

            for (Estoque removeDoEstoque: estoques){

                if (!removeDoEstoque.getNomeDoProduto().equalsIgnoreCase(nomeProcurado)){
                    System.out.println("\nProduto no estoque Melhor Grupo de nome '" + nomeProcurado  + "' não foi encontrado.");
                } else if (removeDoEstoque.getQuantidade() == 0) {
                    System.out.println("Produto com valor 0, por favor, adicione na opção 'Atualizar estoque de produtos'.");
                } else {
                    System.out.println("Produto:" + nomeProcurado);
                    System.out.println("Quantidade atual: " + removeDoEstoque.getQuantidade());
                    System.out.println("Digite o valor que irá subtrair da quantidade atual: ");
                    novoValor = pegaDados.nextInt();

                    if (novoValor > removeDoEstoque.getQuantidade()){
                        System.out.println("Número maior que o permitido.");
                        break;
                    } else if (novoValor < 0){
                        System.out.println("Número menor que o permitido.");
                        break;
                    }

                    novoValor = removeDoEstoque.getQuantidade() - novoValor;
                    removeDoEstoque.setQuantidade(novoValor);
                    System.out.println("valor atual: " + removeDoEstoque.getQuantidade());
                }
            }


    }


}