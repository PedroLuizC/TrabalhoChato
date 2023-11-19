package lojaMelhorGrupo.principal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fornecedor extends Pessoa {

    // Area dos Atributos
    LocalDateTime dataCadastroFornecdor = LocalDateTime.now();
    DateTimeFormatter dataEstilosa = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
    private String dataCadastroFornecedor = dataCadastroFornecdor.format(dataEstilosa);

    // Area dos construtores

    public Fornecedor(){
    }
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
