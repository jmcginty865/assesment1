package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        String answer = "";

            for (int i = 0; i <= stringArray.length; i++){
                String[] holder = new String [stringArray.length];

                holder [i] += stringArray[i] + " ";

                if(holder[i] != " "){
                    answer += holder[i];
                    break;
                }

            }
        return answer;
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        return null;
    }

    /**
     * @param stringArray an array of String objects
     * @return the last element in the array
     */
    public static String getLastElement(String[] stringArray) {
        String answer = "";

        int i = stringArray.length -1;

        while(stringArray[i] != ","){

            answer += stringArray[i];

            break;
        }
        return answer;
    }

    /**
     * @param stringArray an array of String objects
     * @return the second to last element in the array
     */
    public static String getSecondToLastElement(String[] stringArray) {
        return null;
    }
}
