package com.example.arms.di.component

import dagger.Component
import com.jess.arms.di.component.AppComponent

import com.example.arms.di.module.SplashModule

import com.jess.arms.di.scope.ActivityScope
import com.example.arms.mvp.ui.activity.SplashActivity

@ActivityScope
@Component(modules = arrayOf(SplashModule::class), dependencies = arrayOf(AppComponent::class))
interface SplashComponent {
    fun inject(activity: SplashActivity)
}
