package lojaMelhorGrupo.principal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fornecedor extends Pessoa {

    // Area dos Atributos

        // aqui só está fazendo a data ficar mais bonita.
            // no código, a data é inserida automaticamente assim que cadastra algo.
    // não precisamos por ela, só puxar(get) por debaixo dos panos. Até porque quem cria a data
    // é o proprio console.
    LocalDateTime dataCadastroFornecdor = LocalDateTime.now(); // pega a data do console
    DateTimeFormatter dataEstilosa = DateTimeFormatter.ofPattern("E, MMM dd yyyy"); // deixa bonito.
    private String dataCadastroFornecedor = dataCadastroFornecdor.format(dataEstilosa); // manda para o atributo.

    // Area dos construtores

    public Fornecedor(){
    }

    // Como Fornecedor herda Pessoa. Posso puxar o construtor de pessoa para o Fornecedor com o super();
    public Fornecedor(String id, String nomePessoal, String cnpj, String logradouro, String bairro, String cidade, String estado, String cep, String cpf, String rg, String telefone, String email, String dataNascimento, String dataCadastro, String dataCadastroFornecedor) {
        super(id, nomePessoal, cnpj, logradouro, bairro, cidade, estado, cep, cpf, rg, telefone, email, dataNascimento);
        this.dataCadastroFornecedor = dataCadastroFornecedor;
    }

    // Area dos Getters and setters

    public String getDataCadastroFornecedor() {
        return dataCadastroFornecedor;
    }

    public void setDataCadastroFornecedor(String dataCadastroFornecedor) {
        this.dataCadastroFornecedor = dataCadastroFornecedor;
    }

}
