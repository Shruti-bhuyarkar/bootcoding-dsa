package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class FindWordsThatCanBeFormedCharacters {
    public static void main(String[] args) {
        FindWordsThatCanBeFormedCharacters solution = new FindWordsThatCanBeFormedCharacters();

        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        int result = solution.countCharacters(words, chars);

        System.out.println("Sum of lengths of good strings: " + result);
    }
        public int countCharacters(String[] words, String chars) {
            int result = 0;

            // Calculate the frequency of each character in chars
            int[] charFreq = new int[26];
            for (char c : chars.toCharArray()) {
                charFreq[c - 'a']++;
            }

            // Check each word
            for (String word : words) {
                if (canFormWord(word, charFreq.clone())) {
                    result += word.length();
                }
            }

            return result;
        }

        private boolean canFormWord(String word, int[] charFreq) {
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (charFreq[index] > 0) {
                    charFreq[index]--;
                } else {
                    return false;
                }
            }
            return true;
        }


    }


