public class SenhaAtendimento {
    private String identificacao;
    private String nome;
    private String tipoAtendimento;

    public SenhaAtendimento(String identificacao, String nome, String tipoAtendimento) {
        this.identificacao = identificacao;
        this.nome = nome;
        this.tipoAtendimento = tipoAtendimento;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public String toString() {
        return identificacao + " - " + nome + " - " + tipoAtendimento;
    }
}