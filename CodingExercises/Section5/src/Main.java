public class Main {

    public static void main(String[] args) {
        NumberPalindrome.isPalindrome(-275);
        NumberPalindrome.isPalindrome(3456);
        NumberPalindrome.isPalindrome(-33);
        NumberPalindrome.isPalindrome(45654);
        System.out.println("FirstLastDigitSum of 5 = " + FirstLastDigitSum.sumFirstAndLastDigit(5));
        System.out.println("FirstLastDigitSum of 193 = " + FirstLastDigitSum.sumFirstAndLastDigit(193));
        System.out.println("FirstLastDigitSum of -7 = " + FirstLastDigitSum.sumFirstAndLastDigit(-7));
        System.out.println("FirstLastDigitSum of 0 = " + FirstLastDigitSum.sumFirstAndLastDigit(0));
        System.out.println("EvenDigitSum of 3 = " + EvenDigitSum.getEvenDigitSum(3));
        System.out.println("EvenDigitSum of -56 = " + EvenDigitSum.getEvenDigitSum(-56));
        System.out.println("EvenDigitSum of 195478 = " + EvenDigitSum.getEvenDigitSum(195478));
        System.out.println("EvenDigitSum of 24 = " + EvenDigitSum.getEvenDigitSum(24));
        System.out.println("PerfectNumber of 7" + PerfectNumber.isPerfectNumber(7));
        NumberToWords.numberToWords(567);
        NumberToWords.numberToWords(004);
        DiagonalStar.printSquareStar(10);
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));
    }

}
