package com.selfvsself.tolerancelistmvvm.model.repository89;

import com.selfvsself.tolerancelistmvvm.constant.SizeRange;
import com.selfvsself.tolerancelistmvvm.constant.ToleranceValueName;

import java.util.ArrayList;
import java.util.List;

public class RepositoryNumTolValues {

    public List<ToleranceValue> getAll(double size) {
        int maxSize = getMaxSize(size);
        String toleranceValues = getNumTolValues(maxSize);
        String[] toleranceValueArray = toleranceValues.split(",");
        List<ToleranceValue> resultList = new ArrayList<>();
        for (int i = 0; i < ToleranceValueName.values().length; i++) {
            String str = toleranceValueArray[i];
            String toleranceName = ToleranceValueName.values()[i].getName();
            double toleranceValue = Double.parseDouble(str);
            resultList.add(new ToleranceValue(maxSize, toleranceValue, toleranceName));
        }
        return resultList;
    }

    public static int getMaxSize(double size) {
        int maxSize = 0;
        for (SizeRange sizeRange: SizeRange.values()) {
            if (size <= sizeRange.getMaxSize()) {
                maxSize = sizeRange.getMaxSize();
                break;
            }
        }
        return maxSize;
    }

    private static String getNumTolValues(int maxSize) {
        String result = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        switch (maxSize) {
            case 3:
                result="0.0003,0.0005,0.0008,0.0012,0.002,0.003,0.004,0.006,0.01,0.014,0.025,0.04,0,06,0.10,0.14,0.25,0.40,0.60,1.00,1.40";
                break;
            case 6:
                result="0.0004,0.0006,0.001,0.0015,0.0025,0.004,0.005,0.008,0.012,0.018,0.03,0.048,0.075,0.12,0.18,0.30,0.48,0.75,1.20,1.80";
                break;
            case 10:
                result="0.0004,0.0006,0.001,0.0015,0.0025,0.004,0.006,0.009,0.015,0.022,0.036,0.058,0.09,0.15,0.22,0.36,0.58,0.90,1.50,2.20";
                break;
            case 14:
            case 18:
                result="0.0005,0.0008,0.0012,0.002,0.003,0.005,0.008,0.011,0.018,0.027,0.043,0.07,0.11,0.18,0.27,0.43,0.70,1.10,1.80,2.70";
                break;
            case 24:
            case 30:
                result="0.0006,0.001,0.0015,0.0025,0.004,0.006,0.009,0.013,0.021,0.033,0.052,0.084,0.13,0.21,0.33,0.52,0.84,1.3,2.1,3.3";
                break;
            case 40:
            case 50:
                result="0.0006,0.001,0.0015,0.0025,0.004,0.007,0.011,0.016,0.025,0.039,0.062,0.1,0.16,0.25,0.39,0.62,1.0,1.6,2.5,3.9";
                break;
            case 65:
            case 80:
                result="0.0008,0.0012,0.002,0.003,0.005,0.008,0.013,0.019,0.03,0.046,0.074,0.12,0.19,0.3,0.46,0.74,1.2,1.9,3.0,4.6";
                break;
            case 100:
            case 120:
                result="0.001,0.0015,0.0025,0.004,0.006,0.01,0.015,0.022,0.035,0.054,0.087,0.14,0.22,0.35,0.54,0.87,1.4,2.2,3.5,5.4";
                break;
            case 140:
            case 160:
            case 180:
                result="0.0012,0.002,0.0035,0.005,0.008,0.012,0.018,0.025,0.04,0.063,0.1,0.16,0.25,0.4,0.63,1.0,1.6,2.5,4.0,6.3";
                break;
            case 200:
            case 225:
            case 250:
                result="0.002,0.003,0.0045,0.007,0.01,0.014,0.02,0.029,0.046,0.072,0.115,0.185,0.29,0.46,0.72,1.15,1.85,2.9,4.6,7.2";
                break;
            case 315:
            case 355:
                result="0.0025,0.004,0.006,0.008,0.012,0.016,0.023,0.032,0.052,0.081,0.13,0.21,0.32,0.52,0.81,1.3,2.1,3.2,5.2,8.1";
                break;
            case 400:
                result="0.003,0.005,0.007,0.009,0.013,0.018,0.025,0.036,0.057,0.089,0.14,0.23,0.36,0.57,0.89,1.4,2.3,3.6,5.7,8.9";
                break;
            case 450:
            case 500:
                result="0.004,0.006,0.008,0.01,0.015,0.02,0.027,0.04,0.063,0.097,0.155,0.25,0.4,0.63,0.97,1.55,2.5,4.0,6.3,9.7";
                break;
            case 560:
            case 630:
                result="0.0045,0.006,0.009,0.011,0.016,0.022,0.03,0.044,0.07,0.11,0.175,0.28,0.44,0.7,1.1,1.75,2.8,4.4,7.0,11.0";
                break;
            case 710:
            case 800:
                result="0.005,0.007,0.01,0.013,0.018,0.025,0.035,0.05,0.08,0.125,0.2,0.32,0.5,0.8,1.25,2.0,3.2,5.0,8.0,12.5";
                break;
            case 900:
            case 1000:
                result="0.0055,0.008,0.011,0.015,0.021,0.029,0.04,0.056,0.09,0.14,0.23,0.36,0.56,0.9,1.4,2.3,3.6,5.6,9.0,14.0";
                break;
            case 1120:
            case 1250:
                result="0.0065,0.009,0.013,0.018,0.024,0.034,0.046,0.066,0.105,0.165,0.26,0.42,0.66,1.05,1.65,2.6,4.2,6.6,10.5,16.5";
                break;
            case 1400:
            case 1600:
                result="0.008,0.011,0.015,0.021,0.029,0.04,0.054,0.078,0.125,0.195,0.31,0.5,0.78,1.25,1.95,3.1,5.0,7.8,12.5,19.5";
                break;
            case 1800:
            case 2000:
                result="0.009,0.013,0.018,0.025,0.035,0.048,0.065,0.092,0.15,0.23,0.37,0.6,0.92,1.5,2.3,3.7,6.0,9.2,15.0,23.0";
                break;
            case 2240:
            case 2500:
                result="0.011,0.015,0.022,0.03,0.041,0.057,0.077,0.11,0.175,0.28,0.44,0.7,1.1,1.75,2.8,4.4,7.0,11.0,17.5,28.0";
                break;
            case 2800:
            case 3150:
                result="0.013,0.018,0.026,0.036,0.05,0.069,0.093,0.135,0.21,0.33,0.54,0.86,1.35,2.1,3.3,5.4,8.6,13.5,21.0,33.0";
                break;
        }
        return result;
    }
}
