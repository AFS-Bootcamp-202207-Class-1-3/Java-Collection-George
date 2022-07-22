package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 != 0)
                .reduce( (num1,num2) -> num2).get();
    }

    public String getLongest(List<String> words) {
        return words.stream()
                .reduce(words.get(0), (result, word) -> result.length() > word.length() ? result : word);
    }

    public int getTotalLength(List<String> words) {
        return words.stream()
                .reduce((totalWord, word) -> totalWord + word).get().length();
//        return words.stream()
//                .map(String::length)
//                .reduce((sum, length) -> sum+length).get();
    }
}
