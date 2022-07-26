package cd.get.ready.algorithms;

import java.util.HashMap;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        int count = 0;
        for(String word : input ){
            if(!hashMap.containsKey(word)){
                hashMap.put(word,0);
            }else{
                hashMap.put(word, hashMap.get(word)+1);
                count++;
            }
        }

        return count;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int count = 0;
        for( int num : input){
            if(!hashMap.containsKey(num)){
                hashMap.put(num, 1);
            }else{
                hashMap.put(num, hashMap.get(num)+1);
                count++;
            }
        }
        return count;
    }
}
