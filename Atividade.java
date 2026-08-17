import java.util.ArrayList;

public class Atividade {

    public static void main(String[] args) {
        // int multiplicador = 6;
        // int multiplicando = 4;
        // int resultado = soma(multiplicador, multiplicando);
        // System.out.println(resultado);
        // System.out.println(somaDois(multiplicador, multiplicando));
        int k = 1;
        int j = 10;
        // System.out.printf("%.2f", somaFracao(n));
        // System.out.println();
        // String pal = "azul";
        // System.out.println(inverteString(pal, 0));
        // int[] v = {7, 6, 5, 9, 4};
        // System.out.println(somaVetor(v, 0, 0));
        // System.out.println(multiplicaVetor(v, 0, 0));
        //System.out.println(somatorioEntre(k, j));

        String arara = "banana";
        //System.out.println(palindromoounao(arara, 0));

        ArrayList<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(5);

        //System.out.println(somaArray(array));
        //System.out.println(findBiggest(array));

        String sub = "Aba";
        String completa = "cateAba";
        //System.out.println(findSubStr(completa, sub));

        //System.out.println(nroDigit(1));

        System.out.println(permutations(sub));
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

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    public static int somatorio(int n) {
        if(n < 0) {
            return -1;
        }
        if(n == 0) {
            return 0;
        }
        return somatorio(n - 1) + n;
    }

    public static int somatorioEntre(int k, int j) {
        if(k < 0 || j < 0)
            return -1;
        if ((k -1) == j) {
            return 0;
        }
        if ((j -1) == k) {
            return 0;
        }
        if(k > j){
            k--;
            return somatorioEntre(k, j) + k;
        }
        if(j > k){
            j--;
            return somatorioEntre(k, j) + j;
        }
        return 0;
    }

    public static boolean palindromoounao(String palavra, int i){
        if (palavra.equals("") || palavra.length() == 1) {
            return true;
        }
        if (i == (palavra.length() - 1 ) / 2 && palavra.charAt(i) == palavra.charAt(palavra.length() - i - 1)) {
            return true;
        }
        if (palavra.charAt(i) == palavra.charAt(palavra.length() - 1 - i)) {
            return palindromoounao(palavra, i + 1);
        } else {
            return false;
        }
    }

    public static int somaArray(ArrayList<Integer> array){
        if (array.size() == 0) {
            return 0;
        }
        int valor = array.remove(0);

        return somaArray(array) + valor;
    }

    public static int findBiggest(ArrayList<Integer> array){
        
        int maior = array.get(0);

        if (array.size() == 1) {
            return maior;
        }

        if (maior > array.getLast()) {
            array.remove(array.getLast());
        }else array.remove(array.getFirst());

        return findBiggest(array);
    }

    public static boolean findSubStr(String completa, String match){
        if (completa.equals(match)) {
            return true;
        }

        if(completa.length() == 0 || completa.length() < match.length()){
            return false;
        }

        if(completa.substring(0, match.length()).equals(match)){
            return true;
        } 
        return findSubStr(completa.substring(1, completa.length()), match);
    }

    public static int nroDigit(int n){
        if (n / 10 == 0) {
            return 1;
        }
        return nroDigit(n /10) + 1;
    }

    public static ArrayList<String> permutations(String s){
        ArrayList<String> array = new ArrayList<>();

        

        array.addAll(permutations(s));

        return null;
    }
}