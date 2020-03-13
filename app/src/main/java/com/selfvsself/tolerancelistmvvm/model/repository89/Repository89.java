package com.selfvsself.tolerancelistmvvm.model.repository89;

import com.selfvsself.tolerancelistmvvm.constant.ToleranceValueName;
import com.selfvsself.tolerancelistmvvm.model.IRepository;
import com.selfvsself.tolerancelistmvvm.model.SizeWithTolerance;

import java.util.ArrayList;
import java.util.List;

public class Repository89 implements IRepository {

    RepositoryNumTolValues repositoryNumTolValues = new RepositoryNumTolValues();
    RepositoryNumBoundValue repositoryNumBoundValue = new RepositoryNumBoundValue();

    public Repository89() {

    }

    @Override
    public List<SizeWithTolerance> getAll(double size, String tolerance) {
        List<SizeWithTolerance> resultList = new ArrayList<>();
        List<ToleranceValue> toleranceValueList = repositoryNumTolValues.getAll(size);
        List<ToleranceValueWithBounds> boundsList = repositoryNumBoundValue.getAll(toleranceValueList);
        for (ToleranceValueWithBounds bound : boundsList) {
            String fullTolerance = bound.getTolerance().replaceAll("\\d", "") + bound.getToleranceValue().getNameValue();
            if (fullTolerance.contains(tolerance)) {
                SizeWithTolerance sizeWithTolerance = new SizeWithTolerance(size, fullTolerance, bound.getUpBound(), bound.getLowerBound());
                resultList.add(sizeWithTolerance);
            }
        }
        return resultList;
    }
}
