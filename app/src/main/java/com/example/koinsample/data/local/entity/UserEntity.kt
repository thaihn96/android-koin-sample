package com.example.koinsample.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(
        @PrimaryKey(autoGenerate = true) val id: Int,

        val name: String,

        val email: String
)
