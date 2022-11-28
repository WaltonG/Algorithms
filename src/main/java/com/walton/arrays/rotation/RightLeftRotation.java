package com.walton.arrays.rotation;

import java.util.Arrays;

/**
 * Given an array of integers arr[] of size N and an integer, the task is to rotate the array
 * elements to the left and right by d positions.
 */
public class RightLeftRotation {

  public static void rightRotation(int arr[], int N, int d){
    int temp[] = new int[N];
    int tempIndex = 0;

    for(int i = N - d; i < N; i++){
      temp[tempIndex] = arr[i];
      tempIndex++;
    }

    for(int i = 0; i < N - d; i++){
      temp[tempIndex] = arr[i];
      tempIndex++;
    }

    System.out.print(Arrays.toString(temp));

  }

  public static void leftRotation(int arr[], int N, int d){
    int temp[] = new int[N];
    int tempIndex = 0;

    for(int i = d; i < N; i++){
      temp[tempIndex] = arr[i];
      tempIndex++;
    }

    for(int i = 0; i < d; i++){
      temp[tempIndex] = arr[i];
      tempIndex++;
    }

    System.out.print(Arrays.toString(temp));

  }

  public static void main(String[] args){
    leftRotation(new int[]{3, 4, 5, 6, 7, 1, 2}, 7, 2);
  }

}
