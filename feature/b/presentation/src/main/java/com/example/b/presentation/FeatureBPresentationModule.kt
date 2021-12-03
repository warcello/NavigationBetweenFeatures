package com.example.b.presentation

import com.example.b.navigation.Feature_B_API
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class FeatureBPresentationModule {

    @Binds
    internal abstract fun bindFeatureANavigation(navigator: NavigatorImpl): Feature_B_API.Navigator

}