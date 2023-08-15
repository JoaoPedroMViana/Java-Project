public class Bijuteria extends Loja{
    private double metaVendas;
    
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas, int quantProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantProdutos);
        this.metaVendas = metaVendas;
    }
    
    public double getMetaVendas(){
        return metaVendas;
    }
    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }
    
    public String toString(){
        return String.format(super.toString()+"\n\tMeta de vendas: R$%,.2f", metaVendas);
    }
}