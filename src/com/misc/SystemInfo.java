
package com.misc;
//GETS DATA FROM SYSTEM / WINDOWS 7 TESTED

public class SystemInfo {

    private final Runtime runtime = Runtime.getRuntime();
    public static String OSname() {
        return System.getProperty("os.name");
    }

    public static String OSversion() {
        return System.getProperty("os.version");
    }
    //RETURNS SYSTEM ARCHITECTURE
    public static String getRealArchWindows(){
            String arch = System.getenv("PROCESSOR_ARCHITECTURE");
            String wow64Arch = System.getenv("PROCESSOR_ARCHITEW6432");
            String realArch = arch.endsWith("64")|| wow64Arch != null && wow64Arch.endsWith("64")? "64" : "32";
        return realArch;
    }
    //ARCHITECTURE OF JVM INSTALLED CAN RETURN 32BIT FOR 64 BIT SYSTEMS
    public static String OsArch() {
        return System.getProperty("os.arch");
    }
    //JVM TOTAL MEMORY
    public static long totalMem() {
        return Runtime.getRuntime().totalMemory();
    }
    //JVM FREE MEMORY
    public static long usedMem() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

}
