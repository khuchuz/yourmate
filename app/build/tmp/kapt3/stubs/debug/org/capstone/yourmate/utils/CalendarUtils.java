package org.capstone.yourmate.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lorg/capstone/yourmate/utils/CalendarUtils;", "", "()V", "Companion", "app_debug"})
public abstract class CalendarUtils {
    @org.jetbrains.annotations.NotNull()
    public static final org.capstone.yourmate.utils.CalendarUtils.Companion Companion = null;
    
    /**
     * Represent date as YEAR-MONTH-DATE
     * Example: 2022-01-31
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String YEAR_MONTH_DATE = "yyyy-MM-dd";
    
    /**
     * Represent date as ISO-8601 representation
     * Example: 2022-03-27T17:00:00.000000Z
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ISO_8601 = "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'";
    
    /**
     * Represent date as DATE-MONTH-YEAR in human readable representation
     * Example: 28 March 2022
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATE_MONTH_YEAR_READABLE = "dd MMMM yyyy";
    
    /**
     * Represent date as DATE-MONTH-YEAR in human readable representation
     * Example: 28 March 2022, 13:00
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATE_MONTH_YEAR_WITH_TIME_READABLE = "dd MMMM yyyy, HH:mm";
    
    /**
     * Represent date as HOUR:MINUTE in human readable representation
     * Example: 13:00
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TIME_READABLE = "HH:mm";
    
    public CalendarUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0004J\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/capstone/yourmate/utils/CalendarUtils$Companion;", "", "()V", "DATE_MONTH_YEAR_READABLE", "", "DATE_MONTH_YEAR_WITH_TIME_READABLE", "ISO_8601", "TIME_READABLE", "YEAR_MONTH_DATE", "formatCalendarToString", "calendar", "Ljava/util/Calendar;", "pattern", "formatStringToCalendar", "string", "formatTimeInMilliesToCalendar", "timeInMillies", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String formatCalendarToString(@org.jetbrains.annotations.NotNull()
        java.util.Calendar calendar, @org.jetbrains.annotations.NotNull()
        java.lang.String pattern) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Calendar formatStringToCalendar(@org.jetbrains.annotations.NotNull()
        java.lang.String string, @org.jetbrains.annotations.NotNull()
        java.lang.String pattern) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Calendar formatTimeInMilliesToCalendar(long timeInMillies) {
            return null;
        }
    }
}