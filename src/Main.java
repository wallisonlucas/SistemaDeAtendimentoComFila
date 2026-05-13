public class Main {
    public static void main(String[] args) {
        FilaAtendimento fila = new FilaAtendimento();
        System.out.println("-------------------------------------------");
        fila.adicionar(new SenhaAtendimento("A001", "Maria", "Prioritário"));
        fila.adicionar(new SenhaAtendimento("A002", "João", "Normal"));
        fila.adicionar(new SenhaAtendimento("A003", "Carlos", "Financeiro"));
        fila.adicionar(new SenhaAtendimento("A004", "Ana", "Agendamento"));
        fila.adicionar(new SenhaAtendimento("A005", "Pedro", "Suporte"));
        IteratorSenha iterator = fila.criarIterator();
        while(iterator.temProxima()){
            SenhaAtendimento senha = iterator.proxima();
            System.out.println("Chamando senha: " + senha.toString());
        }
        System.out.println("-------------------------------------------");
    }
}