package lojaMelhorGrupo.principal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


    public class Produto{

        private String idProduto;
        private String codigo;
        private String nomeProduto;
        private String descricao;
        private String nomeFornecedor;

        private double preco;

        // Configurações da Data
        LocalDateTime dataCadastroProduto = LocalDateTime.now();
        DateTimeFormatter dataEstilosa = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        private String dataFormatadaProduto = dataCadastroProduto.format(dataEstilosa);

        // Area dos Contructors

        public Produto() {
        }

        public Produto(String idProduto, String codigo, String nomeProduto, String descricao, String nomeFornecedor, double preco, String dataFormatadaProduto) {
            this.idProduto = idProduto;
            this.codigo = codigo;
            this.nomeProduto = nomeProduto;
            this.descricao = descricao;
            this.nomeFornecedor = nomeFornecedor;
            this.preco = preco;
            this.dataFormatadaProduto = dataFormatadaProduto;
        }

        // Area dos Gets and setters


        public String getIdProduto() {
            return idProduto;
        }

        public void setIdProduto(String idProduto) {
            this.idProduto = idProduto;
        }

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getNomeProduto() {
            return nomeProduto;
        }

        public void setNomeProduto(String nomeProduto) {
            this.nomeProduto = nomeProduto;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public String getNomeFornecedor() {
            return nomeFornecedor;
        }

        public void setNomeFornecedor(String nomeFornecedor) {
            this.nomeFornecedor = nomeFornecedor;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public String getDataFormatadaProduto() {
            return dataFormatadaProduto;
        }

        public void setDataFormatadaProduto(String dataFormatadaProduto) {
            this.dataFormatadaProduto = dataFormatadaProduto;
        }

    }
