
plugins {
    `kotlin-dsl`
    `java-library`
    `maven-publish`
}

repositories {
    mavenCentral()
}

dependencies {
    //    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
    val catalogs = arrayOf(sciJava, imagej, imgLib2, scifio, fiji, bigDataViewer, trakEM2, n5, boneJ, ome, omero,
                           groovy, apache, batik, commons, eclipseCollections, eclipseSwt, googleCloud, jackson,
                           jetty, jGraphT, jna, jogamp, kotlib, logBack, migLayout, rSyntaxTextArea, slf4j,
                           snakeYAML, tensorFlow, junit5, jmh, misc)
    for (catalog in catalogs)
        implementation(files(catalog.javaClass.superclass.protectionDomain.codeSource.location))
}

group = rootProject.group
version = rootProject.version

publishing {
    repositories {
        maven {
            url = uri("$rootDir/../mary")
        }
    }
}