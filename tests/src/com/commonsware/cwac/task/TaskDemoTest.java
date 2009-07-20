package com.commonsware.cwac.task;

import android.test.ActivityInstrumentationTestCase;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.commonsware.cwac.task.TaskDemoTest \
 * com.commonsware.cwac.task.tests/android.test.InstrumentationTestRunner
 */
public class TaskDemoTest extends ActivityInstrumentationTestCase<TaskDemo> {

    public TaskDemoTest() {
        super("com.commonsware.cwac.task", TaskDemo.class);
    }

}
