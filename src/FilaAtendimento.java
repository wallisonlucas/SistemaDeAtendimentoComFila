import java.util.ArrayList;
import java.util.List;

public class FilaAtendimento {
    private List<SenhaAtendimento> senhas;

    public FilaAtendimento() {
        senhas = new ArrayList<>();
    }

    public void adicionar(SenhaAtendimento senha) {
        senhas.add(senha);
    }

    public IteratorSenha criarIterator() {
        return new FilaAtendimentoIterator(senhas);
    }
}