package com.example.newsewingworkshop.database

import androidx.room.*

@Dao
interface FieldDao {
    @Query("SELECT * FROM Field")
    fun getAll(): List<Field>

    @Query("SELECT * FROM field WHERE name LIKE :searchQuery OR lastname LIKE :searchQuery")
    fun searchDatabase(searchQuery : String): List<Field>?

    @Insert
    fun insertField(field:Field)

    @Delete
    fun deleteField(field:Field)

    @Update
    fun updateField(field:Field)


    @Query("SELECT * FROM field WHERE id = :id")
    fun getFieldById(id: Int): Field?
}