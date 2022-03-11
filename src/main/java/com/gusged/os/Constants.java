package com.gusged.os;

public class Constants {
    public static final int PAGE_SIZE = 256;
    public static final int PAGE_COUNT = 1024;
    public static final int DATA_SEGMENT_START = 0;
    public static final int DATA_SEGMENT_PAGE_COUNT = 5;
    public static final int DATA_SEGMENT_SIZE = DATA_SEGMENT_PAGE_COUNT * PAGE_SIZE;
    public static final int CODE_SEGMENT_START = DATA_SEGMENT_PAGE_COUNT * PAGE_SIZE;
    public static final int CODE_SEGMENT_PAGE_COUNT = 7;
    public static final int CODE_SEGMENT_SIZE = CODE_SEGMENT_PAGE_COUNT * PAGE_SIZE;
    public static final int STACK_SEGMENT_START = (DATA_SEGMENT_PAGE_COUNT + CODE_SEGMENT_PAGE_COUNT) * PAGE_SIZE;
    public static final int STACK_SEGMENT_PAGE_COUNT = 4;
    public static final int STACK_SEGMENT_SIZE = STACK_SEGMENT_PAGE_COUNT * PAGE_SIZE;
    public static final int VIRTUAL_MACHINE_PAGE_COUNT = DATA_SEGMENT_PAGE_COUNT + CODE_SEGMENT_PAGE_COUNT + STACK_SEGMENT_PAGE_COUNT;
}