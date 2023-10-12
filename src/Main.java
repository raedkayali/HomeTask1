import java.util.Scanner;

public class Main {

    public static void problem1() {
        int sunDiameter = 865000;
        int earthDiameter = 7600;
        long sunVolume = (long) (4.0 / 3.0 * Math.PI * Math.pow(sunDiameter / 2, 3));
        long earthVolume = (long) (4.0 / 3.0 * Math.PI * Math.pow(earthDiameter / 2, 3));
        long earthsInSun = sunVolume / earthVolume;

        System.out.println("The volume of the Earth is "+ earthVolume + " cubic miles, the volume of the sun is  "+ sunVolume + " cubic miles, and the ratio of the volume of the Sun to the volume of the Earth is " + earthsInSun );
    }
    public static void problem2() {
        //get nValues from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int nValues = sc.nextInt();


        boolean isPrime = true;
        for(int i = 2; i <= nValues; i++)
        {
            isPrime = true;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(i);
        }
    }
    public static void problem3(){
                String text = "To be or not to be, that is the question;"
                        + "Whether `tis nobler in the mind to suffer"
                        + " the slings and arrows of outrageous fortune,"
                        + " or to take arms against a sea of troubles,"
                        + " and by opposing end them?";

                int spaces = 0;
                int vowels = 0;
                int letters = 0;

                text = text.toLowerCase();

                for (int i = 0; i < text.length(); i++)
                {
                    char c = text.charAt(i);

                    if (c == ' ')
                    {
                        spaces++;
                    }
                    else if (c >= 'a' && c <= 'z')
                    {
                        letters++;
                        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                        {
                            vowels++;
                        }
                    }
                }

                System.out.println("The text contained vowels: " + vowels + "\n" +
                        "consonants: " + (letters-vowels) + "\n" +
                        "spaces: " + spaces);


    }
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].compareTo(arr[i]) > 0) {
                    String temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
    public static void problem4(){
        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        String[] words = text.replaceAll("[^a-zA-Z\\s]", "").toLowerCase().split("\\s+");
        bubbleSort(words);
        for (String word : words) {
            System.out.println(word);
        }
    }
    public static void main(String[] args)
    {
        problem1();
        problem2();
        problem3();
        problem4();
    }
}