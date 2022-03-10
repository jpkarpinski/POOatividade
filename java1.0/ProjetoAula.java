public class ProjetoAula {
    
    public static void main(String[] args){
        //Declaração de variavel
        Carro meuCarro = new Carro();//Instancia de classe
        
        //atribuição de valores
        meuCarro.anoFabricacao = 2022;
        meuCarro.chassi = "n324982374de9t383278";
        meuCarro.cor = "Vermelho";
        meuCarro.fabricante = "Fiat";
        meuCarro.motor = "1.4";
        meuCarro.modelo = "Uno";
        
        Entidade eu = new Entidade();

        eu.cidade = "Sinop";
        eu.documento = "xxx-xxx-xxx-xx";
        eu.logradouro = "Rua Pisa";
        eu.nome = "Joao";
        eu.pontos = 25;

        meuCarro.proprietario = eu;

        

        System.out.println(meuCarro.proprietario.nome);
        System.out.println(eu.nome);
    }
}
