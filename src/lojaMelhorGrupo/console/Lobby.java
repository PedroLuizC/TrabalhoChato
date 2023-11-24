package lojaMelhorGrupo.console;

import lojaMelhorGrupo.principal.Estoque;
import lojaMelhorGrupo.principal.Fornecedor;
import lojaMelhorGrupo.principal.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lobby {

    // aconselho a olharem as classes primeiro e perceber seus atributos.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int escolhaMenu;
        int escolhaSubMenu;


        System.out.println("\n\nSejam bem vindos ao estoque Melhor Grupo!");

        do {
                                // MENU PRINCIPAL
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

                            // MENU DO FORNECEDOR
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
                                // MENU DO PRODUTO
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

                                // MENU DO ESTOQUE
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

                            // MENU DOS INTEGRANTES
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


    // Area das listas - o que permite ter mais de um elemento.

    static List<Fornecedor> fornecedores = new ArrayList<>();
    static List<Produto> produtos = new ArrayList<>();
    static List<Estoque> estoques = new ArrayList<>();

    // AREA DOS METODOS PARA FORNECEDOR

    public static void cadastrarFornecedor() {
        boolean continuarCadastro = true;
        Scanner pegaDados = new Scanner(System.in); // o que se utiliza para pedir dados atraves do console.
            // O "do" permite criar mais de um fornecedor seguido.
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
            } // quebra o loop

        } while (continuarCadastro);

    }

    public static void listarFornecedor() {
        Scanner escolha = new Scanner(System.in);
        boolean confirmacaoParaSair = true;
        System.out.println("Deseja a lista: \n\n1- Simplificada. \n2- Detalhada. ");
        int facilidade = escolha.nextInt();
        // O "do" estar servindo aqui meramente para algo estetico. Onde a pessoa precisa apertar "zero" para sair.
        do {
            /* Aqui somente caso a pessoa queira uma lista simplificada ou completa.
               O que esse "Fornecedor forneceLista: fornecedores" está fazendo é a mesma coisa que:
               for(int i = 0; i < fornecedores; i++);
               ou seja, o for tá repetindo a busca e acrescentando um valor "i++" para pegar o proximo nome da lista.

            */
            if (facilidade == 1) {
                System.out.println("Fornecedores registrados: ");
                for (Fornecedor forneceLista : fornecedores) {
                    System.out.println("\n*********************");
                    System.out.println("Id:" + forneceLista.getId());
                    System.out.println("Nome do fornecedor: " + forneceLista.getNomePessoal());
                    System.out.println("CPF: " + forneceLista.getCpf());
                    System.out.println("Email: " + forneceLista.getEmail());
                    System.out.println("*********************");
                }
            } else if (facilidade == 2) {
                System.out.println("Fornecedores registrados: ");
                for (Fornecedor forneceLista : fornecedores) {
                    System.out.println("\n*********************");
                    System.out.println("Nome do fornecedor: " + forneceLista.getNomePessoal());
                    System.out.println("Id:" + forneceLista.getId());
                    System.out.println("CNPJ:" + forneceLista.getCnpj());
                    System.out.println("Logradouro:" + forneceLista.getLogradouro());
                    System.out.println("Bairro:" + forneceLista.getBairro());
                    System.out.println("Cidade: " + forneceLista.getCidade());
                    System.out.println("Estado: " + forneceLista.getEstado());
                    System.out.println("CEP: " + forneceLista.getCep());
                    System.out.println("CPF: " + forneceLista.getCpf());
                    System.out.println("RG: " + forneceLista.getRg());
                    System.out.println("Telefone: " + forneceLista.getTelefone());
                    System.out.println("Email: " + forneceLista.getEmail());
                    System.out.println("Data de nascimento: " + forneceLista.getDataNascimento());
                    System.out.println("Data de cadastro: " + forneceLista.getDataCadastroFornecedor());
                    System.out.println("*********************");
                }
            }
            System.out.println("\n0-sair");
            String resposta = escolha.nextLine().toLowerCase();

            if (resposta.equals("0")){
                confirmacaoParaSair = false;
            }
        }while (confirmacaoParaSair);

    }

    public static void buscarFornecedor() {
        Scanner scanner = new Scanner(System.in);
        boolean fornecedorEncontrado = false;
        boolean confirmacaoParaSair = true;
        System.out.println("Digite o nome do fornecedor: ");
        String nomeProcurado = scanner.nextLine();

        /* Aqui, tem uma parte nova, o "fornecedorEncontrado". Ele só está resolvendo o erro que ocorre no If-else dentro
        de um for. Sem ele, caso fossemos fazer um fornecedor novo após ter saido do metodo de cadastro, o for não estaria
        reconhecendo o novo elemento, mesmo o proprio estando lá. Indo sempre para o else.

        Por isso, o else está em outro if que só tem o trabalho de saber se existe o fornecedor ou não.

         */
        do {
            // Pelo que entendi: "Fornecedor" classe + variavel(qualquer coisa) + nome da lista existente.
            for (Fornecedor buscaFornecedor : fornecedores) {
                // o if está confirmando se o nome que colocamos existe na lista de fornecedores.
                if (buscaFornecedor.getNomePessoal().equals(nomeProcurado)) {
                    fornecedorEncontrado = true;

                    System.out.println("\nFornecedor encontrado: " + buscaFornecedor.getNomePessoal());
                    System.out.println("\n*********************");
                    System.out.println("Id: " + buscaFornecedor.getId());
                    System.out.println("CNPJ: " + buscaFornecedor.getCnpj());
                    System.out.println("Logradouro: " + buscaFornecedor.getLogradouro());
                    System.out.println("Bairro: " + buscaFornecedor.getBairro());
                    System.out.println("Cidade: " + buscaFornecedor.getCidade());
                    System.out.println("Estado: " + buscaFornecedor.getEstado());
                    System.out.println("CEP: " + buscaFornecedor.getCep());
                    System.out.println("CPF: " + buscaFornecedor.getCpf());
                    System.out.println("RG: " + buscaFornecedor.getRg());
                    System.out.println("Telefone: " + buscaFornecedor.getTelefone());
                    System.out.println("Email: " + buscaFornecedor.getEmail());
                    System.out.println("Data de nascimento: " + buscaFornecedor.getDataNascimento());
                    System.out.println("Data de cadastro: " + buscaFornecedor.getDataCadastroFornecedor());
                    System.out.println("*********************");

                }

            }
            if (!fornecedorEncontrado){
                System.out.println("\nFornecedor com nome '" + nomeProcurado + "' não encontrado.");
            }

                    System.out.println("\n0-sair");
                    String resposta = scanner.nextLine().toLowerCase();

                    if (resposta.equals("0")){
                    confirmacaoParaSair = false;
                    }
        }while (confirmacaoParaSair);

    }

    public static void deletarForncedor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do fornecedor: ");
        String nomeDelete = scanner.nextLine();
        boolean forncedorEncontrado = false;

            for (Fornecedor fornecedorParaDeletar : fornecedores) {
                if (fornecedorParaDeletar.getNomePessoal().equals(nomeDelete)) {
                    forncedorEncontrado = true;
                    System.out.println("\nFornecedor encontrado: ");
                    System.out.println("\n*********************");
                    System.out.println("Nome do fornecedor: " + fornecedorParaDeletar.getNomePessoal());
                    System.out.println("Id: " + fornecedorParaDeletar.getId());
                    System.out.println("CNPJ: " + fornecedorParaDeletar.getCnpj());
                    System.out.println("Logradouro: " + fornecedorParaDeletar.getLogradouro());
                    System.out.println("Bairro: " + fornecedorParaDeletar.getBairro());
                    System.out.println("Cidade: " + fornecedorParaDeletar.getCidade());
                    System.out.println("Estado: " + fornecedorParaDeletar.getEstado());
                    System.out.println("CEP: " + fornecedorParaDeletar.getCep());
                    System.out.println("CPF: " + fornecedorParaDeletar.getCpf());
                    System.out.println("RG: " + fornecedorParaDeletar.getRg());
                    System.out.println("Telefone: " + fornecedorParaDeletar.getTelefone());
                    System.out.println("Email: " + fornecedorParaDeletar.getEmail());
                    System.out.println("Data de nascimento: " + fornecedorParaDeletar.getDataNascimento());
                    System.out.println("Data de cadastro: " + fornecedorParaDeletar.getDataCadastroFornecedor());
                    System.out.println("*********************");
                    System.out.println("\nTem certeza que deseja deletar este fornecedor? (S/N)");
                    String certeza = scanner.nextLine().toLowerCase();

                    if (certeza.equals("s")) {
                        // remove deleta o elemento fornecedor. Caso queiramos ele de novo, teriamos que cria-lo
                        // novamente.
                        fornecedores.remove(fornecedorParaDeletar);
                        System.out.println("\nFornecedor deletado com sucesso.");
                        return;
                    }

                }

            }
            if (!forncedorEncontrado){
                System.out.println("\nFornecedor com nome '" + nomeDelete + "' não encontrado.");
            }
    }

    // AREA DOS METODOS PARA PRODUTO!

    public static void cadastrarProduto() {

        boolean continuarCadastro = true;
        String nomeProcurado;
        boolean fornecedorEncontrado = false;
        Scanner pegaDados = new Scanner(System.in);


        do {
            Produto produto = new Produto();
            // confere se tem pelo menos um fornecedor cadastrado.
            if (fornecedores.isEmpty()){
                System.out.println("Não há fornecedores cadastrados. Deseja criar um?(S/N)");
                String resposta1 = pegaDados.nextLine().toLowerCase();
                    // pergunta se quer cadastrar um.
                if (resposta1.equals("s")) {
                    cadastrarFornecedor();
                } else {
                    break;
                }

            } else {
                // oferece uma lista de fornecedores cadastrados.
                System.out.println("Lista de fornecedores cadastrados:");
                for (Fornecedor listaDefornecedores: fornecedores){
                    System.out.println("\nNome: " + listaDefornecedores.getNomePessoal() +".");
                }
            }

            System.out.println("\nDigite o nome de algum fornecedor registrado: ");
            nomeProcurado = pegaDados.nextLine();

            do {
                //Confere se o nomeProcurado bate com a lista de fornecedores.
                for (Fornecedor confereFornecedor: fornecedores){
                    if (confereFornecedor.getNomePessoal().equalsIgnoreCase(nomeProcurado)) {
                        fornecedorEncontrado = true;
                        break;
                    }
                }
                if (!fornecedorEncontrado){
                    System.out.println("Nome inválido!\nDigite o nome do forncedor que está registrado: ");
                    nomeProcurado = pegaDados.nextLine();
                }

            }while (!fornecedorEncontrado);
            produto.setNomeFornecedor(nomeProcurado);

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
            String resposta2 = pegaDados.nextLine().toLowerCase();

            if (resposta2.equals("n")) {
                continuarCadastro = false;
            }
        } while (continuarCadastro);
    }

    // Daqui para baixo ocorre as mesmas coisas com somente algumas alterações.
    public static void listarProdutos() {
        Scanner escolha = new Scanner(System.in);
        System.out.println("Deseja a lista:\n\n1-Simplificada.\n2-Detalhada. ");
        int facilidade = escolha.nextInt();
        boolean confirmacaoParaSair = true;

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
            String resposta = escolha.nextLine().toLowerCase();

            if (resposta.equals("0")){
                confirmacaoParaSair = false;
            }
        } while (confirmacaoParaSair);

    }

    public static void buscarProduto(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nomeProcurado = scanner.nextLine();
        boolean produtoEncontrado = false;

            for (Produto procuraProduto : produtos) {
                if (procuraProduto.getNomeProduto().equals(nomeProcurado)) {
                    produtoEncontrado = true;
                    System.out.println("\nProduto encontrado: " + procuraProduto.getNomeProduto());
                    System.out.println("\n*********************");
                    System.out.println("Id:" + procuraProduto.getIdProduto());
                    System.out.println("Código: " + procuraProduto.getCodigo());
                    System.out.println("Preço: " + procuraProduto.getPreco());
                    System.out.println("Descrição: "+ procuraProduto.getDescricao());
                    System.out.println("Fornecedor: "+ procuraProduto.getNomeFornecedor());
                    System.out.println("Data: "+ procuraProduto.getDataFormatadaProduto());
                    System.out.println("*********************");

                }
            }

            if (!produtoEncontrado){
                System.out.println("\nProduto com o nome '" + nomeProcurado + "' não foi encontrado.");
            }

    }

    public static void deletarProduto() {

        Scanner scanner = new Scanner(System.in);
        boolean produtoEncontrado = false;
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
            }
        }
        if (!produtoEncontrado){
            System.out.println("\nProduto com o ID '" + nomeDelete + "' não encontrado.");
        }
    }

    // AREA DOS METODOS PARA ESTOQUE!

    /* Em algumas partes haverá uma linha vazia chamada "pegaDados.nextline()" depois de uma de outra comando para
    inserir dados no console. Isso é para resolver outro bug.
    ex: veja a linha 708 e 709.

     */

    public static void adicionarEstoqueDeProdutos() {

        String nomeProcurado;
        boolean produtoEncontrado = false;
        boolean continuarCadastros = true;
        Scanner pegaDados = new Scanner(System.in);

        do {
            Estoque estoque = new Estoque();
            // confere se tem pelo menos um produto registrado.
            if (produtos.isEmpty()){
                System.out.println("Não há produtos cadastrados.\n Você deseja criar um?(S/N)");
                String resposta1 = pegaDados.nextLine().toLowerCase();

                if (resposta1.equals("s")){
                    cadastrarProduto();
                } else {
                    break;
                }
            } else {
                System.out.println("Lista de produtos registrados: ");
                for(Produto listaDeProdutos: produtos){
                    System.out.println("\nNome: " + listaDeProdutos.getNomeProduto());
                    System.out.println("Preço: " + listaDeProdutos.getPreco());
                }
            }

            System.out.println("Digite o nome do produto cadastrado: ");
            nomeProcurado = pegaDados.nextLine();

            // confere se o nome bate com os produtos registrados.
            do {
                for (Produto confereNomeDoProduto: produtos){
                    if (confereNomeDoProduto.getNomeProduto().equalsIgnoreCase(nomeProcurado)){
                        produtoEncontrado = true;
                        break;
                    }
                }
                if (!produtoEncontrado){
                    System.out.println("Nome inválido!\nDigite o nome do Produto que está registrado: ");
                    nomeProcurado = pegaDados.nextLine();
                }

            }while (!produtoEncontrado);
            estoque.setNomeDoProduto(nomeProcurado);

            // puxa o preço automaticamente do produto selecionado.
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
            String resposta2 = pegaDados.nextLine().toLowerCase();

            if (resposta2.equals("n")){
                continuarCadastros = false;
            }
        }while (continuarCadastros);
    }
    public static void listarProdutosDisponiveis(){
        Scanner scanner = new Scanner(System.in);
        boolean confirmacaoParaSair = true;
        System.out.println("************* Estoque Melhor Grupo ***********************");

        if (estoques.isEmpty()){
            System.out.println("Não há produtos disponiveis no momento.");

        } else {

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
                    confirmacaoParaSair = false;
                }

            }while (confirmacaoParaSair);

        }

    }

    public static void atualizarEstoqueDeProdutos() {

        Scanner pegaDados = new Scanner(System.in);
        int opcao;
        boolean produtoNoEstoqueEncontrado = false;

        if (estoques.isEmpty()){
            System.out.println("O estoque está vazio. Adicione produtos ao estoque.");

        } else {
            System.out.println("Digite o nome do produto que deseja atualizar no estoque: ");
            String nomeProcurado = pegaDados.nextLine();

                for (Estoque atualizaEstoque: estoques){
                    if (atualizaEstoque.getNomeDoProduto().equalsIgnoreCase(nomeProcurado)){
                        produtoNoEstoqueEncontrado = true;
                        System.out.println("Produto encontrado. Escolha o que quer atualizar: ");
                        System.out.println("\n*********************");
                        System.out.println("\n1- Preço.");
                        System.out.println("2- Armazem.");
                        System.out.println("3- prateleira.");
                        System.out.println("4- Quantidade.");
                        System.out.println("5- tudo.");
                        System.out.println("0- desistir.");
                        System.out.println("\n*********************");
                        opcao = pegaDados.nextInt();

                        switch (opcao){

                            case 1:System.out.println("Preço: ");
                                atualizaEstoque.setPrecoNoEstoque(pegaDados.nextDouble());
                                break;
                            case 2:  System.out.println("Armazem: ");
                                pegaDados.nextLine();
                                atualizaEstoque.setArmazem(pegaDados.nextLine());
                                break;
                            case 3: System.out.println("prateleira: ");
                                pegaDados.nextLine();
                                atualizaEstoque.setNumeroDaPrateleira(pegaDados.nextLine());
                                break;
                            case 4: System.out.println("Quantiade: ");
                                atualizaEstoque.setQuantidade(pegaDados.nextInt());
                                break;
                            case 5:
                                System.out.println("Preço: ");
                                atualizaEstoque.setPrecoNoEstoque(pegaDados.nextDouble());
                                System.out.println("Armazem: ");
                                atualizaEstoque.setArmazem(pegaDados.nextLine());
                                pegaDados.nextLine();
                                System.out.println("prateleira: ");
                                atualizaEstoque.setNumeroDaPrateleira(pegaDados.nextLine());
                                System.out.println("Quantiade: ");
                                atualizaEstoque.setQuantidade(pegaDados.nextInt());
                            case 0:
                                System.out.println("voltando...");
                                break;

                            default:
                                System.out.println("Número inválido!");
                                break;
                        }

                        System.out.println("Produto no estoque atualizado com sucesso!");

                    }

                }
                if (!produtoNoEstoqueEncontrado){
                    System.out.println("Produto não encontrado.");
                }

        }

    }

        // AQUI ACONTECE UM SÉRIE DE CONFIRMAÇÕES!

    public static void removerEstoqueDeProdutos() {
        int novoValor;
        boolean produtoNoEstoque = false;
        Scanner pegaDados = new Scanner(System.in);

        System.out.println("Digite o nome do produto que deseja remover do estoque: ");
        String nomeProcurado = pegaDados.nextLine();

            for (Estoque removeDoEstoque: estoques){
                // Confere se o produto procurado está no estoque.
                if (removeDoEstoque.getNomeDoProduto().equalsIgnoreCase(nomeProcurado)){
                    // bloqueia caso a quantidade do produto for 0.
                    if (removeDoEstoque.getQuantidade() == 0) {
                        System.out.println("Produto com valor '0'. Por favor, adicione na opção 'Atualizar estoque de produtos'.");
                    } else {
                        System.out.println("Produto:" + nomeProcurado);
                        System.out.println("Quantidade atual: " + removeDoEstoque.getQuantidade());

                        do {
                            System.out.println("Digite o valor que irá subtrair da quantidade atual: ");
                            novoValor = pegaDados.nextInt();

                            // informa se tentarem por um valor maior que a quantidade tem.
                            if (novoValor > removeDoEstoque.getQuantidade()) {
                                System.out.println("Número maior que o permitido.");
                                // se tentarem por um valor negativo.
                            } else if (novoValor < 0) {
                                System.out.println("Número menor que o permitido.");
                            }

                        }while (novoValor > removeDoEstoque.getQuantidade() || novoValor < 0);

                        novoValor = removeDoEstoque.getQuantidade() - novoValor;
                        removeDoEstoque.setQuantidade(novoValor);
                        System.out.println("Valor atual: " + removeDoEstoque.getQuantidade());

                        produtoNoEstoque = true;
                        break;
                    }
                }
            }

        if (!produtoNoEstoque) {
            System.out.println("\nProduto no estoque Melhor Grupo de nome '" + nomeProcurado + "' não foi encontrado.");
        }
    }

}