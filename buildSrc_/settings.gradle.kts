
pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://raw.githubusercontent.com/kotlin-graphics/mary/master")
    }
}

plugins {
    id("sciJava.catalogs") version "30.0.0+1"
}

//includeBuild("/home/elect/IdeaProjects/sciJava-catalogs")

rootProject.name = "buildSrc"

enableFeaturePreview("VERSION_CATALOGS")