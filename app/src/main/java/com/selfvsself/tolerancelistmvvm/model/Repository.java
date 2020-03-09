package com.selfvsself.tolerancelistmvvm.model;

import android.util.Log;

import com.selfvsself.tolerancelistmvvm.constant.Tolerance;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private List<ListItem> listItems = new ArrayList<>();
    private double upperTolerance = 0.2;
    private double lowerTolerance = -0.3;

    public Repository() {
    }

    public List<ListItem> getAll(double size, String tolerance) {
        listItems.clear();
        listItems = new ArrayList<>();
        for (Tolerance t : Tolerance.values()) {
            if (t.toString().contains(tolerance)) listItems.add(new ListItem(size, t, upperTolerance, lowerTolerance));
        }
        return listItems;
    }
}
