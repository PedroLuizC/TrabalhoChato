package lojaMelhorGrupo.principal;

import java.util.Scanner;

public class Introducao {
   /* private int quebraLoop;
    private int voltar;

    public static String trazmenus(){
         String menu = """
                \n********** Armazem Melhor Grupo **********
                
                Escolha:
                
                1- Gerenciar Produto.
                2- Gerenciar Estoque.
                3- Opções para Fornecedor.
                4- Sobre Nós.
                5- Sair.
                \n******************************************
                """;
        return menu;

    }


    private String menuProduto = """
                \n ***********
                
                1- Cadastrar Produto.
                2- Buscar Produto por nome.
                3- Listar Produtos.
                4- Deletar Produtos.
                5- Voltar.
                \n ***********
                """;

    private String menuEstoque = """
                \n ***********
                
                1- Adicionar Estoque de Produtos.
                2- Atualizar Estoque de produtos.
                3- Listar Produtos disponiveis.
                4- Remover Estoque de produtos.
                5- Voltar.
                \n ***********
                """;

    private String menuFornecedor = """
                \n ***********
                
                1- Cadastrar Fornecedor.
                2- Buscar Fornecedor por Nome.
                3- Listar Fornecedor.
                4- Deletar Fornecedor.
                5- Voltar.
                \n ***********
                """;

    private String sobreNos = """
            \n **********************
            
                     Sócios:
                        
                  Victor Silva
                   Pedro Luiz
                  Elton Vinicius
                 Melanni Eduarda
                Guilherme Antonino
            \n **********************
            """;

    // Area dos Constructors

    public Introducao() {
        quebraLoop = 0;
    }

    // Area dos Gets and setters


    public String getMenuProduto() {
        return menuProduto;
    }

    public String getMenuEstoque() {
        return menuEstoque;
    }

    public void setMenuEstoque(String menuEstoque) {
        this.menuEstoque = menuEstoque;
    }

    public String getMenuFornecedor() {
        return menuFornecedor;
    }

    public void setMenuFornecedor(String menuFornecedor) {
        this.menuFornecedor = menuFornecedor;
    }

    // area dos metodos

    Scanner ler = new Scanner(System.in);



    public void executarLoop(){
        while (quebraLoop != 5) {

            quebraLoop = ler.nextInt();

            switch (quebraLoop){

                case 1:
                    System.out.println(menuProduto);
                    Produto faz = new Produto();
                    faz.executarLoopProduto();
                    //voltarvoltar();
                    break;
                case 2:
                    System.out.println(menuEstoque);
                    Estoque vaiFazer = new Estoque();
                    vaiFazer.executarLoopEstoque();
                    //voltarvoltar();
                    break;
                case 3:
                    System.out.println(menuFornecedor);
                    Fornecedor fara = new Fornecedor();
                    fara.executarLoopFornecedor();
                    //voltarvoltar();
                    break;
                case 4:
                    System.out.println(sobreNos);
                    //voltarvoltar();
                    break;
                case 5:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Voce escolheu um numero invalido.");
                    //executarMenu();
            }
        }
    }

*/
}
