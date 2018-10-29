plugins {
    id("com.gradle.build-scan") version "2.0.1"
    id("org.gradle.guides.topical") version "0.15.3"
    id("org.gradle.guides.test-jvm-code") version "0.15.3"
}

repositories {
    maven {
        url = uri("https://repo.gradle.org/gradle/libs")
    }
}

dependencies {
    constraints {
        testImplementation("org.codehaus.groovy:groovy-all:2.4.15")
    }
    testImplementation("org.gradle:sample-check:0.7.0")
    testImplementation(gradleTestKit())
}

guide {
    repoPath = "gradle-guides/building-android-apps"
}

buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"
    if (!System.getenv("CI").isNullOrEmpty()) {
        publishAlways()
        tag("CI")
    }
}
