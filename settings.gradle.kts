
rootProject.name = "sciJava-platform"

pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if(requested.id.id == "sciJava.catalogs")
                useModule("com.github.elect86:sciJava-catalogs:4df6e8b9")
        }
    }
    repositories {
        gradlePluginPortal()
        maven("https://jitpack.io")
    }
}

plugins { id("sciJava.catalogs") }