package com.codeplace.newsappkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform