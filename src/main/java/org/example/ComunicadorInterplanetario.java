package org.example;

public class ComunicadorInterplanetario {
    public static int contarVocales(String mensaje) {
        int contador = 0;
        for (char c : mensaje.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static String invertirMensaje(String mensaje) {
        StringBuilder invertido = new StringBuilder();
        for (int i = mensaje.length() - 1; i >= 0; i--) {
            invertido.append(mensaje.charAt(i));
        }
        return invertido.toString();
    }

    public static boolean esPalindromo(String mensaje) {
        String mensajeSinEspacios = mensaje.replaceAll("\\s+", "").toLowerCase();
        int izquierda = 0;
        int derecha = mensajeSinEspacios.length() - 1;
        while (izquierda < derecha) {
            if (mensajeSinEspacios.charAt(izquierda) != mensajeSinEspacios.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
}