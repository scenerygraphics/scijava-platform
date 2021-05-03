
package sciJava

import org.gradle.accessors.dm.*
import org.gradle.kotlin.dsl.`java-library`

plugins {
    `java-library`
}

//val libs = the<LibrariesForLibs>()
//println("from pre compiled script plugin: ${libs.versions.bb.get()}")
val sciJava = the<LibrariesForSciJava>()
val imagej = the<LibrariesForImagej>()
val imgLib2 = the<LibrariesForImgLib2>()
val scifio = the<LibrariesForScifio>()
val fiji = the<LibrariesForFiji>()
val bigDataViewer = the<LibrariesForBigDataViewer>()
val trakEM2 = the<LibrariesForTrakEM2>()
val n5 = the<LibrariesForN5>()
val boneJ = the<LibrariesForBoneJ>()
val ome = the<LibrariesForOme>()
val omero = the<LibrariesForOmero>()
val groovy = the<LibrariesForGroovy>()
val apache = the<LibrariesForApache>()
val batik = the<LibrariesForBatik>()
val commons = the<LibrariesForCommons>()
val eclipseCollections = the<LibrariesForEclipseCollections>()
val eclipseSwt = the<LibrariesForEclipseSwt>()
val googleCloud = the<LibrariesForGoogleCloud>()
val jackson = the<LibrariesForJackson>()
val jetty = the<LibrariesForJetty>()
val jGraphT = the<LibrariesForJGraphT>()
val jna = the<LibrariesForJna>()
val jogamp = the<LibrariesForJogamp>()
val kotlib = the<LibrariesForKotlib>()
val logBack = the<LibrariesForLogBack>()
val migLayout = the<LibrariesForMigLayout>()
val rSyntaxTextArea = the<LibrariesForRSyntaxTextArea>()
val slf4j = the<LibrariesForSlf4j>()
val snakeYAML = the<LibrariesForSnakeYAML>()
val tensorFlow = the<LibrariesForTensorFlow>()
val junit5 = the<LibrariesForJunit5>()
val jmh = the<LibrariesForJmh>()
val misc = the<LibrariesForMisc>()

//println("platform")

dependencies {

    constraints {

        implementation(sciJava.bundles.all)
        implementation(imagej.bundles.all)
        implementation(imgLib2.bundles.all)
        implementation(scifio.bundles.all)
        implementation(fiji.bundles.all)
        implementation(bigDataViewer.bundles.all)
        implementation(trakEM2.bundles.all)
        implementation(n5.bundles.all)
        implementation(boneJ.bundles.all)
        implementation(ome.bundles.all)
        implementation(omero.bundles.all)
        implementation(groovy.bundles.all)
        implementation(apache.bundles.all)
        implementation(batik.bundles.all)
        implementation(commons.bundles.all)
        implementation(eclipseCollections.bundles.all)
        implementation(eclipseSwt.bundles.all)
        implementation(googleCloud.bundles.all)
        implementation(jackson.bundles.all)
        implementation(jetty.bundles.all)
        implementation(jGraphT.bundles.all)
        implementation(jna.bundles.all)
        implementation(jogamp.bundles.all)
        implementation(kotlib.bundles.all)
        implementation(logBack.bundles.all)
        implementation(migLayout.bundles.all)
        implementation(rSyntaxTextArea.bundles.all)
        implementation(slf4j.bundles.all)
        implementation(snakeYAML.bundles.all)
        implementation(tensorFlow.bundles.all)
        implementation(junit5.bundles.all)
        implementation(jmh.bundles.all)
        implementation(misc.bundles.all)

        testImplementation(sciJava.bundles.all)
        testImplementation(imagej.bundles.all)
        testImplementation(imgLib2.bundles.all)
        testImplementation(scifio.bundles.all)
        testImplementation(fiji.bundles.all)
        testImplementation(bigDataViewer.bundles.all)
        testImplementation(trakEM2.bundles.all)
        testImplementation(n5.bundles.all)
        testImplementation(boneJ.bundles.all)
        testImplementation(ome.bundles.all)
        testImplementation(omero.bundles.all)
        testImplementation(groovy.bundles.all)
        testImplementation(apache.bundles.all)
        testImplementation(batik.bundles.all)
        testImplementation(commons.bundles.all)
        testImplementation(eclipseCollections.bundles.all)
        testImplementation(eclipseSwt.bundles.all)
        testImplementation(googleCloud.bundles.all)
        testImplementation(jackson.bundles.all)
        testImplementation(jetty.bundles.all)
        testImplementation(jGraphT.bundles.all)
        testImplementation(jna.bundles.all)
        testImplementation(jogamp.bundles.all)
        testImplementation(kotlib.bundles.all)
        testImplementation(logBack.bundles.all)
        testImplementation(migLayout.bundles.all)
        testImplementation(rSyntaxTextArea.bundles.all)
        testImplementation(slf4j.bundles.all)
        testImplementation(snakeYAML.bundles.all)
        testImplementation(tensorFlow.bundles.all)
        testImplementation(junit5.bundles.all)
        testImplementation(jmh.bundles.all)
        testImplementation(misc.bundles.all)
    }
}