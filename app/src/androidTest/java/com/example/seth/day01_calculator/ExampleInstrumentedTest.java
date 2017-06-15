package com.example.seth.day01_calculator;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    public static final String FirstNumber ="5";
    public static final String SecondNumber = "2";

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAll(){
        //test add
        String resultadd ="7";
        onView(withId(R.id.no_first)).perform(typeText(FirstNumber),closeSoftKeyboard());
        onView(withId(R.id.no_second)).perform(typeText(SecondNumber),closeSoftKeyboard());

        onView(withId(R.id.btn_add)).perform(click());

        onView(withId(R.id.result)).check(matches(withText(resultadd)));

        onView(withId(R.id.no_first)).perform(clearText());
        onView(withId(R.id.no_second)).perform(clearText());

        //test sub
        String resultsub ="3";
        onView(withId(R.id.no_first)).perform(typeText(FirstNumber),closeSoftKeyboard());
        onView(withId(R.id.no_second)).perform(typeText(SecondNumber),closeSoftKeyboard());

        onView(withId(R.id.btn_sub)).perform(click());

        onView(withId(R.id.result)).check(matches(withText(resultsub)));

        onView(withId(R.id.no_first)).perform(clearText());
        onView(withId(R.id.no_second)).perform(clearText());

        //test mul
        String resultmul ="10";
        onView(withId(R.id.no_first)).perform(typeText(FirstNumber),closeSoftKeyboard());
        onView(withId(R.id.no_second)).perform(typeText(SecondNumber),closeSoftKeyboard());

        onView(withId(R.id.btn_mul)).perform(click());

        onView(withId(R.id.result)).check(matches(withText(resultmul)));

        onView(withId(R.id.no_first)).perform(clearText());
        onView(withId(R.id.no_second)).perform(clearText());

        //test dev
        String resultdev ="2.5";
        onView(withId(R.id.no_first)).perform(typeText(FirstNumber),closeSoftKeyboard());
        onView(withId(R.id.no_second)).perform(typeText(SecondNumber),closeSoftKeyboard());

        onView(withId(R.id.btn_dev)).perform(click());

        onView(withId(R.id.result)).check(matches(withText(resultdev)));
    }


    public void testSum(){
        String result ="7";
        onView(withId(R.id.no_first)).perform(typeText(FirstNumber),closeSoftKeyboard());
        onView(withId(R.id.no_second)).perform(typeText(SecondNumber),closeSoftKeyboard());

        onView(withId(R.id.btn_add)).perform(click());

        onView(withId(R.id.result)).check(matches(withText(result)));
    }

    public void testSub(){
        String result ="3";
        onView(withId(R.id.no_first)).perform(typeText(FirstNumber),closeSoftKeyboard());
        onView(withId(R.id.no_second)).perform(typeText(SecondNumber),closeSoftKeyboard());

        onView(withId(R.id.btn_sub)).perform(click());

        onView(withId(R.id.result)).check(matches(withText(result)));
    }

    public void testMul(){
        String result ="10";
        onView(withId(R.id.no_first)).perform(typeText(FirstNumber),closeSoftKeyboard());
        onView(withId(R.id.no_second)).perform(typeText(SecondNumber),closeSoftKeyboard());

        onView(withId(R.id.btn_mul)).perform(click());

        onView(withId(R.id.result)).check(matches(withText(result)));
    }

    public void testDev(){
        String result ="2.5";
        onView(withId(R.id.no_first)).perform(typeText(FirstNumber),closeSoftKeyboard());
        onView(withId(R.id.no_second)).perform(typeText(SecondNumber),closeSoftKeyboard());

        onView(withId(R.id.btn_dev)).perform(click());

        onView(withId(R.id.result)).check(matches(withText(result)));
    }

//    @Test
//    public void useAppContext() throws Exception {
//        // Context of the app under test.
//        Context appContext = InstrumentationRegistry.getTargetContext();
//
//        assertEquals("com.example.seth.day01_calculator", appContext.getPackageName());
//    }
}
