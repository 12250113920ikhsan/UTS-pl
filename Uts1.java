package uts;

import java.util.Scanner;

public class Uts1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Isi array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        main inputAngka = new main();
        inputAngka.cariAngka(numbers);

    }

    public void cariAngka(int[] numbers) {
        boolean angkaSama = false;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    angkaSama = true;
                    break;
                }
            }
            if (angkaSama) {
                break;
            }
        }

        System.out.println("Terdapat angka sama? " + angkaSama);
    }
}