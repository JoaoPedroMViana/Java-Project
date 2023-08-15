public class Vestuario extends Loja{
    private boolean produtosImportados;
    
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int quantProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantProdutos);
        this.produtosImportados = produtosImportados;
    }
    
    public boolean getProdutosImportados(){
        return produtosImportados;
    }
    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }
    
    public String toString(){
        return String.format(super.toString()+"\n\tProdutos impostados: %b", produtosImportados);
    }
}