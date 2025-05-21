package com.ruby.java.ch09.API;
//Arrays 클래스의 메소드 실행해보기
import java.util.Arrays;
public class Test16 {
	public static void main(String[] args) {
		// 정수 배열
        int[] score = {85, 90, 95, 100, 75};
        int[] score2 = Arrays.copyOf(score, score.length);

        // 정렬 전 출력
        System.out.println("정렬 전 정수 배열:");
        System.out.println("score : " + Arrays.toString(score));
        System.out.println("score2: " + Arrays.toString(score2));

        // 정수 배열 정렬
        Arrays.sort(score); //Arrays.sort() : 오름차순 정렬 
        System.out.println("정렬 후 정수 배열:");
        System.out.println("score : " + Arrays.toString(score));

        // 정수 배열 이진 탐색
        int index = Arrays.binarySearch(score, 100); //Arrays.binarySearch() : 해당값의 인덱스 번호를 알려줌
        System.out.println("score 배열에서 100의 이진 탐색 결과 인덱스: " + index);

        // 두 배열 내용 비교
        System.out.println("정렬 후 score와 score2 equals 비교: " + Arrays.equals(score, score2)); // false
        System.out.println("\n");
        // 문자열 배열
        String[] words = {"banana", "apple", "cherry", "grape", "orange"};

        // 정렬 전 출력
        System.out.println("정렬 전 문자열 배열:");
        System.out.println(Arrays.toString(words));

        // 문자열 배열 정렬
        Arrays.sort(words);
        System.out.println("정렬 후 문자열 배열:");
        System.out.println(Arrays.toString(words));

        // 문자열 배열 이진 탐색
        int stringIndex = Arrays.binarySearch(words, "cherry");
        System.out.println("문자열 배열에서 \"cherry\"의 이진 탐색 결과 인덱스: " + stringIndex);
    
	}
}