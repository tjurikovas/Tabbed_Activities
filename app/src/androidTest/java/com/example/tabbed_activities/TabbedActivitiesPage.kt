package com.example.tabbed_activities

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*

class TabbedActivitiesPage {
    fun isElement(): TabbedActivitiesPage {
        Espresso.onView(withId(R.id.view_pager)).check(matches(isDisplayed()))
        return this
    }
}