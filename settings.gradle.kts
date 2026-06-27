pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://reposilite.slne.dev/releases")
        maven("https://maven.fabricmc.net/")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
    id("dev.slne.surf.api.gradle.settings") version "+"
}
include("modern-hide-and-seek-common")
include("modern-hide-and-seek-paper")
include("modern-hide-and-seek-fabric")