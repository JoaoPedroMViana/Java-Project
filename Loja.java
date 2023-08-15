public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;
    
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantProdutos];
    }
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        salarioBaseFuncionario = -1;
        this.estoqueProdutos = new Produto[quantProdutos];
    }
    public String getNome(){
        return nome;
    }
    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }
    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public Data getDataFundacao(){
        return dataFundacao;
    }
    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;   
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }
    public void setEstoqueProdutos(Produto[] estoqueProdutos){
        this.estoqueProdutos = estoqueProdutos;
    }
    public String toString(){
        return String.format("Nome: %s, Quantidade de funcionários: %d, Salário base funcionário: R$%,.2f\n\t"+endereco+"\n\tData de fundação: "+dataFundacao+"\n\tProdutos(espaço total ["+estoqueProdutos.length+"]): "+this.produtos(), nome, quantidadeFuncionarios, salarioBaseFuncionario);
    }
    public double gastosComSalario(){
        double gastos = quantidadeFuncionarios * salarioBaseFuncionario;
        if (salarioBaseFuncionario == -1){
            return -1;
        } else {
            return gastos;
        }
    }
    public char tamanhoDaLoja(){
        if (quantidadeFuncionarios < 10){
            return 'P';
        } else if (quantidadeFuncionarios <= 30){
            return 'M';
        } else {
            return 'G';
        }
    }
    public void imprimeProdutos(){
        for(int x = 0; x < estoqueProdutos.length; x++){
            if(estoqueProdutos[x] == null){
            }else{
                System.out.println(estoqueProdutos[x]);
                System.out.println("------------------");
            }
        }
    }
    public boolean insereProduto(Produto novoProduto){
        boolean inserido = false;
        for(int x = 0; x < estoqueProdutos.length; x++){
            if(estoqueProdutos[x] == null){
                estoqueProdutos[x] = novoProduto;
                inserido = true;
                break;
            }
        }
        return inserido;
    }
    public boolean removeProduto(String nomeProduto){
        boolean removido = false;
        for(int x = 0; x < estoqueProdutos.length; x++){
            if(estoqueProdutos[x] == null){
            }else{
                if(estoqueProdutos[x].getNome().equalsIgnoreCase(nomeProduto)){
                    estoqueProdutos[x] = null;
                    removido = true;
                    break;
                }
            }
        }
        return removido;
    }
    public String produtos(){//metodo para usar no toString
        String produtos = "";
        for(int x = 0; x < estoqueProdutos.length; x++){
            if(estoqueProdutos[x] == null){
            }else{
                produtos += "\n\t\tProduto "+(x+1)+" - "+estoqueProdutos[x].toString();
            }
        }
        return produtos;
    }
}