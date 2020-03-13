package com.selfvsself.tolerancelistmvvm.model.repository89;

import com.selfvsself.tolerancelistmvvm.constant.ToleranceList;
import com.selfvsself.tolerancelistmvvm.constant.TypeTolerance;

import java.util.ArrayList;
import java.util.List;

public class RepositoryNumBoundValue {

    public List<ToleranceValueWithBounds> getAll(List<ToleranceValue> toleranceValueList) {
        List<ToleranceValueWithBounds> resultList = new ArrayList<>();
        for (ToleranceValue toleranceValue : toleranceValueList) {
            resultList.addAll(getAllForOneTolerance(toleranceValue));
        }
        return resultList;
    }

    public List<ToleranceValueWithBounds> getAllForOneTolerance(ToleranceValue toleranceValue) {
        int maxSize = toleranceValue.getMaxSize();
        String boundValues = getBound(maxSize);
        String[] boundValuesArray = boundValues.split(",");
        List<ToleranceValueWithBounds> resultList = new ArrayList<>();
        for (int i = 0; i < ToleranceList.values().length; i++) {
            String boundValue = boundValuesArray[i];
            if (!boundValue.equals("null")) {
                double bound = Double.parseDouble(boundValue);
                TypeTolerance typeTolerance = TypeTolerance.Shaft;
                ToleranceList toleranceList = ToleranceList.values()[i];
                if (toleranceList.toString().equalsIgnoreCase("js")) typeTolerance = TypeTolerance.Middle;
                ToleranceValueWithBounds valueWithBounds = new ToleranceValueWithBounds(typeTolerance, toleranceValue, bound, toleranceList.toString());
                resultList.add(valueWithBounds);
            }
        }
        return resultList;
    }

