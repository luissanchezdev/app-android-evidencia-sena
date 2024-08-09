package com.blaperv1.project

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hola grupo Blaper, Bienvenidos a  ${platform.name}!"
    }
}