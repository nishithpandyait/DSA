package com.tech.dsa

import com.tech.dsa.playground.quest.DragonSlayQuest
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideDragonSlayQuest(): DragonSlayQuest {
        return DragonSlayQuest()
    }


}