package equilibrium;

import java.util.Scanner;

/**
 * This class determines if an element P exists whose sum of elements on
 * its left is equal to the sum of elements on its right. In other words, it
 * simply finds an element P of array A such that: A[0] + A[1] + ... + A[P-1] =
 * A[P+1] +...+A[N-1]. If the sides are at equilibrium the standard output is a
 * "YES" otherwise, "NO". The array is a non-empty zero-indexed array A
 * consisting of N integers is given. Array A represents numbers on a tape. Any
 * element P of array splits this tape into two parts: A[0], A[1],..., A[P-1]
 * and A[P+1],..., A[N-1]. Array A contains N space separated integers.
 *
 * The runtime complexity for the program is O(N) for each test case since all
 * input is to be traversed from start to finish.
 */
/*
 * @author Paola Jiron 
 */
public class Equilibrium
{
    /**
     * Checks for P; if P is exists it outputs YES, NO otherwise.
     *@param i The input.
     *@param out YES or NO.
     */
    static void check(int i, String out){
        
        if(i == 1){
            out = "YES";
            System.out.println(out);
        }
        if(i == 2){
            System.out.println(out);
        }
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in); // read from STDIN  
        int T = stdin.nextInt();        // # of test cases to be read from STDIN
        String out= "";   // will contain the answers 
        
        for ( int i = 0; i < T ; i++)       // for each test case..
        {
            out ="NO";
            int N = stdin.nextInt();   // grab the length of the following array
            int ttlsum = 0;
            int[] A = new int[N];       

           for (int j = 0; j < N ; j++)   // add each value to int array
           {
                 A[j] = stdin.nextInt();   //store the values minus ascii val
                 ttlsum += A[j];                    // compute total sum of values
           }
            check(N, out);              // check for P
            
            int left = 0;
            int right = ttlsum;
            for(int j = 1;j< N - 1 ;j++){
                left += A[j - 1];
                right = ttlsum - A[j] - left;
                if(left == right){
                    out = "YES";
                    break;
                }
            }
            System.out.println(out);
         }
         stdin.close();  // halt the scanner
    } // end of main 
} // end of Equilibrium class definitions