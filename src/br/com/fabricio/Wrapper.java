package br.com.fabricio;

public class Wrapper {

    public static void main(String[] args) {

        int valorPrimitivo = 36;
        System.out.println("Variavel tipo primitivo.");
        System.out.println(valorPrimitivo);

        Integer valorWrapper = valorPrimitivo;
        System.out.println("Variavel tipo Wrapper");
        System.out.println(valorWrapper);

    }
}
