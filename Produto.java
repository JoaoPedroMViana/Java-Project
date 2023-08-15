public class Produto{
    private String nome;
    private double preco;
    private Data dataValidade;
    
    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public Data getDataValidade(){
        return dataValidade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }
    public String toString(){
        return String.format("Nome: %s, Preço: R$%,.2f, Data de validade: "+dataValidade, nome, preco);
    }
    public boolean estaVencido(Data data){
        boolean vencido = false;
        if(data.getAno() > dataValidade.getAno()){
            vencido = true;
        }else if(data.getAno() == dataValidade.getAno()){
            if(data.getMes() > dataValidade.getMes()){
                vencido = true;
            }else if(data.getMes() == dataValidade.getMes()){
                if(data.getDia() < dataValidade.getDia()){
                    
                }else{
                    vencido = true;
                }
            }
        }
        return vencido; 
    }
}