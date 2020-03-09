package com.selfvsself.tolerancelistmvvm.viewModel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.selfvsself.tolerancelistmvvm.constant.Tolerance;
import com.selfvsself.tolerancelistmvvm.model.ListItem;
import com.selfvsself.tolerancelistmvvm.model.Repository;

import java.util.List;

public class MainActivityModel extends ViewModel {

    private Repository repository;
    private double size;
    private String tolerance;
    private MutableLiveData<List<ListItem>> listData = new MutableLiveData<>();

    public MainActivityModel() {
        repository = new Repository();
        listData.setValue(repository.getAll(1, ""));
        size = 1;
        tolerance = "";
    }

    public LiveData<List<ListItem>> getListData() {
        return listData;
    }

    public void setSizeText(String text) {
        Log.i(getClass().getName(), "setSizeText "+text);
        if (text != null) {
            try {
                size = Double.parseDouble(text);
                listData.setValue(repository.getAll(size, tolerance));
            } catch (IllegalArgumentException ignored) {

            }
        }
    }

    public void setTolerance(String tolerance) {
        if (tolerance != null) {
            this.tolerance = tolerance;
            listData.setValue(repository.getAll(size, tolerance));
        }
    }
}
