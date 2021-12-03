package com.example.a.presentation

import com.example.a.navigation.Feature_A_API
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class FeatureAPresentationModule {

    @Binds
    internal abstract fun bindFeatureANavigation(navigator: NavigatorImpl): Feature_A_API.Navigator

}

@Module
@InstallIn(ViewModelComponent::class)
abstract class FeatureADomainModule {

    @Binds
    internal abstract fun bindFeatureANavigation(navigator: NavigatorImpl): Feature_A_API.Navigator

}