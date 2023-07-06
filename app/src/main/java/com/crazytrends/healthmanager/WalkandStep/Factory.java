
package com.crazytrends.healthmanager.WalkandStep;

import android.content.pm.PackageManager;

import com.crazytrends.healthmanager.WalkandStep.services.AbstractStepDetectorService;
import com.crazytrends.healthmanager.WalkandStep.services.AccelerometerStepDetectorService;
import com.crazytrends.healthmanager.WalkandStep.services.HardwareStepDetectorService;
import com.crazytrends.healthmanager.WalkandStep.utils.AndroidVersionHelper;




public class Factory {



    public static Class<? extends AbstractStepDetectorService> getStepDetectorServiceClass(PackageManager pm){
        if(pm != null && AndroidVersionHelper.supportsStepDetector(pm)) {
            return HardwareStepDetectorService.class;
        }else{
            return AccelerometerStepDetectorService.class;
        }
    }
}
