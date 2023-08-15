public class Data{
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano){
        boolean valida = true;
        if (mes <=12){
            if (mes == 2){
                if (verificaAnoBissexto()){
                    if (dia <=29){
                    
                    }else{
                    valida = false;
                    }
                }else if (dia <=28){
                
                    }else{
                        valida = false;
                    }
            }else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
                if (dia <=30){
                
                }else{
                    valida = false;
                }
            }else if (dia <=31){
            
            }else{
                valida = false;
            }
        }else{
            valida = false;
        }
        if (valida == true){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else{
            System.out.println("Erro! Data inválida!");
            System.out.println("A data foi definida como 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public String toString(){
        return String.format("%02d/%02d/%d", dia, mes, ano);
    }
    public boolean verificaAnoBissexto(){
        if (ano % 4 == 0){
            return true;
        }else{
            return false;
        }
    }
    }