public class Notificador {
    private Email email;
    private SMS sms;

    public Notificador() {
        this.email = email;
        this.sms = sms;
    }

    public Notificador(String email, String numero) {
    }

    @Override
    public String toString() {
        return "Notificador{" +
                "email=" + email +
                ", sms=" + sms +
                '}';
    }
}
