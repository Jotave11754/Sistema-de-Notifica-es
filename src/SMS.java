public class SMS {
    private String numero;

    public SMS(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "SMS{" +
                "numero='" + numero + '\'' +
                '}';
    }
}
