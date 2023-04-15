package com.tech.dsa

import android.app.Application
import androidx.room.Room
import com.tech.dsa.data_layer.repo.TaskRepositoryImpl
import com.tech.dsa.data_layer.database.AppDatabase
import com.tech.dsa.playground.quest.DragonSlayQuest
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideDragonSlayQuest(): DragonSlayQuest {
        return DragonSlayQuest()
    }

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Application): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, "task_db").build()
    }

    @Provides
    @Singleton
    fun provideTaskRepo(@ApplicationContext context: Application): TaskRepositoryImpl {
        return TaskRepositoryImpl()
    }


}