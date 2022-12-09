package com.revature.problem2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<String> autoComplete(List<String> list) {
        //throw new RuntimeException("TODO! Needs implementation...");

        List<String> solution = new ArrayList<>();
        String s = list.get(0);

        for(int i = 1; i < list.size(); i++)
            if(list.get(i).length() >= s.length())
                if(list.get(i).substring(0, s.length()).equals(s))
                    solution.add(list.get(i));

        return sortAlpha(solution);
    }

    public List<String> sortAlpha(List<String> list) {
        String temp;
        for (int i = 0; i < list.size() - 1; i++)
            for (int j = i + 1; j < list.size(); j++)
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }

        return list;
    }
}
