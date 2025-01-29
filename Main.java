/*
 * IT-2660 - Lab 1
 * Benjamin Dudra: 
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }
      // Method to return the maximum of two integers
      public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Method to return the minimum of two integers
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    // Method to return the sum of an integer array
    public static int sum(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }

    // Method to return the average of an integer array
    public static double average(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return nums.length > 0 ? (double) total / nums.length : 0;
    }

    // Method to return the maximum value in an integer array
    public static int max(int[] nums) {
        int maxVal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
            }
        }
        return maxVal;
    }

    // Method to return the minimum value in an integer array
    public static int min(int[] nums) {
        int minVal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minVal) {
                minVal = nums[i];
            }
        }
        return minVal;
    }

    public static void main(String[] args) {
        int[] values = {5, 9, 3, 12, 7, 3, 11, 5};

        // Output the array in order using a while loop
        System.out.print("Array in order: ");
        int i = 0;
        while (i < values.length) {
            System.out.print(values[i] + " ");
            i++;
        }
        System.out.println();

        // Output the array in reverse using a for loop
        System.out.print("Array in reverse: ");
        for (int j = values.length - 1; j >= 0; j--) {
            System.out.print(values[j] + " ");
        }
        System.out.println();

        // Output the first and last values of the array
        System.out.println("First value: " + values[0]);
        System.out.println("Last value: " + values[values.length - 1]);

        // Calling the methods and displaying their results
        System.out.println("Max of 5 and 9: " + max(5, 9));
        System.out.println("Min of 5 and 9: " + min(5, 9));
        System.out.println("Sum of array: " + sum(values));
        System.out.println("Average of array: " + average(values));
        System.out.println("Max value in array: " + max(values));
        System.out.println("Min value in array: " + min(values));
    }
}