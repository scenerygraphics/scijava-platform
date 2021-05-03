
pluginManagement {
    repositories {
        gradlePluginPortal()
//        mavenLocal()
        maven("https://raw.githubusercontent.com/kotlin-graphics/mary/master")
    }
}

enableFeaturePreview("VERSION_CATALOGS")

plugins {
    id("sciJava.catalogs") version "30.0.0+61"
}

rootProject.name = "sciJava-platform"

include("platform")