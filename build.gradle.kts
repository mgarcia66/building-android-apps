plugins {
    id("com.gradle.build-scan") version "2.0.1"
    id("org.gradle.guides.tutorial") version "0.15.1"
}

configure<org.gradle.guides.GuidesExtension> {
    repoPath = "gradle-guides/building-android-apps"
    mainAuthor = "Ken Kousen"
}

buildScan {
    setTermsOfServiceUrl("https://gradle.com/terms-of-service")
    setTermsOfServiceAgree("yes")
    if (!System.getenv("CI").isNullOrEmpty()) {
        publishAlways()
        tag("CI")
    }
}
