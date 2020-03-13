package com.selfvsself.tolerancelistmvvm.model;

import com.selfvsself.tolerancelistmvvm.model.repository89.Repository89;

import java.util.List;

public class Repository {

    private Repository89 repository89 = new Repository89();

    public Repository() {
    }

    public List<SizeWithTolerance> getAll(double size, String tolerance) {
        return repository89.getAll(size, tolerance);
    }
}
