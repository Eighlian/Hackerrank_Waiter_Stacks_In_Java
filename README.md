# Hackerrank_Waiter_Stacks_In_Java

You are a waiter at a party. There is a pile of numbered plates. Create an empty answers array. At each iteration, i, remove each plate from the top of the stack in order. Determine if the number on the plate is evenly divisible by the i^t h, prime number. If it is, stack it in pile, B_vi . Otherwise, stack it in stack A_vi. Store the values in B_vi from top to bottom in answers. In the next iteration, do the same with the values in stack A_vi. Once the required number of iterations is complete, store the remaining values in A_vi in answers, again from top to bottom. Return the answers array. 

Function Description

Complete the waiter function in the editor below.

waiter has the following parameters:

    int number[n]: the numbers on the plates
    int q: the number of iterations

Returns

    int[n]: the numbers on the plates after processing

Input Format

The first line contains two space separated integers, n and q.
The next line contains space separated integers representing the initial pile of plates, i.e., A.
