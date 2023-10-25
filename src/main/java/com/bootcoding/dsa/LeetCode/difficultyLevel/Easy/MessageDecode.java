package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;
import java.util.HashMap;
    public class MessageDecode {
        public static void main(String[] args) {
            String key = "the quick brown fox jumps over the lazy dog" ;
            String message = "vkbs bs t suepuv";
            String decodedMessage = decodeMessage(key, message);
            System.out.println("Key: " + key);
            System.out.println("Message: " + message);
            System.out.println("Decoded Message: " + decodedMessage);
        }
        public static String decodeMessage(String key, String message) {
            StringBuilder ans = new StringBuilder();
            HashMap<Character, Character> map = new HashMap<>();
            key = key.replace(" ", "");
            char ch = 'a';
            for (char i : key.toCharArray()) {
                if (!map.containsKey(i)) {
                    map.put(i, ch++);
                }
            }
            for (char i : message.toCharArray()) {
                if (map.containsKey(i)) {
                    ans.append(map.get(i));
                } else {
                    ans.append(i);
                }
            }
            return ans.toString();
        }

    }


