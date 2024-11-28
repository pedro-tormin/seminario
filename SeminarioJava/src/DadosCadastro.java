public class DadosCadastro {
    private static String usuario;
    private static String senha;

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        DadosCadastro.usuario = usuario;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        DadosCadastro.senha = senha;
    }
}