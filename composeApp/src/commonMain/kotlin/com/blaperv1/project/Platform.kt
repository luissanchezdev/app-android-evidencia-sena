package com.blaperv1.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform