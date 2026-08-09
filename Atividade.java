public class Atividade {

    public static void main(String[] args) {
        // int multiplicador = 6;
        // int multiplicando = 4;
        // int resultado = soma(multiplicador, multiplicando);
        // System.out.println(resultado);
        // System.out.println(somaDois(multiplicador, multiplicando));
        // int n = 3;
        // System.out.printf("%.2f", somaFracao(n));
        // System.out.println();
        // String pal = "azul";
        // System.out.println(inverteString(pal, 0));
        // int[] v = {7, 6, 5, 9, 4};
        // System.out.println(somaVetor(v, 0, 0));
        // System.out.println(multiplicaVetor(v, 0, 0));
    }

    public static int soma(int multiplicador, int multiplicando) {
        if(multiplicador == 1) {
            return multiplicando;
        }
        multiplicador--;
        return soma(multiplicador, multiplicando) + multiplicando;
    }

    public static int somaDois(int num, int num2) {
        if(num2 == 0) {
            return num;
        }
        num2--;
        num++;
        return somaDois(num, num2);
    }

    public static double somaFracao(int n) {
        if(n == 1) {
            return 1;
        }
        double soma = (double) 1/n;
        n--;
        return somaFracao(n) + soma;
    }

    public static String inverteString(String palavra, int i) {
        if (i == palavra.length()) {
            return "";
        }

        return inverteString(palavra, i + 1) + palavra.charAt(i);
    }

    public static int somaVetor(int[] v, int i, int soma) {
        if(i > v.length - 1) {
            return 0;
        }
        soma = v[i];
        i++;
        return somaVetor(v, i, soma) + soma;
    }

    public static int multiplicaVetor(int v[], int i, int multiplicacao) {
        if(i > v.length - 1) {
            return 1;
        }
        multiplicacao = v[i];
        i++;
        return multiplicaVetor(v, i, multiplicacao) * multiplicacao;
    }

}