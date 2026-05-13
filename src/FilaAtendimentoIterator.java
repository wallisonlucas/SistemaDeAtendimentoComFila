import java.util.List;

public class FilaAtendimentoIterator implements IteratorSenha{
    private List<SenhaAtendimento> senhas;
    private int posicaoAtual;

    public FilaAtendimentoIterator(List<SenhaAtendimento> senhas){
        this.senhas = senhas;
        this.posicaoAtual = 0;
    }

    @Override
    public boolean temProxima() {
        return posicaoAtual < senhas.size();
    }

    @Override
    public SenhaAtendimento proxima() {
        SenhaAtendimento senha = senhas.get(posicaoAtual);
        posicaoAtual++;
        return senha;
    }
}