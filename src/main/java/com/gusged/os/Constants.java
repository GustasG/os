package com.gusged.os;

public class Constants {
    public static final int PAGE_SIZE = 256;
    public static final int PAGE_COUNT = 1024;
    public static final int DATA_SEGMENT_START = 0;
    public static final int DATA_SEGMENT_SIZE = 5;
    public static final int CODE_SEGMENT_START = 5 * PAGE_SIZE;
    public static final int CODE_SEGMENT_SIZE = 7;
    public static final int STACK_SEGMENT_START = 12 * PAGE_SIZE;
    public static final int STACK_SEGMENT_SIZE = 4;
}