    private static String getBound(int maxSize) {
        String result = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        switch (maxSize) {
            case 3:
                result="-0.27,-0.14,-0.06,-0.034,-0.02,-0.014,-0.01,-0.006,-0.004,-0.002,0,null,-0.002,-0.004,-0.006,0,0,0.002,0.004,0.006,0.01,0.014,null,0.018,null,0.02,null,0.026,0.032,0.04,0.06";
                break;
            case 6:
                result="-0.27,-0.14,-0.07,-0.046,-0.03,-0.02,-0.014,-0.01,-0.006,-0.004,0,null,-0.002,-0.004,null,0.001,0,0.004,0.008,0.012,0.015,0.019,null,0.023,null,0.028,null,0.035,0.042,0.05,0.08";
                break;
            case 10:
                result="-0.28,-0.15,-0.08,-0.056,-0.04,-0.025,-0.018,-0.013,-0.008,-0.005,0,null,-0.002,-0.005,null,0.001,0,0.006,0.01,0.015,0.019,0.023,null,0.028,null,0.034,null,0.042,0.052,0.067,0.097";
                break;
            case 14:
                result="-0.29,-0.15,-0.095,null,-0.05,-0.032,null,-0.016,null,-0.006,0,null,-0.003,-0.006,null,0.001,0,0.007,0.012,0.018,0.023,0.028,null,0.033,null,0.04,null,0.05,0.064,0.09,0.13";
                break;
            case 18:
                result="-0.29,-0.15,-0.095,null,-0.05,-0.032,null,-0.016,null,-0.006,0,null,-0.003,-0.006,null,0.001,0,0.007,0.012,0.018,0.023,0.028,null,0.033,0.039,0.045,null,0.06,0.077,0.108,0.15";
                break;
            case 24:
                result="-0.3,-0.16,-0.11,null,-0.065,-0.04,null,-0.02,null,-0.007,0,null,-0.004,-0.008,null,0.002,0,0.008,0.015,0.022,0.028,0.035,null,0.041,0.047,0.054,0.063,0.073,0.098,0.136,0.188";
                break;
            case 30:
                result="-0.3,-0.16,-0.11,null,-0.065,-0.04,null,-0.02,null,-0.007,0,null,-0.004,-0.008,null,0.002,0,0.008,0.015,0.022,0.028,0.035,0.041,0.048,0.055,0.064,0.075,0.088,0.118,0.16,0.218";
                break;
            case 40:
                result="-0.31,-0.17,-0.12,null,-0.08,-0.05,null,-0.025,null,-0.009,0,null,-0.005,-0.01,null,0.002,0,0.009,0.017,0.026,0.034,0.043,0.048,0.06,0.068,0.08,0.094,0.112,0.148,0.2,0.274";
                break;
            case 50:
                result="-0.32,-0.18,-0.13,null,-0.08,-0.05,null,-0.025,null,-0.009,0,null,-0.005,-0.01,null,0.002,0,0.009,0.017,0.026,0.034,0.043,0.054,0.07,0.081,0.097,0.114,0.136,0.18,0.242,0.325";
                break;
            case 65:
                result="-0.34,-0.19,-0.14,null,-0.1,-0.06,null,-0.03,null,-0.01,0,null,-0.007,-0.012,null,0.002,0,0.011,0.02,0.032,0.041,0.053,0.066,0.087,0.102,0.122,0.144,0.172,0.226,0.3,0.405";
                break;
            case 80:
                result="-0.36,-0.2,-0.15,null,-0.1,-0.06,null,-0.03,null,-0.01,0,null,-0.007,-0.012,null,0.002,0,0.011,0.02,0.032,0.043,0.059,0.075,0.102,0.12,0.146,0.174,0.21,0.274,0.36,0.48";
                break;
            case 100:
                result="-0.38,-0.22,-0.17,null,-0.12,-0.072,null,-0.036,null,-0.012,0,null,-0.009,-0.015,null,0.003,0,0.013,0.023,0.037,0.051,0.071,0.091,0.124,0.146,0.178,0.214,0.258,0.335,0.445,0.585";
                break;
            case 120:
                result="-0.41,-0.24,-0.18,null,-0.12,-0.072,null,-0.036,null,-0.012,0,null,-0.009,-0.015,null,0.003,0,0.013,0.023,0.037,0.054,0.079,0.104,0.144,0.172,0.21,0.254,0.31,0.4,0.525,0.69";
                break;
            case 140:
                result="-0.46,-0.26,-0.2,null,-0.145,-0.085,null,-0.043,null,-0.014,0,null,-0.011,-0.018,null,0.003,0,0.015,0.027,0.043,0.063,0.092,0.122,0.17,0.202,0.248,0.3,0.365,0.47,0.62,0.8";
                break;
            case 160:
                result="-0.52,-0.28,-0.21,null,-0.145,-0.085,null,-0.043,null,-0.014,0,null,-0.011,-0.018,null,0.003,0,0.015,0.027,0.043,0.065,0.1,0.134,0.19,0.228,0.28,0.34,0.415,0.535,0.7,0.9";
                break;
            case 180:
                result="-0.58,-0.31,-0.23,null,-0.145,-0.085,null,-0.043,null,-0.014,0,null,-0.011,-0.018,null,0.003,0,0.015,0.027,0.043,0.068,0.108,0.146,0.21,0.252,0.31,0.38,0.465,0.6,0.78,0.1";
                break;
            case 200:
                result="-0.66,-0.34,-0.24,null,-0.17,-0.1,null,-0.05,null,-0.015,0,null,-0.013,-0.021,null,0.004,0,0.017,0.031,0.05,0.077,0.122,0.166,0.236,0.284,0.35,0.425,0.52,0.67,0.88,1.15";
                break;
            case 225:
                result="-0.74,-0.38,-0.26,null,-0.17,-0.1,null,-0.05,null,-0.015,0,null,-0.013,-0.021,null,0.004,0,0.017,0.031,0.05,0.08,0.13,0.18,0.258,0.31,0.385,0.47,0.575,0.74,0.96,1.25";
                break;
            case 250:
                result="-0.82,-0.42,-0.28,null,-0.17,-0.1,null,-0.05,null,-0.015,0,null,-0.013,-0.021,null,0.004,0,0.017,0.031,0.05,0.084,0.14,0.196,0.284,0.34,0.425,0.52,0.64,0.82,1.05,1.35";
                break;
            case 280:
                result="-0.92,-0.48,-0.3,null,-0.19,-0.11,null,-0.056,null,-0.017,0,null,-0.016,-0.026,null,0.004,0,0.02,0.034,0.056,0.094,0.158,0.218,0.315,0.385,0.475,0.58,0.71,0.92,1.2,1.55";
                break;
            case 315:
                result="-1.05,-0.54,-0.33,null,-0.19,-0.11,null,-0.056,null,-0.017,0,null,-0.016,-0.026,null,0.004,0,0.02,0.034,0.056,0.098,0.17,0.24,0.35,0.425,0.525,0.65,0.79,1,1.3,1.7";
                break;
            case 355:
                result="-1.2,-0.6,-0.36,null,-0.21,-0.125,null,-0.062,null,-0.018,0,null,-0.018,-0.028,null,0.004,0,0.021,0.037,0.062,0.108,0.19,0.268,0.39,0.475,0.59,0.73,0.9,1.15,1.5,1.9";
                break;
            case 400:
                result="-1.35,-0.68,-0.4,null,-0.21,-0.125,null,-0.062,null,-0.018,0,null,-0.018,-0.028,null,0.004,0,0.021,0.037,0.062,0.114,0.208,0.294,0.435,0.53,0.66,0.82,1,1.3,1.65,2.1";
                break;
            case 450:
                result="-1.5,-0.76,-0.44,null,-0.23,-0.135,null,-0.068,null,-0.02,0,null,-0.02,-0.032,null,0.005,0,0.023,0.04,0.068,0.126,0.232,0.33,0.49,0.595,0.74,0.92,1.1,1.45,1.85,2.4";
                break;
            case 500:
                result="-1.65,-0.84,-0.48,null,-0.23,-0.135,null,-0.068,null,-0.02,0,null,-0.02,-0.032,null,0.005,0,0.023,0.04,0.068,0.132,0.252,0.36,0.54,0.66,0.82,1,1.25,1.6,2.1,2.6";
                break;
            case 560:
                result="null,null,-0.52,-0.37,-0.26,-0.145,null,-0.076,null,-0.022,0,null,null,null,null,0,0,0.026,0.044,0.078,0.15,0.28,0.4,0.6,0.74,null,null,null,null,null,null";
                break;
            case 630:
                result="null,null,-0.58,-0.39,-0.26,-0.145,null,-0.076,null,-0.022,0,null,null,null,null,0,0,0.026,0.044,0.078,0.155,0.31,0.45,0.66,0.82,null,null,null,null,null,null";
                break;
            case 710:
                result="null,null,-0.64,-0.43,-0.29,-0.16,null,-0.08,null,-0.024,0,null,null,null,null,0,0,0.03,0.05,0.088,0.175,0.34,0.5,0.74,0.92,null,null,null,null,null,null";
                break;
            case 800:
                result="null,null,-0.7,-0.45,-0.29,-0.16,null,-0.08,null,-0.024,0,null,null,null,null,0,0,0.03,0.05,0.088,0.185,0.38,0.56,0.84,1,null,null,null,null,null,null";
                break;
            case 900:
                result="null,null,-0.78,-0.5,-0.32,-0.17,null,-0.086,null,-0.026,0,null,null,null,null,0,0,0.034,0.056,0.1,0.21,0.43,0.62,0.94,1.15,null,null,null,null,null,null";
                break;
            case 1000:
                result="null,null,-0.86,-0.52,-0.32,-0.17,null,-0.086,null,-0.026,0,null,null,null,null,0,0,0.034,0.056,0.1,0.22,0.47,0.68,1.05,1.3,null,null,null,null,null,null";
                break;
            case 1120:
                result="null,null,-0.94,-0.58,-0.35,-0.195,null,-0.098,null,-0.028,0,null,null,null,null,0,0,0.04,0.066,0.12,0.25,0.52,0.78,1.15,1.45,null,null,null,null,null,null";
                break;
            case 1250:
                result="null,null,-1.05,-0.6,-0.35,-0.195,null,-0.098,null,-0.028,0,null,null,null,null,0,0,0.04,0.066,0.12,0.26,0.58,0.84,1.3,1.6,null,null,null,null,null,null";
                break;
            case 1400:
                result="null,null,-1.15,-0.66,-0.39,-0.22,null,-0.11,null,-0.03,0,null,null,null,null,0,0,0.048,0.078,0.14,0.3,0.64,0.96,1.45,1.8,null,null,null,null,null,null";
                break;
            case 1600:
                result="null,null,-1.3,-0.72,-0.39,-0.22,null,-0.11,null,-0.03,0,null,null,null,null,0,0,0.048,0.078,0.14,0.33,0.72,1.05,1.6,2,null,null,null,null,null,null";
                break;
            case 1800:
                result="null,null,-1.45,-0.78,-0.43,-0.24,null,-0.12,null,-0.032,0,null,null,null,null,0,0,0.058,0.092,0.17,0.37,0.82,1.2,1.85,2.3,null,null,null,null,null,null";
                break;
            case 2000:
                result="null,null,-1.6,-0.82,-0.43,-0.24,null,-0.12,null,-0.032,0,null,null,null,null,0,0,0.058,0.092,0.17,0.4,0.92,1.35,2,2.5,null,null,null,null,null,null";
                break;
            case 2240:
                result="null,null,-1.8,-0.92,-0.48,-0.26,null,-0.13,null,-0.034,0,null,null,null,null,0,0,0.068,0.11,0.195,0.44,1,1.5,2.3,2.8,null,null,null,null,null,null";
                break;
            case 2500:
                result="null,null,-2,-0.98,-0.48,-0.26,null,-0.13,null,-0.034,0,null,null,null,null,0,0,0.068,0.11,0.195,0.46,1.1,1.65,2.5,3.1,null,null,null,null,null,null";
                break;
            case 2800:
                result="null,null,-2.2,-1.05,-0.52,-0.29,null,-0.145,null,-0.038,0,null,null,null,null,0,0,0.076,0.135,0.24,0.55,1.25,1.9,2.9,3.5,null,null,null,null,null,null";
                break;
            case 3150:
                result="null,null,-2.5,-1.15,-0.52,-0.29,null,-0.145,null,-0.038,0,null,null,null,null,0,0,0.076,0.135,0.24,0.58,1.4,2.1,3.2,3.9,null,null,null,null,null,null";
                break;
        }
        return result;
    }
}
