plugins {
    id("dev.slne.surf.api.gradle.paper-plugin")
}

dependencies {
    api(projects.modernHideAndSeekCommon)
}

surfPaperPluginApi {
    mainClass("dev.slne.surf.hns.paper.PaperMain")
    generateLibraryLoader(false)
    foliaSupported(true)

    authors.add("red")
}