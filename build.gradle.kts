plugins { `java-platform` }

dependencies {
    constraints {
        api(imagej.bundles.base)
        api(imagej.launcher)
        api(imagej.notebook)
        api(imagej.ops)
        api(imagej.updater)
        api(scifio.scifio)
    }
}