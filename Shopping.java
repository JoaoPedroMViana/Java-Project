public class Shopping{ 
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    
    public Shopping(String nome, Endereco endereco, int quantLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantLojas];
    }
    
    public String getNome(){
        return nome;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public Loja[] getLojas(){
        return lojas;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public void setLojas(Loja[] lojas){
        this.lojas = lojas;
    }
    
    public String toString(){
        return String.format("Nome: %s\n"+endereco+"\n"+"Lojas(espaço total["+lojas.length+"]): "+this.lojas(), nome);
    }
    public String lojas(){//metodo para usar no toString
        String loja = "\n";
        for(int x = 0; x < this.lojas.length; x++){
            if(this.lojas[x] == null){
            }else{
                loja += "Loja "+(x+1)+" - "+lojas[x].toString()+"\n";
            }
        }
        return loja;
    }
    
    public boolean insereLoja(Loja loja){
        boolean inserida = false;
        for(int x = 0; x < lojas.length; x++){
            if(lojas[x] == null){
                lojas[x] = loja;
                inserida = true;
                break;
            }
        }
        return inserida;
    }    
    public boolean removeLoja(String nomeLoja){
        boolean removido = false;
        for(int x = 0; x < lojas.length; x++){
            if(lojas[x] == null){
            }else{
                if(lojas[x].getNome().equalsIgnoreCase(nomeLoja)){
                    lojas[x] = null;
                    removido = true;
                    break;
                }
            }
        }
        return removido;
    }
    public int quantidadeLojasPorTipo(String tipoLoja){
        int quantidade = 0;
        for(int x = 0; x < lojas.length; x++){
            if(tipoLoja.equals("Cosmético") && lojas[x] instanceof Cosmetico){
                quantidade++;
            }else if(tipoLoja.equals("Vestuário") && lojas[x] instanceof Vestuario){
                quantidade++;
            }else if(tipoLoja.equals("Bijuteria") && lojas[x] instanceof Bijuteria){
                quantidade++;
            }else if(tipoLoja.equals("Alimentação") && lojas[x] instanceof Alimentacao){
                quantidade++;
            }else if(tipoLoja.equals("Informática") && lojas[x] instanceof Informatica){
                quantidade++;
            }
        }
        if(quantidade != 0){
        }else{
            quantidade = -1;
        }
        return quantidade;
    }
    public Informatica lojaSeguroMaisCaro(){
        Loja lojaSeguroMaisAlto = lojas[0];
        for(int x = 1; x < lojas.length; x++){
            if(lojas[x] instanceof Informatica){
                if(((Informatica)lojas[x]).getSeguroEletronicos() > ((Informatica)lojaSeguroMaisAlto).getSeguroEletronicos()){
                    lojaSeguroMaisAlto = lojas[x];
                }
            }
        }
        Informatica lojaInfo = null;
        if(lojaSeguroMaisAlto instanceof Informatica){
            lojaInfo = ((Informatica)lojaSeguroMaisAlto);
        }
        return lojaInfo;
    }
}