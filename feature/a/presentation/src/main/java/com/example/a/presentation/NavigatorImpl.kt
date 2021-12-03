package com.example.a.presentation

import android.content.Context
import android.content.Intent
import com.example.a.navigation.Feature_A_API
import dagger.hilt.android.qualifiers.ActivityContext
import javax.inject.Inject


internal class NavigatorImpl @Inject constructor(
    @ActivityContext private val context: Context,
) : Feature_A_API.Navigator {

    override fun goToAScreen() {
        context.startActivity(Intent(context, MainActivityA::class.java))
    }
}