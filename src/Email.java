public class Email {
    private String endereco;

    public Email(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Email{" +
                "endereco='" + endereco + '\'' +
                '}';
    }
}
