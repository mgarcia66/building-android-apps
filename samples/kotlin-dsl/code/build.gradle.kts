// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {                 // <1>
    repositories {
        google()
        jcenter()
    }
    dependencies {            // <2>
        classpath("com.android.tool.build:gradle:3.0.1")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle.kts files
    }
}

allprojects {                 // <3>
    repositories {
        google()
        jcenter()
    }
}

task<Delete>("clean") {       // <4>
    delete(rootProject.buildDir)
}
