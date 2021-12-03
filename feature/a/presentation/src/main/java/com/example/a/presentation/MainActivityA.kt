package com.example.a.presentation

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import com.example.b.navigation.Feature_B_API
import com.example.presentation.ui.theme.NavigationExampleTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivityA : AppCompatActivity() {

    @Inject
    lateinit var featureBNavigator: Feature_B_API.Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Column {
                        Text(text = "Hello in feature A!")
                        Button(onClick = {
                            featureBNavigator.goToBScreen()
                        }) {
                            Text(text = "Go To Feature B")
                        }
                    }
                }
            }
        }
    }
}