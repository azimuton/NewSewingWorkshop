package com.example.newsewingworkshop.database

import android.content.Context
import androidx.room.AutoMigration
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase


@Database(entities = arrayOf(Field::class), version = 1)
    abstract class AppDatabase : RoomDatabase() {
        abstract fun fieldDao(): FieldDao

        companion object {
            @Volatile
            private var INSTANCE: AppDatabase? = null

//            val MIGRATION_1_2 = object : Migration(1, 2) {
//                override fun migrate(database: SupportSQLiteDatabase) {
//                    database.execSQL("DROP TABLE IF EXISTS `profile`")
//                    database.execSQL("CREATE TABLE IF NOT EXISTS `profile`(name)")
//                }
//            }
            fun getDatabase(context: Context): AppDatabase {
                return INSTANCE ?: synchronized(this) {
                    val instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "field_database")
                        //.addMigrations(MIGRATION_1_2)
                        .allowMainThreadQueries()
                        .build()
                    INSTANCE = instance
                    instance
                }
            }
        }
    }


