// tag::apply-plugin[]
plugins {
    id("com.android.application")
}
// end::apply-plugin[]

// tag::configure-plugin[]
android {
    compileSdkVersion(26)
    defaultConfig {
        applicationId = "org.gradle.helloworldgradle"
        minSdkVersion(21)
        targetSdkVersion(26)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}
// end::configure-plugin[]

// tag::dependencies[]
dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("com.android.support:appcompat-v7:26.1.0")
    implementation("com.android.support.constraint:constraint-layout:1.0.2")
    testImplementation("junit:junit:4.12")
    androidTestImplementation("com.android.support.test:runner:1.0.1")
    androidTestImplementation("com.android.support.test.espresso:espresso-core:3.0.1")
}
// end::dependencies[]
