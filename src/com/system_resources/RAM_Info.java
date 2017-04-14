
package com.system_resources;

import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;


public class RAM_Info {
    
private static final OperatingSystemMXBean mxbean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        
    public static double getRamPercentUsage(){
            double maxvalue= (mxbean.getTotalPhysicalMemorySize()/1024/1024);
            double current= ((mxbean.getTotalPhysicalMemorySize()-mxbean.getFreePhysicalMemorySize())/1024/1024);
            double percent=(current/maxvalue)*100;
            double result=Math.round(percent*100.0)/100.0;

            return result;
    }
}
