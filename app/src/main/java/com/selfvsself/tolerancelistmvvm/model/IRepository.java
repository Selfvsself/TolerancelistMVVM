package com.selfvsself.tolerancelistmvvm.model;

import java.util.List;

public interface IRepository {

    List<SizeWithTolerance> getAll(double size, String tolerance);
}
