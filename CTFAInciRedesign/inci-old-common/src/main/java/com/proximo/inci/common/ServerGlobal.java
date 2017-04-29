package com.proximo.inci.common;


public final class ServerGlobal
{
    // global timer IDs
    public static int LOCK_MONITOR_TIMER = 1;
    public static int SHUTDOWN_MONITOR_TIMER = 2;
    public static int QUIT_APP_TIMER = 3;
    public static int GARBAGE_TIMER = 4;
    public static int KILL_CHECK_TIMER = 5;
    public static int DBCM_MONITOR_TIMER = 6;
    public static int LEASE_MONITOR_TIMER = 7;
    public static int RENEW_PLS_TIMER = 8;

    // DR 6/2/99: the global ApplicationInfo reference
    public static ApplicationInfo appInfo;
}
