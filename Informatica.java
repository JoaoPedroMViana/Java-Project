public class Informatica extends Loja{
    private double seguroEletronicos;
    
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int quantProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }
    
    public double getSeguroEletronicos(){
        return seguroEletronicos;
    }
    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }
    
    public String toString(){
        return String.format(super.toString()+"\n\tValor do seguro eletrônico: R$%,.2f",seguroEletronicos);
    }
}