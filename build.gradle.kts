plugins {
    id("com.gradle.build-scan") version "2.0.1"
    id("org.gradle.guides.base") version "0.15.3"
}

configure<org.gradle.guides.GuidesExtension> {
    repoPath = "gradle-guides/building-android-apps"
    mainAuthor = "Ken Kousen"
}

buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"
    if (!System.getenv("CI").isNullOrEmpty()) {
        publishAlways()
        tag("CI")
    }
}
