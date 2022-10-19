package POO.aula02;

public class Main {

    /* Mérodo main é o metodo principal e necessario para execução do projeto * a JVM vai procurar esse método */
    //Atalho main ctrl enter

    public static void main(String[] args) {

        //Atalho sout
        String texto1 = "Olá Mundo!!!";
        System.out.println("Sejam bem vindos!");
        System.out.println(texto1);

        //Concatenando
        System.out.println("teste de concatenação. " + texto1);

        //Operador matemáticos
        Integer valor1 = 15;
        Integer valor2 = 12;
        Integer total = valor1 + valor2;
        System.out.printf("Resultado: " + (valor1+valor2));
    }


}
