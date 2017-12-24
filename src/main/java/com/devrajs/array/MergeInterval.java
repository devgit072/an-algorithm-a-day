package com.devrajs.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {

    public static void mergeInterval(List<Interval> intervalList)
    {
        intervalList.sort(Comparator.comparingInt(o -> o.start));
        for(Interval interval : intervalList)
        {
            System.out.print(interval.toString());
        }
        for(int i=0;i<intervalList.size()-1;i++)
        {
            Interval interval1 = intervalList.get(i);
            Interval interval2 = intervalList.get(i+1);
            if(!(interval1.end < interval2.start))
            {
                int large = interval1.end>interval2.end ? interval1.end:interval2.end;
                interval1.end=large;
                intervalList.remove(interval2);
                i--;
            }
        }
    }
    public static void main(String[] args) {
        //{6,8}, {1,9}, {2,4}, {4,7}
        List<Interval> list = new ArrayList<>(Arrays.asList(new Interval(6,8),new Interval(1,9),new Interval(2,4),new Interval(4,7),new Interval(8,10),new Interval(11,13)));
        mergeInterval(list);
        System.out.println();
        for(Interval interval : list)
        {
            System.out.print(interval.toString());
        }
    }
}

class Interval {
    int start,end;
    Interval(int start, int end)
    {
        this.start=start;
        this.end=end;
    }

    @Override
    public String toString() {
        return "["+start + " , " + end +"]";
    }
}
