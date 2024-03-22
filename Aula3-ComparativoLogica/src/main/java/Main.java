public class Main {
    public static void main(String[] args) {
        System.out.println("1) 10 >= 9 -- Resposta: " + (10 >= 9));
        System.out.println("2) 10 - 21 / 7 >= 7 -- Resposta: " + ((10 - 21 / 7) >= 7));
        System.out.println("3) (1 > 2) && 17 > 10 - 2 * (3 - 1) -- Resposta: " + ((1 > 2) && (17 > 10 - 2 * (3 - 1))));
        System.out.println("4) 2 + 4 > 1 + 2 * 2 -- Resposta: " + (2 + 4 > 1 + 2 * 2));
        System.out.println("5) (10 * 2 - 1) > 10 && 10 >= 4 + 1 * 2 -- Resposta: " + ((10 * 2 - 1) > 10 && 10 >= 4 + 1 * 2));
        System.out.println("6) 10 > 2 || (5 * 2) + 10 / 2 + (10 * 3 / 2 + 1) > 20 * 3 - 1 -- Resposta: " +
                (10 > 2 || (5 * 2) + 10 / 2 + (10 * 3 / 2 + 1) > 20 * 3 - 1));
        System.out.println("7) (10 >= 2) || (10 - 2 <= 5 - 2 / 1) -- Resposta: " + ((10 >= 2) || (10 - 2 <= 5 - 2 / 1)));
        System.out.println("8) 10 + 2 + 4 / 4 >= 3 * 3 - 60 / 3 && 10 >= 60 / 6 -- Resposta: " +
                (10 + 2 + 4 / 4 >= 3 * 3 - 60 / 3 && 10 >= 60 / 6));
        System.out.println("9) 60 / 20 * 2 >= 7 - 1 -- Resposta: " + (60 / 20 * 2 >= 7 - 1));
        System.out.println("10) !(60 / 20 * 2 >= 7 - 1) -- Resposta: " + !(60 / 20 * 2 >= 7 - 1));
        System.out.println("11) 10 > 2 || 60 > 20 * 3 - 1 -- Resposta: " + (10 > 2 || 60 > 20 * 3 - 1));
        System.out.println("12) 11 + 5 / 10 - 10 <= 10 -- Resposta: " + (11 + 5 / 10 - 10 <= 10));
        System.out.println("13) verdadeira && verdadeiro && falso -- Resposta: " + (true && true && false));
        System.out.println("14) verdadeiro || falso || falso -- Resposta: " + (true || false || false));
        System.out.println("15) verdadeiro || !falso || falso -- Resposta: " + (true || !false || false));
        System.out.println("16) falso && falso || verdadeiro -- Resposta: " + (false && false || true));
        System.out.println("17) !falso -- Resposta: " + (!false));
        System.out.println("18) !verdadeiro -- Resposta: " + (!true));
        System.out.println("19) !verdadeiro && verdadeiro && !falso -- Resposta: " + (!true && true && !false));
        System.out.println("20) !(falso && falso || !verdadeiro) -- Resposta: " + !(false && false || !true));
        System.out.println("21) 2 == 4 - 2 && verdadeiro == verdadeiro && 10 * 2 - 1 > 20 -- Resposta: " +
                (2 == 4 - 2 && true == true && 10 * 2 - 1 > 20));
        System.out.println("22) 10 >= 9 && 15 * 2 + 1 >= 31 && verdadeiro -- Resposta: " +
                (10 >= 9 && 15 * 2 + 1 >= 31 && true));
        System.out.println("23) (2 >= 5) && (1 != 0) && !(6 <= 2 * 3) || (10 != 10) -- Resposta: " +
                ((2 >= 5) && (1 != 0) && !(6 <= 2 * 3) || (10 != 10)));
        System.out.println("24) (5 != 2) || !(7 > 4) && (4 <= 1.344) -- Resposta: " +
                ((5 != 2) || !(7 > 4) && (4 <= 1.344)));
        System.out.println("25) (7 <= 8) == (3/2 == 1) -- Resposta: " + ((7 <= 8) == (3.0 / 2 == 1)));
        System.out.println("26) 17.5 > 1 && (3.3 > 2) -- Resposta: " + (17.5 > 1 && (3.3 > 2)));
        System.out.println("27) 6 > 3 + 8 -- Resposta: " + (6 > 3 + 8));
        System.out.println("28) 6 + 3 > 8 -- Resposta: " + (6 + 3 > 8));
        System.out.println("29) 4 > (2 + 9) -- Resposta: " + (4 > (2 + 9)));
        System.out.println("30) 4 < 7 + 3 -- Resposta: " + (4 < 7 + 3));
        System.out.println("31) 4 < (7 * 5) -- Resposta: " + (4 < (7 * 5)));
        System.out.println("32) 1 >= 2.5 -- Resposta: " + (1 >= 2.5));
        System.out.println("33) (2 >= 5) && (1 != 0) && !(6 <= 2 * 3) || (10 == 10) -- Resposta: " +
                ((2 >= 5) && (1 != 0) && !(6 <= 2 * 3) || (10 == 10)));
    }
}
