 pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ScribbleDash"
 enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
 include(":app")
include(":core")
include(":core:presentation")
include(":core:domain")
include(":core:data")
include(":home")
include(":home:presentation")
include(":home:domain")
include(":home:data")
include(":draw")
include(":draw:presentation")
include(":draw:domain")
include(":draw:data")
