package com.liupeng.learning.impl;

import com.liupeng.learning.Search;

import java.util.List;

public class DatabaseSearch implements Search {
    @Override public List<String> search(String keyword) {
        System.out.println("Search Database '" +keyword+"'");
        return null;
    }
}
