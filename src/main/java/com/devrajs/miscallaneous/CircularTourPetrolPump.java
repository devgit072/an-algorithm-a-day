package com.devrajs.miscallaneous;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.List;

public class CircularTourPetrolPump {
    //http://www.geeksforgeeks.org/find-a-tour-that-visits-all-stations/
    /*
    Suppose there is a circle. There are n petrol pumps on that circle. You are given two sets of data.

    1. The amount of petrol that every petrol pump has.
    2. Distance from that petrol pump to the next petrol pump.

    Calculate the first point from where a truck will be able to complete the circle
    (The truck will stop at each petrol pump and it has infinite capacity). Expected time complexity is O(n).
    Assume for 1 litre petrol, the truck can go 1 unit of distance.

For example, let there be 4 petrol pumps with amount of petrol and distance to next petrol pump value pairs as
{4, 6}, {6, 5}, {7, 3} and {4, 5}. The first point from where truck can make a circular tour is 2nd petrol pump.
Output should be “start = 1” (index of 2nd petrol pump).
     */

      /*
      Solution:
      Keep adding difference starting from 0th index and note the point where sum of difference becomes positive
      and traverse till the end. If sum remains negative there there will be no such point else if
      sum remained positive then return that point where sum became positive and remained positive till end.
      Using this algo, {7,3} will such point
      (-2) + (1) + (4) + (-1)  , 2nd index will be such point

      So time and space both will be O(n)
       */

      private static Pair<Integer, Integer> getRightStation(List<Pair<Integer, Integer>> listOfPetrolPumps)
      {
          int index=-1;
          int sum = 0;
          boolean newPump=true;
          for (int i=0;i< listOfPetrolPumps.size() ; i++)
          {
              Pair<Integer, Integer> petrolPump = listOfPetrolPumps.get(i);
              int diff= petrolPump.getKey()-petrolPump.getValue();
              sum += diff;
              if(sum > 0)
              {
                  if(newPump)
                  {
                      index = i;
                      newPump = false;
                  }
              }
              else
              {
                  newPump = true;
              }
          }
          return listOfPetrolPumps.get(index);
      }

      /*
      If you want the first circular , start from back
       */

    public static void main(String[] args) {
        Pair<Integer, Integer> res = getRightStation(
                Arrays.asList(new Pair<>(4,6), new Pair<>(6,5), new Pair<>(7,3), new Pair<>(4,5))
        );
        System.out.println(res.toString());
    }


}
