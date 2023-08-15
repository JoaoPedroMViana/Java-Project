public class Principal{
    public static void main(String[] args){
        Endereco endereco = new Endereco("Primeiro de março","São Leopoldo", "RS", "Brasil", "4004-1828", "821", " " );
        Shopping shopping = new Shopping("Shopping", endereco, 20);
        String[] nomeLojas;
        nomeLojas = new String[shopping.getLojas().length];
        boolean sair = false;
        while(!sair){
            int opcao = menu();
            System.out.println("---Opção selecionada: "+opcao+"---\n");
            switch(opcao){
                case 1:
                    String nomeLoja = Teclado.leString("Nome: "); 
                    int quantidadeFuncionarios = Teclado.leInt("Quantidade de funcionários: ");
                    double salarioBaseFuncionario = Teclado.leDouble("Salário base funcionário: ");
                    int quantProdutos = Teclado.leInt("Quantidade de produtos: ");
                
                    String nomeDaRua = Teclado.leString("\nEndereço:\nNome da rua:");
                    String cidade = Teclado.leString("Cidade:");
                    String estado = Teclado.leString("Estado:");
                    String pais = Teclado.leString("País:");
                    String cep = Teclado.leString("CEP:");
                    String numero = Teclado.leString("Número:");
                    String complemento = Teclado.leString("Complemento:");
                    
                    int lojaDia = Teclado.leInt("\nData de fundação:\nDia: ");
                    int lojaMes = Teclado.leInt("Mês: ");
                    int lojaAno = Teclado.leInt("Ano: ");
                    
                    Endereco enderecoLoja = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
                    Data dataDefundacao = new Data(lojaDia, lojaMes, lojaAno);
                    System.out.println("Selecione o tipo da loja: ");
                    boolean opcaoCerta = true;
                    do{
                        switch(tipoLoja()){
                            case "C", "c":
                                double taxaComercializacao = Teclado.leDouble("Taxa de comercialização: ");
                                Cosmetico lojaCosmetico = new Cosmetico(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataDefundacao, taxaComercializacao, quantProdutos);
                                if(shopping.insereLoja(lojaCosmetico)){
                                    System.out.println("Loja inserida!");
                                    for(int i = 0; i < nomeLojas.length; i++){
                                        if(nomeLojas[i] == null){
                                            nomeLojas[i] = lojaCosmetico.getNome();
                                            break;
                                        }
                                    }
                                }else{
                                    System.out.println("Shopping cheio! Loja não adicionada");
                                }
                                opcaoCerta = true;
                                break;
                            case "V", "v":
                                String importado = Teclado.leString("A loja possui produtos importados? (S/N)");
                                boolean produtosImportados = false; 
                                if(importado.equalsIgnoreCase("s")){
                                    produtosImportados = true;
                                }else if(importado.equalsIgnoreCase("n")){
                                    produtosImportados = false;
                                }else{
                                    System.out.println("opção invalida, definida para N");
                                }
                                Vestuario lojaVestuario = new Vestuario(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataDefundacao, produtosImportados, quantProdutos);
                                if(shopping.insereLoja(lojaVestuario)){
                                    System.out.println("Loja inserida!");
                                    for(int i = 0; i < nomeLojas.length; i++){
                                        if(nomeLojas[i] == null){
                                            nomeLojas[i] = lojaVestuario.getNome();
                                            break;
                                        }
                                    }
                                }else{
                                    System.out.println("Shopping cheio! Loja não adicionada");
                                }
                                opcaoCerta = true;
                                break;
                            case "B", "b":
                                double metaVendas = Teclado.leDouble("Meta de vendas: ");
                                Bijuteria lojaBijuteria = new Bijuteria(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataDefundacao, metaVendas, quantProdutos);
                                 if(shopping.insereLoja(lojaBijuteria)){
                                    System.out.println("Loja inserida!");
                                    for(int i = 0; i < nomeLojas.length; i++){
                                        if(nomeLojas[i] == null){
                                            nomeLojas[i] = lojaBijuteria.getNome();
                                            break;
                                        }
                                    }
                                }else{
                                    System.out.println("Shopping cheio! Loja não adicionada");
                                }
                                opcaoCerta = true;
                                break;
                            case "A", "a":
                                System.out.println("Defina a data do alvara: ");
                                int dia = Teclado.leInt("Dia:");
                                int mes = Teclado.leInt("Mês:");
                                int ano = Teclado.leInt("Ano:");
                                Data dataAlvara = new Data(dia, mes, ano);
                                Alimentacao lojaAlimentacao = new Alimentacao(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataDefundacao, dataAlvara, quantProdutos);
                                if(shopping.insereLoja(lojaAlimentacao)){
                                    System.out.println("Loja inserida!");
                                    for(int i = 0; i < nomeLojas.length; i++){
                                        if(nomeLojas[i] == null){
                                            nomeLojas[i] = lojaAlimentacao.getNome();
                                            break;
                                        }
                                    }
                                }else{
                                    System.out.println("Shopping cheio! Loja não adicionada");
                                }
                                
                                opcaoCerta = true;
                                break;
                            case "I","i":
                                double seguroEletronicos = Teclado.leDouble("Seguro eletronicos: ");
                                Informatica lojaInformatica = new Informatica(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataDefundacao, seguroEletronicos, quantProdutos);
                                if(shopping.insereLoja(lojaInformatica)){
                                    System.out.println("Loja inserida!");
                                    for(int i = 0; i < nomeLojas.length; i++){
                                        if(nomeLojas[i] == null){
                                            nomeLojas[i] = lojaInformatica.getNome();
                                            break;
                                        }
                                    }
                                }else{
                                    System.out.println("Shopping cheio! Loja não adicionada");
                                }
                                opcaoCerta = true;
                                break;
                            default:
                                System.out.println("Opção inválida");
                                opcaoCerta = false;
                        }  
                    }while(!opcaoCerta);
                    break;
                case 2:
                    String nomeProduto = Teclado.leString("Nome:  ");
                    double preco = Teclado.leDouble("Preço: ");
                    
                    int produtoDia = Teclado.leInt("\nData de validade:\nDia: ");
                    int produtoMes = Teclado.leInt("Mês: ");
                    int produtoAno = Teclado.leInt("Ano: ");
                    
                    Data dataDeValidade = new Data(produtoDia, produtoMes, produtoAno);
                    Produto produto = new Produto(nomeProduto, preco, dataDeValidade);
                    
                    System.out.println("Lojas: ");
                    System.out.println("---------------------");
                    for(int x = 0; x < nomeLojas.length; x++){
                        if(nomeLojas[x] == null){
                        
                        }else{
                            System.out.println(" - "+nomeLojas[x]);
                            System.out.println("---------------------");
                        }
                    }
                    int nomeEncontrado = 2;
                    do{
                        String nome = Teclado.leString("Digite o nome da loja que o produto deve ser adicionado:");
                            for(int x = 0; x < shopping.getLojas().length; x++){
                                if(shopping.getLojas()[x] == null){
                        
                                }else if(shopping.getLojas()[x].getNome().equalsIgnoreCase(nome)){
                                    if(shopping.getLojas()[x].insereProduto(produto)){
                                        System.out.println("Produto inserido!");
                                        nomeEncontrado = 1;
                                        break;
                                    }else{
                                        System.out.println("Loja cheia! Produto não adicionado");
                                        nomeEncontrado = 0;
                                        break;
                                    }   
                                }
                            }
                            if(nomeEncontrado == 2){
                                System.out.println("Loja não encontrada");
                                nomeEncontrado = Teclado.leInt("Digite (1) para encerrar | (2) para procurar outra loja");
                            }else if(nomeEncontrado == 0){
                                nomeEncontrado = Teclado.leInt("Digite (1) para encerrar | (2) para procurar outra loja");
                            }
                    }while(nomeEncontrado != 1);
                    break;
                case 3:
                    System.out.println("Saiu do programa");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        System.out.println(shopping);
    }
    public static int menu(){
        int opcao = Teclado.leInt("(1) Criar Loja\n(2) Criar Produto\n(3) Sair");
        return opcao;
    }
    public static String tipoLoja(){
        String tipoLoja = Teclado.leString("\n(C) Cosméticos\n(V) Vestuário\n(B) Bijuteria\n(A) Alimentação\n(I) Informática");
        return tipoLoja;
    }
}