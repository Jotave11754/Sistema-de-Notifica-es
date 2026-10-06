
void main() {


    Notificador notificador = new Notificador();
    String email = IO.readln("Insira seu email: ");
    String numero = IO.readln("Insira seu número: ");

    IO.println("Enviando SMS para o numero: " + numero);
    IO.println("Enviando para o email: " + email);
}