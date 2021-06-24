public class Teste {
    public static void main(String[] args) {
        Integer number = 567;
        Integer d = 5;
        char[] digits = number.toString().toCharArray();
        for (Character digit: digits){
            System.out.println(digit);
            System.out.println((Character.getNumericValue(digit)) == 5);
        }

    }


}
