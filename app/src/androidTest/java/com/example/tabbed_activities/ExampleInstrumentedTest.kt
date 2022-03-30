package com.example.tabbed_activities

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class LoginTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test fun checkLoginButtonIsDisplayed() {
        TabbedActivitiesPage()
            .isElement()
    }

//    @Test fun checkLoginButtonIsUnable() {
//        onView(withId(R.id.login)).check(matches(not(isEnabled())))
//    }
}

