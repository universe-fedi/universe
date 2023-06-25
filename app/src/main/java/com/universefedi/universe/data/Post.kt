package com.universefedi.universe.data

import android.graphics.drawable.Drawable

data class Post(val username: String, val handle: String, val body: String, val userIcon: Drawable?, val canReact: Boolean)
