
plugins {
    `kotlin-dsl`
    `maven-publish`
}

repositories {
    mavenCentral()
}


publishing {
    repositories {
        maven {
            url = uri("$rootDir/../mary")
        }
    }
}