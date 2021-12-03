package com.example.b.presentation

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import com.example.a.navigation.Feature_A_API
import com.example.b.presentation.ui.theme.NavigationExampleTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivityB : AppCompatActivity() {

    @Inject
    lateinit var featureANavigator: Feature_A_API.Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Column {
                        Text(text = "Hello in feature B!")
                        Button(onClick = {
                            featureANavigator.goToAScreen()
                        }) {
                            Text(text = "Go To Feature A")
                        }
                    }
                }
            }
        }
    }
}