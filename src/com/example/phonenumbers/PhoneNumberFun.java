package com.example.phonenumbers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberFun {

    private static char[][] letters = {
            {'A', 'B', 'C'},
            {'D', 'E', 'F'},
            {'G', 'H', 'I'},
            {'J', 'K', 'L'},
            {'M', 'N', 'O'},
            {'P', 'Q', 'R', 'S'},
            {'T', 'U', 'V'},
            {'W', 'X', 'Y', 'Z'},
    };

    public static void main(String[] args) {

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("numbers.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String numberString = readNumberString();

        int[] number = new int[7];

        for(int i = 0; i < number.length; i++) {
            number[i] = Character.getNumericValue(numberString.charAt(i)) - 2;
        }

        for(int n0 = 0; n0 < letters[number[0]].length; n0++) {
            for(int n1 = 0; n1 < letters[number[1]].length; n1++) {
                for(int n2 = 0; n2 < letters[number[2]].length; n2++) {
                    for(int n3 = 0; n3 < letters[number[3]].length; n3++) {
                        for(int n4 = 0; n4 < letters[number[4]].length; n4++) {
                            for(int n5 = 0; n5 < letters[number[5]].length; n5++) {
                                for(int n6 = 0; n6 < letters[number[6]].length; n6++) {

                                    StringBuilder stringBuilder = new StringBuilder();

                                    stringBuilder.append(letters[number[0]][n0]);
                                    stringBuilder.append(letters[number[1]][n1]);
                                    stringBuilder.append(letters[number[2]][n2]);
                                    stringBuilder.append(letters[number[3]][n3]);
                                    stringBuilder.append(letters[number[4]][n4]);
                                    stringBuilder.append(letters[number[5]][n5]);
                                    stringBuilder.append(letters[number[6]][n6]);

                                    stringBuilder.append("\n");

                                    System.out.print(stringBuilder);

                                    try {
                                        bufferedWriter.write(stringBuilder.toString());
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        try {
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}                
    }

    private static String readNumberString() {
        Scanner scanner = new Scanner(System.in);

        String numberString;
        boolean valid = true;

        do {

            valid = true;

            System.out.println("Please enter a 7 digit number (wihtout a 0 or a 1):");

            numberString = scanner.nextLine();

            Pattern pattern = Pattern.compile("[2-7]{7}");
            Matcher matcher = pattern.matcher(numberString);

            if(!matcher.find()) {
                valid = false;

                System.out.println("Error!  Please enter a valid phone number\n");            
            }

        } while(!valid);                  

        scanner.close();

        return numberString;
    }

}

