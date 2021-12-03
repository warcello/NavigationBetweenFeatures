package com.example.navigationexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a.navigation.Feature_A_API
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class StartActivity : AppCompatActivity() {

    @Inject
    lateinit var featureANavigation: Feature_A_API.Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        featureANavigation.goToAScreen()
    }
}