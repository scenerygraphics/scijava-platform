
pluginManagement {
    repositories {
        gradlePluginPortal()
//        mavenLocal()
        maven("https://raw.githubusercontent.com/kotlin-graphics/mary/master")
    }
}

plugins {
    id("sciJava.catalogs") version "30.0.0+57"
}

rootProject.name = "sciJava-platform"

include("plugin")