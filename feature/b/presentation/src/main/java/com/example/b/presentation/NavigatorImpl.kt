package com.example.b.presentation

import android.content.Context
import android.content.Intent
import com.example.b.navigation.Feature_B_API
import dagger.hilt.android.qualifiers.ActivityContext
import javax.inject.Inject


internal class NavigatorImpl @Inject constructor(
    @ActivityContext private val context: Context,
) : Feature_B_API.Navigator {

    override fun goToBScreen() {
        context.startActivity(Intent(context, MainActivityB::class.java))
    }
}